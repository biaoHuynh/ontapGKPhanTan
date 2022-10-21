package dao;

import java.util.ArrayList;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

import Entity.Customer;
import Util.AtlasMongoClient;

public class CustomerDao {
	private MongoCollection<Document> cusCol;

	public CustomerDao() {
		cusCol = AtlasMongoClient.getInstane().getMongoClient().getDatabase("BikeStores").getCollection("customers");
		
	}

	public java.util.List<Document> getAllCus() {
		return cusCol.find().into(new ArrayList<Document>());
	}

	public void insertCus(Customer cus) {
		Document address = new Document().append("city", cus.getAddress().getCity())
				.append("state", cus.getAddress().getState()).append("street", cus.getAddress().getStreet())
				.append("zop_code", cus.getAddress().getZipCode());
		Document phone = new Document().append("number", cus.getPhone().getNumber()).append("type",
				cus.getPhone().getType());
		Document docCus = new Document();
		try {
			docCus.append("_id", cus.getCustomerID()).append("address", address).append("email", cus.getEmail())
					.append("first_name", cus.getFistName()).append("last_name", cus.getLastName())
					.append("phones", phone).append("registration_date", cus.getRegistrationDate());
			cusCol.insertOne(docCus);
			System.out.println("Success");
		} catch (Exception e) {
			System.out.println("Fail");
		}
	}

	public void updateCus(Customer cus) {
		Bson fil = Filters.eq("_id", cus.getCustomerID());

		Bson addressUpdate = Updates.combine(Updates.set("city", cus.getAddress().getCity()),
				Updates.set("state", cus.getAddress().getState()), Updates.set("street", cus.getAddress().getStreet()),
				Updates.set("zop_code", cus.getAddress().getZipCode()));
		Bson phoneUpdate = Updates.combine(Updates.set("number", cus.getPhone().getNumber()),
				Updates.set("type", cus.getPhone().getType()));
		try {
			Bson cusUpdate = Updates.combine(Updates.set("address", addressUpdate),
					Updates.set("email", cus.getEmail()), Updates.set("first_name", cus.getFistName()),
					Updates.set("last_name", cus.getLastName()), Updates.set("phones", phoneUpdate),
					Updates.set("registration_date", cus.getRegistrationDate()));
			cusCol.updateOne(fil, cusUpdate);
			System.out.println("Success");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail");
		}
	}
	public void deleteCus(String id) {
		Bson fil = Filters.eq("_id", id);
		try {
			cusCol.findOneAndDelete(fil);
			System.out.println("Success");
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail");
		}
	}

}

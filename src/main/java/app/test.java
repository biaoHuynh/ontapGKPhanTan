package app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.Document;

import Entity.Address;
import Entity.Customer;
import Entity.Phone;
import dao.CustomerDao;

public class test {
	public static void main(String[] args) {
		CustomerDao cusDao = new CustomerDao();
		List<Document> lstCus = new ArrayList<Document>();
//		MongoClient mongoClient = AtlasMongoClient.getInstane().getMongoClient();
//		mongoClient.listDatabaseNames().forEach(dbName -> System.out.println(dbName));
		
//		cusDao.getAllCus().forEach(cus -> System.out.println(cus));
		long millis=System.currentTimeMillis();  
		Date date=new java.sql.Date(millis);
		cusDao.updateCus(new Customer("ID2205", "Anh", "Nguyen", "anhnguyen@gmail.com", date,new Phone("Moblie","0123456789"), new Address("Quan 12", "VN", "Ha Huy Giap", 727214)));
//		cusDao.updateCus(new Customer("ID2911", "Sy", "Tran", "sytranvan2205@gmail.com", date,new Phone("Moblie","0822159420"), new Address("Ho Chi Minh", "VN", "Phan Van Tri", 727214)));
		//cusDao.deleteCus("ID2205");
	}
}

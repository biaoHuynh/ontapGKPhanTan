package Util;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class AtlasMongoClient {
	private static AtlasMongoClient instane = null;
	private MongoClient mongoClient;
	private AtlasMongoClient() {
		mongoClient = MongoClients.create();
	}
	public static synchronized AtlasMongoClient getInstane() {
		if(instane == null)
			instane = new AtlasMongoClient();
		return instane;
	}
	public MongoClient getMongoClient() {
		return mongoClient;
	}
	
}

package db;

import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import com.google.gson.*;

import java.util.Iterator;

import static spark.Spark.*;

public class DatabaseHandler {

    DB m_database;

    public DatabaseHandler() {

    }

    public void initialize(){
        String host = "192.168.0.67"; //Uriel's ip  
        int port = 27017;
        String databaseName = "melechdb";
        MongoClient mongo = new MongoClient(host, port);
        // Accessing the database
        m_database = mongo.getDB(databaseName );
        System.out.println("Connected to database successfully");
    }

    public void getUserSchedules(){
        DBCollection collection = m_database.getCollection("Schedules");
        get("/get-schedules/:username", (request, response) -> {
            response.type("application/json");
            String username = request.params(":username");
            BasicDBObject whereQuery = new BasicDBObject();
            whereQuery.put("username", username);
            DBCursor cursor = collection.find(whereQuery);
            String allDocuments= "";
            while(cursor.hasNext()) {
                allDocuments = allDocuments.concat(cursor.next().toString());
            }
            return allDocuments;
        });

    }
}

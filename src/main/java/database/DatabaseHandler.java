package database;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Iterator;

import static spark.Spark.*;

public class DatabaseHandler {

    MongoDatabase m_database;

    public DatabaseHandler() {

    }

    public void initialize(){
        String host = "192.168.0.67";
        int port = 27017;
        String databaseName = "melechdb";

        MongoClient mongo = new MongoClient(host, port);
        // Accessing the database
        m_database= mongo.getDatabase(databaseName);
        System.out.println("Connected to database successfully");
    }

    public void getAllDocuments(){
        get("/all/:collectionName", (request, response) -> {
            String collectionName = request.params(":collectionName");
            MongoCollection<Document> collection = m_database.getCollection(collectionName);
            System.out.println("Collection " + collectionName + " selected successfully");
            // Getting the iterable object
            FindIterable<Document> iterDoc = collection.find();
            // Getting the iterator
            Iterator it = iterDoc.iterator();
            String allDocuments= "";
            while (it.hasNext()) {
                allDocuments = allDocuments.concat(it.next().toString());
            }

            return allDocuments;
        });
    }
}

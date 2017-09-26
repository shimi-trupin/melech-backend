import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;


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

}

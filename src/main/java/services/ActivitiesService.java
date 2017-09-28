package services;

import com.mongodb.MongoClient;
import models.Activities;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import java.util.List;

public class ActivitiesService {

    String host = "localhost";
    int port = 27017;
    String dbName = "melechdb";

    MongoClient client = new MongoClient(host, port); //connect to mongodb
    Datastore datastore = new Morphia().createDatastore(client, dbName);

    public String addActivity(Activities activity){
        datastore.save(activity);
        return "activity added";
    }

    public List<Activities> getAllActivities(){
        List<Activities> list = datastore.find(Activities.class).asList();
        if(list != null){
            return list;
        }
        return null;
    }
}

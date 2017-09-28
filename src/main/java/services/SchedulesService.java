package services;

import com.mongodb.MongoClient;
import models.Schedules;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import java.util.List;

public class SchedulesService {

    String host = "192.168.0.67"; //Uriel's ip
    int port = 27017;
    String dbName = "melechdb";

    MongoClient client = new MongoClient(host, port); //connect to mongodb
    Datastore datastore = new Morphia().createDatastore(client, dbName);

    public String addSchedule(Schedules schedule){
        datastore.save(schedule);
        return "schedule added";
    }

    public List<Schedules> getAllSchedules(){
        List<Schedules> list = datastore.find(Schedules.class).asList();
        if(list != null){
            return list;
        }
        return null;
    }
}

package services;

import com.mongodb.MongoClient;
import models.Stations;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import java.util.List;

public class StationsService {

    String host = "localhost";
    int port = 27017;
    String dbName = "melechdb";

    MongoClient client = new MongoClient(host, port); //connect to mongodb
    Datastore datastore = new Morphia().createDatastore(client, dbName);

    public String addStation(Stations station){
        datastore.save(station);
        return "station added";
    }

    public List<Stations> getAllStations(){
        List<Stations> list = datastore.find(Stations.class).asList();
        if(list != null){
            return list;
        }
        return null;
    }
}

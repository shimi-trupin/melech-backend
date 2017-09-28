package services;

import com.mongodb.MongoClient;
import models.Qualifications;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import java.util.List;

public class QualificationsService {

    String host = "localhost";
    int port = 27017;
    String dbName = "melechdb";

    MongoClient client = new MongoClient(host, port); //connect to mongodb
    Datastore datastore = new Morphia().createDatastore(client, dbName);

    public String addQualification(Qualifications qualification){
        datastore.save(qualification);
        return "qualification added";
    }

    public List<Qualifications> getAllQualifications(){
        List<Qualifications> list = datastore.find(Qualifications.class).asList();
        if(list != null){
            return list;
        }
        return null;
    }
}

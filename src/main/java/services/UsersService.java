package services;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import com.mongodb.MongoClient;


import models.*;


import java.util.List;

public class UsersService {

    String host = "localhost";
    int port = 27017;
    String dbName = "melechdb";

    MongoClient client = new MongoClient(host, port); //connect to mongodb
    Datastore datastore = new Morphia().createDatastore(client, dbName);

    public String addUser(Users users){
        datastore.save(users);
        return "user added";
    }

    public List<Users> getAllUsers(){
        List<Users> list = datastore.find(Users.class).asList();
        if(list != null){
            return list;
        }
        return null;
    }
}

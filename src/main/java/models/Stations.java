package models;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;

public class Stations {

    @Id
    private ObjectId _id;
    private String station_name;
    private String qualification_name;
    private String user_type;
    private String startTime;
    private String endTime;
}

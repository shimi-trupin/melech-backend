package models;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity
public class Activities {

    @Id
    private ObjectId _id;
    private String activity_name;
    private String activity_type;
    private String startTime;
    private String endTime;
}

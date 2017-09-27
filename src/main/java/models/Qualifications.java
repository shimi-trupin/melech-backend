package models;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity
public class Qualifications {

    @Id
    private ObjectId _id;
    private String qualification_name;
    private String qualification_date;
    private String quadron_relevance;
}

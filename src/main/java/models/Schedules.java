package models;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity
public class Schedules {

  @Id
  private ObjectId _id;
  private String schedule_name;
  private String schedule_type;
  private int userId;
  private String startTime;
  private String endTime;

}

package models;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.Comparator;

@Entity
public class Activities implements Comparator<Activities>, Comparable<Activities>{

    @Id
    public ObjectId _id;
    public String activity_name;
    public String activity_type;
    public String startTime;
    public String endTime;

    @Override
    public int compareTo(Activities o) {
        int first_start_time = Integer.valueOf(o.startTime.substring(o.startTime.length()-2, o.startTime.length()));
        int first_end_time = Integer.valueOf(o.endTime.substring(o.endTime.length()-2, o.endTime.length()));
        int first_interval = first_end_time - first_start_time;
        int sec_start_time = Integer.valueOf(this.startTime.substring(this.startTime.length()-2, this.startTime.length()));
        int sec_end_time = Integer.valueOf(this.endTime.substring(this.endTime.length()-2, this.endTime.length()));
        int sec_interval = sec_end_time - sec_start_time;

        return(first_interval - sec_interval);
    }

    @Override
    public int compare(Activities o1, Activities o2) {
        return o1.compareTo(o2);
    }
}

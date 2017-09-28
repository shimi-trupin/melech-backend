package Algorithm;

import models.Activities;
import models.Stations;
import services.*;

import java.util.Collections;
import java.util.List;

public class SchedulingAlgorithm {

    public static UsersService usersService = new UsersService();
    public static QualificationsService qualificationsService = new QualificationsService();
    public static SchedulesService schedulesService = new SchedulesService();
    public static ActivitiesService activitiesService = new ActivitiesService();
    public static StationsService stationsService = new StationsService();

    public static List<Activities> activities = activitiesService .getAllActivities();
    public  static List<Stations> stations = stationsService .getAllStations();

    public SchedulingAlgorithm() {
    }

    public void run(){
        /*activities.forEach(activity -> {

        });*/

        Collections.sort(activities, );
    }
}

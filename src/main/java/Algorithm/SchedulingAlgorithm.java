package Algorithm;

import models.Activities;
import models.Stations;
import services.*;

import java.util.List;

public class SchedulingAlgorithm {

    public static UsersService usersService = new UsersService();
    public static QualificationsService qualificationsService = new QualificationsService();
    public static SchedulesService schedulesService = new SchedulesService();
    public static ActivitiesService activitiesService = new ActivitiesService();
    public static StationsService stationsService = new StationsService();

    List<Activities> activities = activitiesService .getAllActivities();
    List<Stations> stations = stationsService .getAllStations();

    /*for (Activities activity : activities) {
        int availablePeople = stations.size();
        int availablePeopleStation = 0

        for (Stations station: stations) {

        }
    }*/


}

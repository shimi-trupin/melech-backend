/**
 * Created by shimi on 26/09/2017.
 * just for test
 */
import static spark.Spark.*;

import com.google.gson.*;
import models.Qualifications;
import models.Users;
import models.Schedules;
import models.Activities;
import models.Stations;
import services.*;

public class Main {

    public static UsersService usersService = new UsersService();
    public static QualificationsService qualificationsService = new QualificationsService();
    public static SchedulesService schedulesService = new SchedulesService();
    public static ActivitiesService activitiesService = new ActivitiesService();
    public static StationsService stationsService = new StationsService();



    public static void main(String[] args) {
        System.out.println("Hello World!");
        get("/hello", (req, res) -> "Hello World");

        Gson gson = new Gson();
        post("/add-user", (req, res) -> {
            res.type("application/json");
            Users users = gson.fromJson(req.body(), Users.class);
            return usersService.addUser(users);
        }, gson ::toJson);

        get("/all/users", (req, res) -> {
            res.type("application/json");
            return usersService.getAllUsers();
        }, gson ::toJson);

        post("/add-qualification", (req, res) -> {
            res.type("application/json");
            Qualifications qualifications = gson.fromJson(req.body(), Qualifications.class);
            return qualificationsService .addQualification(qualifications);
        }, gson ::toJson);

        get("/all/qualifications", (req, res) -> {
            res.type("application/json");
            return qualificationsService .getAllQualifications();
        }, gson ::toJson);

        post("/add-schedule", (req, res) -> {
            res.type("application/json");
            Schedules schedules = gson.fromJson(req.body(), Schedules.class);
            return schedulesService .addSchedule(schedules);
        }, gson ::toJson);

        get("/all/schedules", (req, res) -> {
            res.type("application/json");
            return schedulesService .getAllSchedules();
        }, gson ::toJson);

        post("/add-activity", (req, res) -> {
            res.type("application/json");
            Activities activities = gson.fromJson(req.body(), Activities.class);
            return activitiesService .addActivity(activities);
        }, gson ::toJson);

        get("/all/activities", (req, res) -> {
            res.type("application/json");
            return activitiesService .getAllActivities();
        }, gson ::toJson);

        post("/add-station", (req, res) -> {
            res.type("application/json");
            Stations station = gson.fromJson(req.body(), Stations.class);
            return stationsService .addStation(station);
        }, gson ::toJson);

        get("/all/stations", (req, res) -> {
            res.type("application/json");
            return stationsService .getAllStations();
        }, gson ::toJson);
    }
}

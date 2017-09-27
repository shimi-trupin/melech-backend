/**
 * Created by shimi on 26/09/2017.
 * just for test
 */
import static spark.Spark.*;

import com.google.gson.*;
import models.Users;
import services.UsersService;

public class Main {

    public static UsersService usersService = new UsersService();

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

        get("/all/schedules", (req, res) -> {
            res.type("application/json");
            return usersService.getAllUsers();
        }, gson ::toJson);
    }
}

/**
 * Created by shimi on 26/09/2017.
 * just for test
 */
import static spark.Spark.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        get("/hello", (req, res) -> "Hello World");
    }
}

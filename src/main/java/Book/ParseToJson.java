package Course;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;

public class ParseToJson {
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    public static String parse(ArrayList<Course> courses){
        String content = gson.toJson(courses);
        System.out.println();
        System.out.println("All course: ");
        System.out.println(courses.toString());
        return content;
    }
}
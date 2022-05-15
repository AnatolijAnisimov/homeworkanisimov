package loophomework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Students {
    @Test
    public void loopsStudents() {
        List<String> studentNames = new ArrayList<>();

        studentNames.add("Dmitry");
        studentNames.add("Svetlana");
        studentNames.add("Darja");

        studentNames.add("Sergey");
        studentNames.add("Anna");
        studentNames.add("Denis");
        studentNames.add("Anton");
        studentNames.add("Timur");

        String firstcourse = "qa1";
        String secondcourse = "qa2";


        for (int i = 0; i < studentNames.size(); i++) {
            System.out.println(i + "." + studentNames.get(i));
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(studentNames.get(i)+" study in "+ (firstcourse));
        }

        for (int i = 4; i <studentNames.size(); i++) {
            System.out.println(studentNames.get(i)+" study in "+ (secondcourse));
        }
    }

}

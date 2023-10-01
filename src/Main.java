import modules.course.model.Course;
import modules.mentoring.model.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("Course 01");
        course1.setDescription("Description 01 ");
        course1.setWorkload(8);

        Course course2 = new Course();
        course2.setTitle("Course 02");
        course2.setDescription("Description 02 ");
        course2.setWorkload(4);
        System.out.println(course1);
        System.out.println(course2);

        Mentoring mentoring1 = new Mentoring();
        mentoring1.setTitle("Mentoring 01");
        mentoring1.setDescription("Description Mentoring 01");
        mentoring1.setCreatedAt(LocalDate.now());

        Mentoring mentoring2 = new Mentoring();
        mentoring2.setTitle("Mentoring 02");
        mentoring2.setDescription("Description Mentoring 02");
        mentoring2.setCreatedAt(LocalDate.now());

        System.out.println(mentoring1);
        System.out.println(mentoring2);
    }
}
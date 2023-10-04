import modules.bootcamp.model.Bootcamp;
import modules.content.model.Content;
import modules.course.model.Course;
import modules.dev.model.Dev;
import modules.mentoring.model.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("Course 01");
        course1.setDescription("Description 01 ");
        course1.setWorkload(8);
        course1.calcXp();

        Course course2 = new Course();
        course2.setTitle("Course 02");
        course2.setDescription("Description 02 ");
        course2.setWorkload(4);
        course1.calcXp();

        //System.out.println(course1);
        //System.out.println(course2);

        Mentoring mentoring1 = new Mentoring();
        mentoring1.setTitle("Mentoring 01");
        mentoring1.setDescription("Description Mentoring 01");
        mentoring1.setCreatedAt(LocalDate.now());
        mentoring1.calcXp();

        Mentoring mentoring2 = new Mentoring();
        mentoring2.setTitle("Mentoring 02");
        mentoring2.setDescription("Description Mentoring 02");
        mentoring2.setCreatedAt(LocalDate.now());
        mentoring2.calcXp();

        //System.out.println(mentoring1);
        //System.out.println(mentoring2);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp 01");
        bootcamp.setDescription("Bootcamp description 01");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentoring1);

        Dev dev1 = new Dev();
        dev1.setName("Claudio Cardoso");
        dev1.registered(bootcamp);
        dev1.progression();
        dev1.progression();
        dev1.progression();
        System.out.println("XP" + dev1.calcTotalXp());
        System.out.println("---");
        System.out.println("Conteudo inscritos: " + dev1.getRegistered());
        System.out.println("Conteudo Concluidos: " + dev1.getCompleted());

        System.out.println("-----------------");

        Dev dev2= new Dev();
        dev2.setName("Kaike Cardoso");
        dev2.registered(bootcamp);
        dev2.progression();
        System.out.println("XP" + dev2.calcTotalXp());
        System.out.println("---");
        System.out.println("Conteudo inscritos: " + dev2.getRegistered());
        System.out.println("Conteudo Concluidos: " + dev2.getCompleted());
    }
}
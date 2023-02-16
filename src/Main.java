import bootcamp.dominio.*;
import bootcamp.dominio.Class;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        course.setTitle("Curso Java");
        course.setDescription("Descrição do curso Java");
        course.setHoursClass(10);

        Course course1 = new Course();
        course1.setTitle("Curso JS");
        course1.setDescription("Descrição do curso JS");
        course1.setHoursClass(5);

        Subject subject = new Course();

        Class class1 = new Class();
        class1.setTitle("Mentoria Java");
        class1.setDescription("Descrição da mentira Java");
        class1.setDate(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("BootCamp 1");
        bootcamp.setDescription("Primeiro BootCamp");
        bootcamp.getSubjects().add(course);
        bootcamp.getSubjects().add(course1);
        bootcamp.getSubjects().add(class1);

        Dev devJoao = new Dev();
        devJoao.setName("João Carlos");
        devJoao.subscribedBootcamp(bootcamp);
        System.out.println("Counteúdos inscritos de João: "+ devJoao.getSubscribedSubjects());
        devJoao.progress();

        devJoao.progress();
        System.out.println("Counteúdos concluidos de João: "+ devJoao.getFinishedSubjects());
        System.out.println("Counteúdos inscritos de João: "+ devJoao.getSubscribedSubjects());
        System.out.println("XP de João: " + devJoao.calcTotalXp());

        Dev devClara = new Dev();
        devClara.setName("Clara");
        System.out.println("Counteúdos inscritos de Clara: "+ devClara.getSubscribedSubjects());
        System.out.println("Counteúdos concluidos de Clara: "+ devClara.getFinishedSubjects());

    }
}
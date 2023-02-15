import bootcamp.dominio.Class;
import bootcamp.dominio.Course;

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
        course1.setHoursClass(10);

        Class class1 = new Class();
        class1.setTitle("Mentoria Java");
        class1.setDescription("Descrição da mentira Java");
        class1.setDate(LocalDate.now());

        System.out.println(course);
        System.out.println(course1);
        System.out.println(class1);
    }
}
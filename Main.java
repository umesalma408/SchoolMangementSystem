package school_management_system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Sundar = new Teacher(1,"Sundar", 10000);
        Teacher Nikunj = new Teacher(2,"Nikunj",15000);
        Teacher Nishtha = new Teacher(13,"Nishtha Goyal",1000000);

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(Sundar);
        teachers.add(Nikunj);
        teachers.add(Nishtha);

        Student Bhatt = new Student(11, "Ashish Bhatt" , 12);
        Student Alok = new Student(12, " Alok Kumar", 11);
        Student Sourav = new Student(3,"Sourav K Shah", 8);
        List<Student> students = new ArrayList<>();
        students.add(Bhatt);
        students.add(Alok);
        students.add(Sourav);

        School STS = new School(teachers,students);
        System.out.println("STS has earned : "+STS.getTotalMoneyEarned());

        Teacher Satyam = new Teacher(9," Satyam Goyal ", 8000);
        STS.addTeacher(Satyam);

        Sourav.updateFeesPaid(50000);
        System.out.println("STS has earned : "+STS.getTotalMoneyEarned());

        Alok.updateFeesPaid(10000);
        System.out.println("STS has earned : "+STS.getTotalMoneyEarned());

        System.out.println("-----Making STS pay Salary------");

        Sundar.receiveSalary(Sundar.getSalary());
        System.out.println("STS has given salary to :"+Sundar.getName()+" : " + Sundar.getSalary()+ "   STS and now has " +STS.getTotalMoneyEarned());

        System.out.println(Sourav);
        System.out.println(Satyam);
    }
}

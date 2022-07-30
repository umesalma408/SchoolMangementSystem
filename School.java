package school_management_system;

import java.util.ArrayList;
import java.util.List;

public class School {

//    private Teacher teacher;
//    private Student student;

//     Schools can have many teachers and students
    // So we have to create an array
    // But we don't know the size
    // so implement using ArrayList;
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students){
        this.students = students;
        this.teachers = teachers;
        totalMoneyEarned = 0;
        totalMoneySpent =0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned -= MoneySpent;
        totalMoneySpent += MoneySpent;
    }
}

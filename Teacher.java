package school_management_system;

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    // Create an object for teacher
    public Teacher(int id, String name,int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        salaryEarned =0;
    }

    // return the name for the current teacher
    public String getName() {
        return this.name;
    }

    // return the id
    public int getId() {
        return id;
    }

    // return the salary
    public int getSalary() {
        return salary;
    }

    // Set the salary
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salaryEarned);
    }

    @Override
    public String toString() {
        return "Teacher's name :" + name + " Total salary earned so far : " + salaryEarned ;
    }
}

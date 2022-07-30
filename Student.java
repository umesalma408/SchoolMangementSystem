package school_management_system;


// This class is responsible for keeping the track of Students
public class Student {
    // Fields for the class
     private int id;
    private String name;
    private  int grade;
    private  int feesPaid;
    private  int totalFees;

     // private access specifier = because I don't want people to access it from outside the Student class

    // Constructor - Used to initialize objects
    //             - Called when object of the class is created
    //             - To create a new student object
    public Student(int id, String name,int grade){
//        name from our fields = name from our constructor
        this.id = id;
        this.name = name;
        this.grade = grade;
        // Fees for every student = 50,000 rupees
        // Fees initially paid = 0;
        totalFees = 50000;
        feesPaid = 0;
    }
    // Not going to alter student's name, id  = So set method is not required
    // But grade will be changed = Use of setter function

    // Used to update the student grade
    public void setGrade(int grade) {
        this.grade = grade;
    }

    // Updating the fees paid
    // Keep adding the fees to the fess paid
    public void updateFeesPaid(int fees) {
    feesPaid += fees;
    School.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getTotalFees() {
        return totalFees;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int remainingFees(){
        return totalFees-feesPaid;
    }

    public String toString(){
        return "Student's name : " + name +" Fees paid so far : "+ feesPaid;
    }
}

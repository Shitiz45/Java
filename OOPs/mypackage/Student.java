package OOPs.mypackage;

public class Student { // made public

    // attributes of student class
    // instance variables
    int studentId;
    String studentName;
    String studentCity;
    int marks;

    public Student() {
        // Non Parametrized constructor
        System.out.println("This is the non-parametrized constructor of Student class");
    }

    public Student(int studentId, String studentName, String studentCity, int marks) {
        // Parametrized constructor
        System.out.println("Parametrized constructor with 4 parameters");
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCity = studentCity;
        this.marks = marks;
    }

    public Student(int studentId, String studentName) {
        // Another Parametrized constructor
        System.out.println("Parametrized constructor with 2 parameters");
        this.studentCity = "Not specified"; // default value
        this.studentId = studentId;
        this.studentName = studentName;
    }

    // Here we are creating different constructors
    // All the constructors have different parameters
    // This is called constructor overloading

    // methods of student class
    public void study() {
        System.out.println(studentName + " is studying");
    }

    public void showDetails() {
        System.out.println("Student name is " + studentName);
        System.out.println("Student ID is " + studentId);
        System.out.println("Student lives in " + studentCity);
        System.out.println("Marks obtained: " + marks);
    }
}

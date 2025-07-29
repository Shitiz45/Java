package OOPs.mypackage;

public class Student { // made public

    int studentId;
    String studentName;
    String studentCity;

    public void study() {
        System.out.println(studentName + " is studying");
    }

    public void showDetails() {
        System.out.println("Student name is " + studentName);
        System.out.println("Student ID is " + studentId);
        System.out.println("Student lives in " + studentCity);
    }
}

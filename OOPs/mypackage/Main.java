package OOPs.mypackage;


public class Main {
    public static void main(String[] args) {
        // creating object of student class
        Student st1 = new Student();
        st1.studentId = 123;
        st1.studentCity = "Delhi";
        st1.studentName = "Ram";

        st1.study();

        st1.showDetails();
    }
}

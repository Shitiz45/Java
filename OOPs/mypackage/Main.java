package OOPs.mypackage;

public class Main {
    public static void main(String[] args) {
        // creating object of student class
        Student st1 = new Student();
        st1.studentId = 123;
        st1.studentCity = "Delhi";
        st1.studentName = "Ram";
        st1.marks = 85;

        st1.study();
        st1.showDetails();

        Student st2 = new Student(456, "Shyam", "Mumbai", 90);
        st2.study();
        st2.showDetails();

        Student st3 = new Student(789, "Sita", "Bangalore", 95);
        st3.study();
        st3.showDetails();

        Student st4 = new Student(101, "Gita");
        st4.studentCity = "Chennai";
        st4.marks = 88;
        st4.study();
        st4.showDetails();

        Student st5 = new Student(102, "Laxman");
        st5.marks = 92;
        st5.study();
        st5.showDetails();
    }
}

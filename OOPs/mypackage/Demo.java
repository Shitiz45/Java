package OOPs.mypackage;

public class Demo {
    public static void main(String[] args) {
        // Creating an instance of Dog class
        // This demonstrates inheritance where Dog inherits properties and methods from
        // Animal
        System.out.println("Creating a Dog object:");
        Dog D1 = new Dog();
        D1.eat(); // Calling method from Animal class
        D1.walk(); // Calling method from Animal class
        D1.bark(); // Calling method from Dog class
        D1.fetch(); // Calling method from Dog class
        System.out.println("Dog's color: " + D1.color); // Accessing property from Animal class
        System.out.println("Dog's age: " + D1.age); // Accessing property from Animal class
        System.out.println("Dog's breed: " + D1.breed); // Accessing property from Dog class
    }
}

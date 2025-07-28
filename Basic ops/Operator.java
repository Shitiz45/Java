public class Operator {
    public static void main(String[] args) {
        System.out.println("Arithmatic Operator");
        int a = 10;
        int b = 3;
        int ad = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        System.out.println(ad + " " + " " + sub + " " + mul + " " + div + " " + mod);

        // increment/decrement
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);

        // relational operator ==,<,>,!=,<=,>=
        // output of relational operator is a boolean value
        boolean result = a > b;
        System.out.println(result);

        // logical operators 

    }
}

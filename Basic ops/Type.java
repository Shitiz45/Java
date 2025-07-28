public class Type {
    public static void main(String[] args) {
        System.out.println("Type casting and type conversion in java");
        // byte b = 127;
        // int a = 124;
        // System.out.println(a);
        // System.out.println(b);
        // // b = a; This operation will not work as int has a bigger size than byte,
        // hence
        // // can lead to data loss
        // // a = b; // this will work
        // b = (byte) a; // This is explicit type casting
        // System.out.println(a);
        // System.out.println(b);

        // Use of modulo operator
        int a = 260;
        byte b = (byte) a;
        System.out.println(a);
        System.out.println(b);

        // int-float conversion
        float f = 5.6f;
        int x = (int) f;
        System.out.println(x);
        System.out.println(f);
    }
}

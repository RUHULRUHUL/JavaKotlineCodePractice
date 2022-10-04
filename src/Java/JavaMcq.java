package Java;


public class JavaMcq {

    static int a = 10;
    static int n;
    int b = 5;
    int c;

    // Instance Block
    {
        b = 30;
        n = 20;
    }

    // Static Block
    static {
        a = 60;
    }

    public static void main(String[] args) {
        JavaMcq obj = new JavaMcq(n);
    }


    public JavaMcq(int m) {

        System.out.println("Result: "+m);

        System.out.println(a + ", " + b + ", " + c + ", " + n + ", " + m);
    }


}

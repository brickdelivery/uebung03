package p3;

public class P3_main {
    public static void main(String[] args) {
        int a = -6;
        if (a < 0) a *= -1;
        System.out.println(a);

        int b = 8;
        b *= b;
        System.out.println(b);

        int c = 6;
        if (c%2 == 0) System.out.println("c ist gerade");
        else System.out.println("c ist ungerade");
    }
}

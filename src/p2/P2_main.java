package p2;

public class P2_main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 99;
        int e=0; //erfüllte eigenschaften
        boolean e1 = a == b;
        boolean e2 = a == b || a == c;
        boolean e3 = a + b >= c;
        boolean e4 = a + b + c >= 100;
        if (!e1&&!e2&&!e3&&!e4) d=0;
        else e=0;
        if (e1) e++;
        if (e2) e++;
        if (e3) e++;
        if (e4) e++;
        d=e;
        System.out.println(d);
    }
}

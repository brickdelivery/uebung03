package h2;

public class H2_main {
    public static void main(String[] args) {
        int jahr = 2032;
        boolean schalt=false;

        if (jahr%4==0) {
            if (jahr % 100 != 0 || jahr % 400 == 0) {
                schalt=true;
            } else schalt=false;
        }
        //System.out.println(schalt);
    }
}

package h1;

public class H1_main {
    public static void main(String[] args) {
        double guthaben = 1200.79;
        double monEingang = 2000;
        double guthabenBetrag = guthaben;
        if (guthaben<0) guthabenBetrag*=-1;
        int rating = 0;
        boolean warnhinweis = false;
        boolean negativ =false;

        if (guthaben<0) negativ = true;
        else if (guthaben==0) rating +=2;
        else  rating +=3;

        if (negativ && monEingang>=guthabenBetrag) rating++;
        else if (negativ && monEingang<=guthabenBetrag){
            rating--;
            if (rating<0) warnhinweis=true;
            else warnhinweis=false;
        }
    }
}

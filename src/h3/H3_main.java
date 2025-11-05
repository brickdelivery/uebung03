package h3;

public class H3_main {
    public static void main(String[] args) {
        int max = 100;
        int fix = 50;
        int wartend = 75;
        boolean istVoll = false;

        if (fix >= max) {
            istVoll = true; //nichts ändert sich
        } else {
            int frei = max - fix;
            if (wartend >= frei) { // case 2: mehr leute warten, als es freie plätze gibt. dann ist der kurs voll
                istVoll = true;
                fix = max;
                wartend -= frei;
            } else { // case 3: weniger leute warten, als es freie plätze gibt.
                istVoll = false;
                fix += wartend;
                wartend = 0;
            }
        }

        //System.out.println("Max: " + max);
        //System.out.println("Fix: " + fix);
        //System.out.println("Wartend: " + wartend);
    }
}

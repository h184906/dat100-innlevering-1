package Innlevering1.dat100Innlevering1;
import java.util.Scanner;

public class OppgaveB6 {
    public static void main(String[] args) {
        
        Scanner objcet = new Scanner(System.in); 
        
        System.out.println("Skriv inn inntekten din");
        int userInput = objcet.nextInt();

        // Variabler for sats og grenser;
        double trinnSats1 = 0.017;
        double trinnSats2 = 0.04;
        double trinnSats3 = 0.136;
        double trinnSats4 = 0.166;
        double trinnSats5 = 0.176;

        int sats1 = 208051;
        int sats2 = 292851;
        int sats3 = 670001;
        int sats4 = 937901;
        int sats5 = 1350001;

        double totalSkatt = 0;

        // For å sjekke at man får en gyldig input;
        if (userInput >= 0) {

            //Skal kjøre helt til vi har gått igjenom alle pengene;
            while (userInput > 0) {
                if (userInput >= sats5) {
                    totalSkatt += (userInput - sats5) * trinnSats5;
                    userInput = sats5 - 1;
                } else if (userInput >= sats4) {
                    totalSkatt += (userInput - sats4) * trinnSats4;
                    userInput = sats4 - 1;
                } else if (userInput >= sats3) {
                    totalSkatt += (userInput - sats3) * trinnSats3;
                    userInput = sats3 - 1;
                } else if (userInput >= sats2) {
                    totalSkatt += (userInput - sats2) * trinnSats2;
                    userInput = sats2 - 1;
                } else if (userInput >= sats1) {
                    totalSkatt += (userInput - sats1) * trinnSats1;
                    userInput = sats1 - 1;
                } else {
                    break;
                }
            }

            System.out.println("Totalt skatt: " + totalSkatt);

        } else {
            System.out.println("Du må skrive inn en gyldig inntekt");
        }

        objcet.close();
    }
}

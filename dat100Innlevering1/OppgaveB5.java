package Innlevering1.dat100Innlevering1;
import java.util.Scanner;

public class OppgaveB5 {
    public static void main(String[] args) {
        
        Scanner object = new Scanner(System.in);

        int personsChecked = 0;
        int maximalUses = 10;

        //Kjører programmet på nytt om ugyldig input + at det blir brukt x ganger;
        while (personsChecked <= maximalUses){
            
            System.out.println("Skriv poengsummen din");
            int points = object.nextInt();

            //Kontrollsjekk om gyldig bruker input;
            if (points <= 100 && points >= 0) {

                //Karrakter sjekker
                if (points >= 90) {
                    System.out.println("Dine " + points + " poeng gir karrakteren A");
                } else if (points >= 80){
                    System.out.println("Dine " + points + " poeng gir karrakteren B");
                } else if (points >= 60){
                    System.out.println("Dine " + points + " poeng gir karrakteren C");
                } else if (points >= 50){
                    System.out.println("Dine " + points + " poeng gir karrakteren D");
                } else if (points >= 40){
                    System.out.println("Dine " + points + " poeng gir karrakteren E");
                } else {
                    System.out.println("Dine " + points + " poeng gir karrakteren F");
                }

                //Ligger til variabelen som sjekker hvor mange som har brukt programmet;
                personsChecked ++;

            } else {
                System.out.println("Poengsummen må være mellom 0-100");
            }
        }   
        
        object.close();
    }
}

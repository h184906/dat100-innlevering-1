package Innlevering1.dat100Innlevering1;
import java.util.Scanner;

public class OppgaveO3 {
    public static void main(String[] args) {
        
        Scanner object = new Scanner(System.in);
        System.out.print("Skriv heltallet du skal finne fakulteten av: ");
        int n = object.nextInt();

        int fakultet = 1;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                fakultet *= i;
            }
            System.out.println("Fakulteten av " + n + " er: " + fakultet);
        } else {
            System.out.println("Skriv et gyldig heltall!");
        }
        
        object.close();
    }
}

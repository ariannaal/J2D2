package entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Inserisci un intero N");
            int numeroN = scanner.nextInt();
            scanner.nextLine();

            Set<String> parole = new HashSet<>();
            ArrayList<String> paroleDuplicate = new ArrayList<>();

            for (int i = 0; i < numeroN; i++) {
                System.out.println("Inserisci " + (i + 1) + " parola");

                String parola = scanner.nextLine();

                if (parole.contains(parola)) {
                    paroleDuplicate.add(parola);
                } else {
                    parole.add(parola);
                }
            }

            System.out.println("Parole duplicate: " + paroleDuplicate);
            System.out.println("Numero di parole distinte: " + parole.size());
            System.out.println("Parole distinte: " + parole);

        } catch (Exception e) {
            System.out.println("Errore " + e.getMessage());
        } finally {
            scanner.close();
        }

    }

}

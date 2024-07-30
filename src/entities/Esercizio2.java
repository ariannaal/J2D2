package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Esercizio2 {


    public static void numeriRandom() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Scrivi il numero di elementi");
        int interoN = scanner.nextInt();

        List<Integer> listaOrdinata = new ArrayList<>();
        for (int i = 0; i < interoN; i++) {
            listaOrdinata.add(random.nextInt(100));

        }

        System.out.println("Lista ordinata: " + listaOrdinata);

    }

    public static List<Integer> nuovaLista(List<Integer> lista) {

        List<Integer> liste = new ArrayList<>(lista);
        List<Integer> listaAlContrario = new ArrayList<>(lista);
        listaAlContrario = liste.reversed();
        liste.addAll(listaAlContrario);

        liste.add(1);
        liste.add(2);
        liste.add(3);
        liste.add(4);
        liste.add(5);

        System.out.println("La lista finale è: " + liste + listaAlContrario);

        return lista;
    }

    public static void posizioni(List<Integer> lista, boolean posizioniPari) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < lista.size(); i++) {

            if (posizioniPari && i % 2 == 0) { //se booleano è true stampa posizioni pari
                System.out.println("Posizione pari " + i + ": " + lista.get(i));
            } else if (!posizioniPari && i % 2 != 0) { // se è false stampa i dispari
                System.out.println("Posizione dispari " + (i + 1) + ": " + lista.get(i + 1));
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        numeriRandom();

        List<Integer> listaFinale = nuovaLista(new ArrayList<>());

        System.out.print("Vuoi stampare posizioni pari? (true/false): ");
        boolean posizioniPari = scanner.nextBoolean();
        posizioni(listaFinale, posizioniPari);

    }
}

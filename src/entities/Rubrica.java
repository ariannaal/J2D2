package entities;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Rubrica {
    Scanner scanner = new Scanner(System.in);

    private Map<String, String> rubrica;

    //costruttore per rubrica
    public Rubrica() {
        rubrica = new HashMap<>();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rubrica rubrica = new Rubrica();
        rubrica.aggiungiContatto("Diego", "11111111");
        rubrica.aggiungiContatto("Yuri", "222222222");
        rubrica.aggiungiContatto("Eddy", "333333333");
        rubrica.aggiungiContatto("Gabriel", "444444444");

        rubrica.cancellaContatto("Gabriel");

        System.out.print("Inserisci il nome del contatto da cercare: ");
        String nomeRicerca = scanner.nextLine();
        String telefonoTrovato = rubrica.ricercaPerNome(nomeRicerca);
        System.out.println(telefonoTrovato);

        System.out.print("Inserisci il telefono del contatto da cercare: ");
        String telRicerca = scanner.nextLine();
        String nomeTrovato = rubrica.ricercaPerTel(telRicerca);
        System.out.println(nomeTrovato);

    }

    //metodo x inserire contatto
    public void aggiungiContatto(String nome, String telefono) {
        this.rubrica.put(nome, telefono);
        System.out.println("Contatto inserito: " + nome + " - " + telefono);
    }

    //metodo x cancellare contatto dal nome
    public void cancellaContatto(String nome) {
        this.rubrica.remove(nome);
        System.out.println("Contatto " + nome + " cancellato");
    }

    // metodo x cercare persona con nr telefono
    public String ricercaPerNome(String nome) {
        String telefono = rubrica.get(nome);
        if (telefono != null) {
            return telefono;
        } else {
            return "Nessun contatto trovato con il nome: " + nome;
        }
    }

    public String ricercaPerTel(String telefono) {
        String nome = rubrica.get(telefono);
        if (nome != null) {
            return nome;
        } else {
            return "Nessun contatto trovato con il numero: " + telefono;
        }
    }


}

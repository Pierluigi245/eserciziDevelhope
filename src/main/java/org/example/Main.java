package org.example;

// Classe base Animale
class Animale {
    public void faiIlVerso() {
        System.out.println("Verso generico di un animale");
    }
}

// Sottoclasse Gatto che eredita da Animale
class Gatto extends Animale {
    @Override
    public void faiIlVerso() {
        System.out.println("Miao!");
    }
}

// Classe principale per testare il programma
public class Main {
    public static void main(String[] args) {
        // Creazione di un oggetto Animale
        Animale animale = new Animale();
        // Creazione di un oggetto Gatto
        Gatto gatto = new Gatto();

        // Stampa del verso dell'animale generico
        System.out.println("Verso dell'animale:");
        animale.faiIlVerso();

        // Stampa del verso del gatto
        System.out.println("Verso del gatto:");
        gatto.faiIlVerso();
    }
}
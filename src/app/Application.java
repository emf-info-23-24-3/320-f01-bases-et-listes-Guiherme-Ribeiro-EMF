package app;

import java.util.ArrayList;

import models.Personne;

public class Application {

    public static void main(String[] args) {
        Personne jean = new Personne("Jacquier", "Jean", "Impasse de la Mortadelle", "Fribourg", 1672);
        Personne paul = new Personne("Bosson", "Paul", "Route de la citadelle", "Bulle", 1676);
        Personne pierre =new Personne("Ferrero", "Pierre", "Route du coiffeur ", "Berne", 1522);

    ArrayList<Personne> personne = new ArrayList<>();
    personne.add(jean);
    personne.add(pierre);
    personne.add(paul);
    for (Personne personne2 : personne) {
        System.out.println(personne2.getPrenom()+ personne2.getNom(),personne2.getRue()+ personne2.getLocalite()+personne2.getNpa());
        
    }

    }

}

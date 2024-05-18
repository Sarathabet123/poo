import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> acteurs = new ArrayList<>();
        acteurs.add("Acteur 1");
        acteurs.add("Acteur 2");
        acteurs.add("Acteur 3");


        Film film = new Film("Film 1", "Description du film 1", 12, 120, 2022, acteurs, "lienBandeAnnonce1", "Action");

        // les détails du film
        System.out.println("Détails du film :");
        System.out.println("Nom : " + film.getNom());
        System.out.println("Description : " + film.getDescription());
        System.out.println("Âge minimum : " + film.getAgeMin());
        System.out.println("Durée : " + film.getDuree() + " minutes");
        System.out.println("Année de sortie : " + film.getAnneeSortie());
        System.out.println("Acteurs : " + film.getActeurs());
        System.out.println("Lien de la bande annonce : " + film.getBandeAnnonceUrl());
        System.out.println("Type : " + film.getType());


        séries series = new séries("Séries 1", "Description de la série 1", 10, 45, 2020, acteurs, "lienBandeAnnonce2", 5, 10, "Comédie");

        // les détails de la série
        System.out.println("\nDétails de la série :");
        System.out.println("Nom : " + series.getNom());
        System.out.println("Description : " + series.getDescription());
        System.out.println("Âge minimum : " + series.getAgeMin());
        System.out.println("Durée : " + series.getDuree() + " minutes");
        System.out.println("Année de sortie : " + series.getAnneeSortie());
        System.out.println("Acteurs : " + series.getActeurs());
        System.out.println("Lien de la bande annonce : " + series.getBandeAnnonceUrl());
        System.out.println("Nombre de saisons : " + series.getNombreSaisons());
        System.out.println("Épisodes par saison : " + series.getEpisodesParSaison());
        System.out.println("Type : " + series.getType());


        documentaire documentaire = new documentaire("Documentaire 1", "Description du documentaire 1", 8, 60, 2021, acteurs, "lienBandeAnnonce3", "Nature");

        // les détails du documentaire
        System.out.println("\nDétails du documentaire :");
        System.out.println("Nom : " + documentaire.getNom());
        System.out.println("Description : " + documentaire.getDescription());
        System.out.println("Âge minimum : " + documentaire.getAgeMin());
        System.out.println("Durée : " + documentaire.getDuree() + " minutes");
        System.out.println("Année de sortie : " + documentaire.getAnneeSortie());
        System.out.println("Acteurs : " + documentaire.getActeurs());
        System.out.println("Lien de la bande annonce : " + documentaire.getBandeAnnonceUrl());
        System.out.println("Type : " + documentaire.getType());
    }
}


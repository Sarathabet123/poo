import java.util.List;

public class séries extends Media {
    private int nombreSaisons;
    private int episodesParSaison;
    private String type;

    public séries(String nom, String description, int ageMin, int duree, int anneeSortie, List<String> acteurs, String bandeAnnonceUrl, int nombreSaisons, int episodesParSaison, String type) {
        super(nom, description, ageMin, duree, anneeSortie, acteurs, bandeAnnonceUrl);
        this.nombreSaisons = nombreSaisons;
        this.episodesParSaison = episodesParSaison;
        this.type = type;
    }

    public int getNombreSaisons() {
        return nombreSaisons;
    }

    public void setNombreSaisons(int nombreSaisons) {
        this.nombreSaisons = nombreSaisons;
    }

    public int getEpisodesParSaison() {
        return episodesParSaison;
    }

    public void setEpisodesParSaison(int episodesParSaison) {
        this.episodesParSaison = episodesParSaison;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}




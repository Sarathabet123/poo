import java.util.List;

public class Film extends Media {
    private String type;

    public Film(String nom, String description, int ageMin, int duree, int anneeSortie, List<String> acteurs, String bandeAnnonceUrl, String type) {
        super(nom, description, ageMin, duree, anneeSortie, acteurs, bandeAnnonceUrl);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}



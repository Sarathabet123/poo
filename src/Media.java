import java.util.List;

public class Media {
    protected String nom;
    protected String description;
    protected int ageMin;
    protected int duree;
    protected int anneeSortie;
    protected List<String> acteurs;
    protected String bandeAnnonceUrl;

    public Media(String nom, String description, int ageMin, int duree, int anneeSortie, List<String> acteurs, String bandeAnnonceUrl) {
        this.nom = nom;
        this.description = description;
        this.ageMin = ageMin;
        this.duree = duree;
        this.anneeSortie = anneeSortie;
        this.acteurs = acteurs;
        this.bandeAnnonceUrl = bandeAnnonceUrl;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAgeMin() {
        return ageMin;
    }

    public void setAgeMin(int ageMin) {
        this.ageMin = ageMin;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public int getAnneeSortie() {
        return anneeSortie;
    }

    public void setAnneeSortie(int anneeSortie) {
        this.anneeSortie = anneeSortie;
    }

    public List<String> getActeurs() {
        return acteurs;
    }

    public void setActeurs(List<String> acteurs) {
        this.acteurs = acteurs;
    }

    public String getBandeAnnonceUrl() {
        return bandeAnnonceUrl;
    }

    public void setBandeAnnonceUrl(String bandeAnnonceUrl) {
        this.bandeAnnonceUrl = bandeAnnonceUrl;
    }
}


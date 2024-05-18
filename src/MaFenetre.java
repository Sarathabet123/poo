import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

public class MaFenetre extends JFrame {
    public MaFenetre() {
        setTitle("Ma Plateforme de Streaming");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        panel.setBackground(Color.PINK);

        JButton filmsButton = new JButton("Catalogue cinématographique");
        JButton seriesButton = new JButton("Catalogue de séries");
        JButton docsButton = new JButton("Catalogue de documentaires");

        filmsButton.setBackground(Color.PINK);
        filmsButton.setForeground(Color.WHITE);

        seriesButton.setBackground(Color.PINK);
        seriesButton.setForeground(Color.WHITE);

        docsButton.setBackground(Color.PINK);
        docsButton.setForeground(Color.WHITE);

        panel.add(filmsButton);
        panel.add(seriesButton);
        panel.add(docsButton);

        List<String> acteurs = Arrays.asList("Acteur 1", "Acteur 2", "Acteur 3");

        filmsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Film film = new Film("Film 1", "Description du film 1", 12, 120, 2022, acteurs, "lienBandeAnnonce1", "Action");
                afficherDetailsMedia(film);
            }
        });

        seriesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                séries series = new séries("Séries 1", "Description de la série 1", 10, 45, 2020, acteurs, "lienBandeAnnonce2", 5, 10, "Comédie");
                afficherDetailsMedia(series);
            }
        });

        docsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                documentaire doc = new documentaire("Documentaire 1", "Description du documentaire 1", 8, 60, 2021, acteurs, "lienBandeAnnonce3", "Nature");
                afficherDetailsMedia(doc);
            }
        });

        add(panel);
        setVisible(true);
    }

    private void afficherDetailsMedia(Media media) {
        JFrame detailsFrame = new JFrame("Détails du média");
        detailsFrame.setSize(600, 300);
        detailsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String[] columnNames = {"Propriété", "Valeur"};
        Object[][] data = {
                {"Nom", media.getNom()},
                {"Description", media.getDescription()},
                {"Âge minimum", media.getAgeMin()},
                {"Durée", media.getDuree() + " minutes"},
                {"Année de sortie", media.getAnneeSortie()},
                {"Acteurs", String.join(", ", media.getActeurs())},
                {"Lien de la bande annonce", media.getBandeAnnonceUrl()}
        };

        if (media instanceof Film) {
            Film film = (Film) media;
            data = Arrays.copyOf(data, data.length + 1);
            data[data.length - 1] = new Object[]{"Type", film.getType()};
        }

        if (media instanceof séries) {
            séries series = (séries) media;
            data = Arrays.copyOf(data, data.length + 3);
            data[data.length - 3] = new Object[]{"Nombre de saisons", series.getNombreSaisons()};
            data[data.length - 2] = new Object[]{"Épisodes par saison", series.getEpisodesParSaison()};
            data[data.length - 1] = new Object[]{"Type", series.getType()};
        }

        if (media instanceof documentaire) {
            documentaire doc = (documentaire) media;
            data = Arrays.copyOf(data, data.length + 1);
            data[data.length - 1] = new Object[]{"Type", doc.getType()};
        }

        JTable table = new JTable(data, columnNames);
        table.setBackground(Color.WHITE);
        table.setForeground(Color.PINK);
        table.setFillsViewportHeight(true);
        table.setGridColor(Color.PINK);
        table.setSelectionBackground(Color.PINK);
        table.setSelectionForeground(Color.WHITE);

        JScrollPane scrollPane = new JScrollPane(table);

        detailsFrame.add(scrollPane);
        detailsFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new MaFenetre();
    }
}






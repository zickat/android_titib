package gestion;

/**
 * Created by valen on 18/03/2016.
 */
public class Bon {

    private String nom;
    private int prix;

    public Bon(String nom, int prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public int getPrix() {
        return prix;
    }

    public String getNom() {
        return nom;
    }

}

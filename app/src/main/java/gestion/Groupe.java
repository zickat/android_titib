package gestion;

/**
 * Created by valen on 17/03/2016.
 */
public class Groupe {

    private int id;
    private String nom;

    public Groupe(int id, String nom) {
        this.nom = nom;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }
}

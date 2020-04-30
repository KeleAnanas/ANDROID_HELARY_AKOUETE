package b3.epsimarket.model;

import java.io.Serializable;

public class Etudiant implements Serializable {
    private String nom="";
    private String prenom="";
    private String email = "";
    private String groupe="";
    private String image = "";

    public Etudiant(String nom, String prenom, String email, String groupe, String image) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.groupe = groupe;
        this.image = image;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

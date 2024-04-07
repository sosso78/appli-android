package com.example.mesdeputes;

        import java.io.Serializable;
        import java.util.ArrayList;

public class Vote implements Serializable {

    private ArrayList<Vote> votes;
    private int numero;
    private String date, titre, resultat, nbVotants, nbPours, nbContres, nbAbstentions, position;

    public Vote(int numero, String date, String titre, String resultat, String nbVotants, String nbPours, String nbContres, String nbAbstentions, String position) {
        this.numero = numero;
        this.date = date;
        this.titre = titre;
        this.resultat = resultat;
        this.nbVotants = nbVotants;
        this.nbPours = nbPours;
        this.nbContres = nbContres;
        this.nbAbstentions = nbAbstentions;
        this.position = position;
        this.votes = new ArrayList<>();
    }

    public ArrayList<Vote> getVotes() {
        return votes;
    }

    public void setVotes(ArrayList<Vote> votes) {
        this.votes = votes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getResultat() {
        return resultat;
    }

    public void setResultat(String resultat) {
        this.resultat= resultat;
    }

    public String getNbVotants() {
        return nbVotants;
    }

    public void setNbVotants(String nbVotants) {
        this.nbVotants = nbVotants;
    }

    public String getNbPours() {
        return nbPours;
    }

    public void setNbPours(String nbPours) {
        this.nbPours = nbPours;
    }

    public String getNbContres() {
        return nbContres;
    }

    public void setNbContres(String nbContres) {
        this.nbContres = nbContres;
    }

    public String getNbAbstentions() {
        return nbAbstentions;
    }

    public void setNbAbstentions(String nbAbstentions) {
        this.nbAbstentions = nbAbstentions;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
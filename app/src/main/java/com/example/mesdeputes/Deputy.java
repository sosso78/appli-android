package com.example.mesdeputes;

import androidx.annotation.Nullable;

import java.io.Serializable;
import java.util.ArrayList;

public class Deputy implements Serializable {

    private int id;
    private String firstname;
    private String lastname;
    private String department;
    private int numCirco;
    private String nameCirco;

    private String email;
    private String groupe;
    private String mandat_debut;
    private String parti_financier;
    private ArrayList<String> collaborator;

    public Deputy(int id, String firstname, String lastname, String department, int numCirco, String nameCirco,String mandat_debut,String parti_financier) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.department = department;
        this.numCirco = numCirco;
        this.nameCirco = nameCirco;
        this.mandat_debut = mandat_debut;
        this.parti_financier = parti_financier;
        this.collaborator =new ArrayList<String>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNumCirco() {
        return numCirco;
    }

    public void setNumCirco(int numCirco) {
        this.numCirco = numCirco;
    }

    public String getNameCirco() {
        return nameCirco;
    }

    public void setNameCirco(String nameCirco) {
        this.nameCirco = nameCirco;
    }

    public String getMandat_debut() {
        return mandat_debut;
    }

    public void setMandat_debut(String mandat_debut) {
        this.mandat_debut = mandat_debut;
    }

    public String getNameForAvatar(){
        return firstname.replace(' ', '-').toLowerCase()+
                "-"+lastname.replace(' ', '-').toLowerCase();
    }

    public String getParti_financier() {
        return parti_financier;
    }

    public void setParti_financier(String parti_financier) {
        this.parti_financier = parti_financier;
    }

    public ArrayList<String> getCollaborator() {
        return collaborator;
    }

    public void setCollaborator(ArrayList<String> collaborator) {
        this.collaborator = collaborator;
    }
    public void addCollaborator(String nouveauCollaborator) {
        this.collaborator.add(nouveauCollaborator);
    }
    @Override
    public boolean equals(@Nullable Object obj) {
        Deputy d= (Deputy) obj;
        return id==d.getId();
    }
}

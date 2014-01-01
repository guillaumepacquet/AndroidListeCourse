package com.esaip.android.beans;

public class Catégorie {
	
    
	//Variables de classe
	
    private int id;
    private String nom;
    private String description;
    
    
    
    // Constructeurs de classe
    public Catégorie() {
    }

    public Catégorie(int id, String nom, String description) {
        this.id = id;
        this.nom = nom;
        this.description = description;
    }

    public Catégorie(int id) {
        this.id = id;
    }

    public Catégorie(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    

    // Getters and Setters
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
    
}

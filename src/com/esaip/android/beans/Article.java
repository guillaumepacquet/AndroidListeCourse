package com.esaip.android.beans;

public class Article {

	
	//Variables de classes
	
    private int id;
    private String nom;
    private double prix;
    private String description;
    Catégorie cat;

    //Constructeurs de classe
    
    public Article(int id, String nom, double prix, String description, Catégorie cat) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.description = description;
        this.cat = cat;
    }

    public Article() {
    }

    public Article(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Article(int id) {
        this.id = id;
    }

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

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Catégorie getCat() {
        return cat;
    }

    public void setCat(Catégorie cat) {
        this.cat = cat;
    }
}

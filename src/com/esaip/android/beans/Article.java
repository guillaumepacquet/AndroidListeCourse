package com.esaip.android.beans;

public class Article {

	
	//Variables de classes
	
    private String nom;
    private String prix;
    private String description;
    private String image;
    private Categorie cat;

    //Constructeurs de classe
    


    public Article() {
    }

	public Article(String nom, String prix, String description, String image,
			Categorie cat) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.description = description;
		this.image = image;
		this.cat = cat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Categorie getCat() {
		return cat;
	}

	public void setCat(Categorie cat) {
		this.cat = cat;
	}



}

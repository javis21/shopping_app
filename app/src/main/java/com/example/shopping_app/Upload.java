package com.example.shopping_app;
public class Upload {
    private String mName;
    private String mproduit;
    private String mprix;

    private String mlieu;


    private String mImageUrl;

    public Upload() {
        //empty constructor needed
    }

    public Upload(String name,String produit,String prix,String lieu, String imageUrl) {
        if (name.trim().equals("")) {
            name = "No Name";
            name = "No produit";
            name = "No prix";
            name = "No lieu";

        }

        mName = name;
        mproduit = produit;
        mprix = prix;

        mlieu = lieu;

        mImageUrl = imageUrl;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getproduit() {
        return mproduit;
    }

    public void setproduit(String produit) {
        mproduit = produit;
    }
    public String getprix() {
        return mprix;
    }

    public void setprix(String prix) {
        mprix = prix;
    }
    public String getlieu() {
        return mlieu;
    }

    public void setlieu(String lieu) {
        mlieu = lieu;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }
}
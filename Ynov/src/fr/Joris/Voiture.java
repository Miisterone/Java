package fr.Joris;

public class Voiture {

    private String nom;
    private Roue roueG,roueD;

    public void Rouler(int vitesse){
        System.out.println("La voiture roule à "+vitesse);
    }

    public void Tourner(boolean gauche){
        System.out.println(gauche);
    }

    public void Voiture(String nom,int diametre){
        this.roueG = new Roue(diametre);
        this.roueD = new Roue(diametre);
    }

    public void GetNom(){
        System.out.println("Nom:" + nom);
    }

    public void SetNom(String nom){
        this.nom = nom;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_jouan;

/**
 *Jouan
 * @author felix
 */
public class BouteilleBiere { // Création de la classe BouteilleBiere
    String nom; // Création de l'attribut nom, de type String, de la classe BouteilleBiere
    double degreAlcool;// Création de l'attribut degreAlcool, de type double, de la classe BouteilleBiere
    String brasserie;// Création de l'attribut brasserie, de type String, de la classe BouteilleBiere
    boolean ouverte; // Création de l'attribut ouverte, de type booléen, de la classe BouteilleBiere
    public void lireEtiquette(){ // Création de la méthode lireEtiquette, sans type, de la classe BouteilleBiere
        System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : "+  brasserie);// Cette méthode permet d'afficher les différents attributs de l'objet de la classe BouteilleBiere
    }
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) { //Création du constructeur.
        nom=unNom;
        degreAlcool=unDegre;
        brasserie=uneBrasserie;
        ouverte=false;
    }
    public boolean Decapsuler() { //Création de la méthode Décapsuler(), de type booléen, de la classe BouteilleBiere.
        if (ouverte==false) { //Création d'une boucle if, qui permet, si l'attribut ouverte est faux, de lui attribuer la valeur vrai
            ouverte=true;    
        }
        else { //Sinon, de renvoyer un message d'erreur
            System.out.println("erreur : biere déjà ouverte");
        }
        return ouverte; //On renvoie la valeur de ouverte
    }
    @Override
    public String toString() { //Création de la méthode toString() qui permet de renvoyer les attribut de l'objet de la classe BouteilleBiere, lorsque celui-ci est affiché
    String chaine_a_retourner;
    chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
    if (ouverte == true ) {
        chaine_a_retourner += "oui" ;
    }
    else {
        chaine_a_retourner += "non" ;
    }
    return chaine_a_retourner ;
    }

}

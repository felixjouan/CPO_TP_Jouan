/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_jouan;

/**
 *
 * @author felix
 */
public class TP2_Bieres_Jouan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des Trolls", 7.0, "Dubuisson");
        uneBiere.lireEtiquette();
        BouteilleBiere secondeBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        secondeBiere.lireEtiquette();
        BouteilleBiere troisiemeBiere = new BouteilleBiere("Chouffe", 8.0, "Achouffe");
        troisiemeBiere.lireEtiquette();
        BouteilleBiere quatriemeBiere = new BouteilleBiere("Triple Karmelite", 8.4, "Bosteels");
        quatriemeBiere.lireEtiquette();
        //Création de 4 objets de type BouteilleBiere, et affichage de leurs informations respectives
        quatriemeBiere.Decapsuler();
        //Utilisation de la méthode Decapsuler() du quatrième objet créé
        BouteilleBiere cinquiemeBiere = new BouteilleBiere("Hoegaarden", 4.9, "Hoegaarden");
        cinquiemeBiere.lireEtiquette();
        cinquiemeBiere.Decapsuler();
        System.out.println(uneBiere);
        System.out.println(secondeBiere);
        System.out.println(troisiemeBiere);
        System.out.println(quatriemeBiere);
        System.out.println(cinquiemeBiere);
    }

    }
    

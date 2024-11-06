/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_jouan;

/**
 *
 * @author felix
 */
public class TP2_manip_Jouan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Tartiflette assiette1 = new Tartiflette(500); //Création de la référence objet assiette1, de la classe Tartiflette
        Tartiflette assiette2 = new Tartiflette(600); //Création de la référence objet assiette2, de la classe Tartiflette
        Tartiflette assiette3=assiette2;
        //Seule deux assiettes de tartiflette ont été créées. assiette2 et assiette3 référence le même objet.
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
        assiette2.nbCalories+=10;
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
        Tartiflette assiette4 = assiette2; //Création de l'objet tampon assiette4, pour échanger les objets référencés de assiette1 et assiette2
        assiette2 = assiette1;
        assiette1 = assiette4;
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 1 : " +assiette1.nbCalories) ;        
        //Lorsque l'on augmente la valeur nbCalories de assiette2, celle de assiette3 augmente aussi. Donc elles référence le même objet
        //Ces lignes sont incorrectes car une référence d'une classe, ne peut pas être référencé un objet d'une autre classe.
        Moussaka Tab[]; //Création du tableau d'éléments de type Moussaka
        Tab = new Moussaka[10]; //Initialisation du tableau, et réservation de sa mémoire (de 10 éléments)
        for (int j=0; j<=9; j++) { // Création des 10 objets de type Moussaka, dans le tableau
            Tab[j] = new Moussaka(400+10*j);
            int k=j+1;
            System.out.println("l'assiette "+k+" de moussaka a "+Tab[j].nbCalories +" calories");
        } // TODO code application logic here
    }
    public class Tartiflette { //Création de la classe Tartiflette
    int nbCalories; //Initialisation de l'atribut nbCalories, de type int, de la classe Tartiflette
    public Tartiflette(int Calories) {
        nbCalories=Calories;
    }
}
    public class Moussaka { //Création de la classe Moussaka
    int nbCalories; //Initialisation de l'atribut nbCalories, de type int, de la classe Moussaka
    public Moussaka(int Calories) {
    nbCalories=Calories;
    }
}
}

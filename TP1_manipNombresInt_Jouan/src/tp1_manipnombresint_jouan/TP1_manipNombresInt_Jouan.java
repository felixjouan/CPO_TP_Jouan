/*
 * Félix
 * Jouan
* TP1
 */
package tp1_manipnombresint_jouan;

import java.util.Scanner;

/**
 *
 * @author felix
 */
public class TP1_manipNombresInt_Jouan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Veuillez saisir le premier entier : ");
      int entier1 = sc.nextInt();

      System.out.print("Veuillez saisir le second entier : ");
      int entier2 = sc.nextInt();
      System.out.println("Vous avez saisi les nombres " + entier1 + " et " + entier2);
      int somme = entier1 + entier2;
      int difference = entier1 - entier2;
      int produit = entier1 * entier2;

        // Affichage des résultats
      System.out.println("La somme des deux nombres est : " + somme);
      System.out.println("La différence des deux nombres est : " + difference);
      System.out.println("Le produit des deux nombres est : " + produit);
       if (entier2 != 0) {
            int quotient = entier1 / entier2;
            int reste = entier1 % entier2; 
            System.out.println("Le quotient entier de la division du premier par le second est : " + quotient);
            System.out.println("Le reste de la division euclidienne du premier par le second est : " + reste);
        } 
       else {
           
           
       }
    }
    
}

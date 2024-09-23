/*
 * Jouan
 * TDA
*  EX3
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author felix
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) subtract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        
        try ( // Si tu veux aussi lire l'entrée de l'utilisateur, tu peux utiliser un Scanner
                Scanner scanner = new Scanner(System.in)) {
            int choice = scanner.nextInt();
            // Affichage de la sélection (optionnel)
            System.out.println("You chose option: " + choice);
            // Ferme le scanner pour éviter les fuites de ressources
            // TODO code application logic here
        }
    }
    
}

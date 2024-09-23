/*
 * Jouan
* TDA
*EXO2
 */
package exo2;

import java.util.Scanner;

/**
 *
 * @author felix
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Declaration des variables
        //nb=5;
Scanner sc = new Scanner(System.in);
System.out.println("\n Entrer le nombre :");
sc.nextInt(); // On demande a sc de donner le prochain entier
int nb; // nombre dentiers a additionner
int result; // resultat
int ind; //indice
nb=5;
result=0;
// Addition des nb premiers entiers
ind=1;
while (ind <= nb) {
result=result+ind;
ind+=1
}
// Affichage du resultat
System.out.println();
System.out.println("La somme des "+ nb + "entiers est: "+result);
}    // TODO code application logic here
    }
    


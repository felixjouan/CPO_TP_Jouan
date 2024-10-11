/*
 * Jouan
 *TP1
 */
package tp1_convertisseur_jouan;

import static java.time.Clock.system;
import static java.time.InstantSource.system;
import java.util.Scanner;

/**
 *
 * @author felix
 */
public class TP1_convertisseur_Jouan {

    /**
     * @param args the command line arguments
     */
    public static double CelciusVersKelvin (double tCelcius) {
    return tCelcius + 273.15;
    }
    // Convertit Kelvin en Celsius
public static double KelvinVersCelcius(double tKelvin) {
    return tKelvin - 273.15;
}

// Convertit Fahrenheit en Celsius
public static double FarenheitVersCelcius(double tFarenheit) {
    return (tFarenheit - 32) * 5 / 9;
}

// Convertit Celsius en Fahrenheit
public static double CelciusVersFarenheit(double tCelcius) {
    return (tCelcius * 9 / 5) + 32;
}

// Convertit Kelvin en Fahrenheit (en utilisant les méthodes intermédiaires)
public static double KelvinVersFarenheit(double tKelvin) {
    return CelciusVersFarenheit(KelvinVersCelcius(tKelvin));
}

// Convertit Fahrenheit en Kelvin (en utilisant les méthodes intermédiaires)
public static double FarenheitVersKelvin(double tFarenheit) {
    return CelciusVersKelvin(FarenheitVersCelcius(tFarenheit));
}

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Veuillez saisir la première tempréature: ");
    double temp1 = sc.nextDouble(); 
    System.out.print(temp1);
    temp1+=273;
    System.out.print(temp1);
    
    
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir une valeur
        System.out.print("Bonjour, saisissez une valeur : ");
        double valeur = scanner.nextDouble();

        // Affichage du menu de conversion
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celsius vers Kelvin");
        System.out.println("2) De Kelvin vers Celsius");
        System.out.println("3) De Fahrenheit vers Celsius");
        System.out.println("4) De Celsius vers Fahrenheit");
        System.out.println("5) De Kelvin vers Fahrenheit");
        System.out.println("6) De Fahrenheit vers Kelvin");

        // Lecture du choix de l'utilisateur
        int choix = scanner.nextInt();
        double resultat = 0;

        // Selon le choix, on effectue la conversion appropriée
        switch (choix) {
            case 1:
                resultat = CelciusVersKelvin(valeur);
                System.out.println(valeur + " degré Celsius est égal à " + resultat + " degrés Kelvin");
                break;
            case 2:
                resultat = KelvinVersCelcius(valeur);
                System.out.println(valeur + " degré Kelvin est égal à " + resultat + " degrés Celsius");
                break;
            case 3:
                resultat = FarenheitVersCelcius(valeur);
                System.out.println(valeur + " degré Fahrenheit est égal à " + resultat + " degrés Celsius");
                break;
            case 4:
                resultat = CelciusVersFarenheit(valeur);
                System.out.println(valeur + " degré Celsius est égal à " + resultat + " degrés Fahrenheit");
                break;
            case 5:
                resultat = KelvinVersFarenheit(valeur);
                System.out.println(valeur + " degré Kelvin est égal à " + resultat + " degrés Fahrenheit");
                break;
            case 6:
                resultat = FarenheitVersKelvin(valeur);
                System.out.println(valeur + " degré Fahrenheit est égal à " + resultat + " degrés Kelvin");
                break;
            default:
                System.out.println("Choix non valide.");
                break;
        }

        scanner.close();
    }
}

   
    
     
     
    
    


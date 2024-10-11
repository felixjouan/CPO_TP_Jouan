/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_jouan;

/**
 *
 * @author felix
 */
public class TP1_guessMyNumber_Jouan {

    /**
     * @param args the command line arguments
     */
 import java.util.Random;
    public static void main(String[] args) {
     Random generateurAleat = new Random();

        // Affichage de 5 nombres aléatoires
        for (int i = 0; i < 5; i++) {
            int n = generateurAleat.nextInt(100); // Génère un nombre entre 0 et 100 inclus
            System.out.println("Nombre aléatoire " + (i + 1) + " : " + n);
     
        Random generateurAleat = new Random();
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de choisir un niveau de difficulté
        System.out.println("Choisissez un niveau de difficulté :");
        System.out.println("1) Facile (nombre entre 0 et 100, tentatives illimitées)");
        System.out.println("2) Normal (nombre entre 0 et 100, 10 tentatives)");
        System.out.println("3) Difficile (nombre entre 0 et 1000, 7 tentatives)");
        int choixDifficulte = scanner.nextInt();

        int nombreAleatoire;
        int nombreMax;
        int maxTentatives;

        // Configuration selon le niveau de difficulté
        switch (choixDifficulte) {
            case 1:
                nombreMax = 100;
                maxTentatives = Integer.MAX_VALUE; // Tentatives illimitées
                break;
            case 2:
                nombreMax = 100;
                maxTentatives = 10; // 10 tentatives en mode normal
                break;
            case 3:
                nombreMax = 1000;
                maxTentatives = 7; // 7 tentatives en mode difficile
                break;
            default:
                System.out.println("Choix invalide, passage en mode normal par défaut.");
                nombreMax = 100;
                maxTentatives = 10;
        }

        // Génération du nombre aléatoire
        nombreAleatoire = generateurAleat.nextInt(nombreMax + 1); // Nombre entre 0 et nombreMax

        int tentative = 0;
        int nombreUtilisateur = -1;

        // Boucle de jeu
        while (tentative < maxTentatives && nombreUtilisateur != nombreAleatoire) {
            System.out.print("Saisissez un nombre entre 0 et " + nombreMax + " : ");
            nombreUtilisateur = scanner.nextInt();
            tentative++;

            // Comparaison des nombres et affichage des messages
            if (nombreUtilisateur < nombreAleatoire) {
                if (Math.abs(nombreAleatoire - nombreUtilisateur) > (nombreMax / 4)) {
                    System.out.println("Vraiment trop petit !");
                } else {
                    System.out.println("Trop petit !");
                }
            } else if (nombreUtilisateur > nombreAleatoire) {
                if (Math.abs(nombreUtilisateur - nombreAleatoire) > (nombreMax / 4)) {
                    System.out.println("Vraiment trop grand !");
                } else {
                    System.out.println("Trop grand !");
                }
            } else {
                System.out.println("Gagné !");
            }
        }

        // Affichage du résultat à la fin
        if (nombreUtilisateur == nombreAleatoire) {
            System.out.println("Bravo ! Vous avez trouvé le nombre en " + tentative + " tentatives.");
        } else {
            System.out.println("Désolé, vous avez épuisé vos tentatives. Le nombre était : " + nombreAleatoire);
        }

        // Fermeture du scanner
        scanner.close();
    }
}

    }
    

    

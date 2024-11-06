/*
 * felix
 * Jouan
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_jouan;

/**
 *
 * @author felix
 */
public class TP2_convertisseurObjet_Jouan {
//Création de la classe Convertisseur
        int nbConversions=0; //Initialisation de la variable qui compte le nombre de conversions effectuées
       
    public double CelciusVersKelvin (double tCelcius) { 
           
        nbConversions++;
        double tKelvin;
        tKelvin=tCelcius+273.15;
        return tKelvin;
           
        }
        public double KelvinVersCelcius (double tKelvin) { //Création de la deuxime méthode qui convertie les Kelvin en degrés Celcius
            nbConversions++;
            double tCelcius;
            tCelcius=tKelvin-273.15;
            return tCelcius;
        }
        public double FarenheitVersCelcius (double tFarenheit) { //Création de la troisième méthode qui convertie les degrés Farenheit en degrés Celcius
            nbConversions++;
            double tCelcius;
            tCelcius=(tFarenheit-32)*1.8;
            return tCelcius;
        }
        public double CelciusVersFarenheit (double tCelcius) { //Création de la quatrième méthode qui convertie les degrés Celcius en degrés Farenheit
            nbConversions++;
            double tFarenheit;
            tFarenheit=tCelcius/1.8+32;
            return tFarenheit;
        }
        public double KelvinVersFarenheit (double tKelvin) { //Création de la cinquième méthode qui convertie les Kelvin en degrés Farenheit
            nbConversions++;
            double tFarenheit = ((tKelvin -273.15)*1.8)+32;
            return tFarenheit;
        }
        public double FarenheitVersKelvin (double tFarenheit) { //Création de la sixième méthode qui convertie les degrés Farenheit en Kelvin
            nbConversions++;
            double tKelvin = ((tFarenheit-32)/1.8)+273.15;
            return tKelvin;
        }

        @Override
        public String toString () { // Création de la méthode toString, qui permet d'afficher le nombre de conversion effectuées par l'objet
        return "nb de conversions"+ nbConversions;
}
       
}


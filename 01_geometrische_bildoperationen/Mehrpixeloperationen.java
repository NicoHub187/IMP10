
import imp.*;
import java.awt.Color;
/**
 * Beschreiben Sie hier die Klasse Mehrpixeloperationen.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Mehrpixeloperationen
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    /**
     * Konstruktor für Objekte der Klasse Mehrpixeloperationen
     */
    public Mehrpixeloperationen()
    {
        // Instanzvariable initialisieren
        x = 0;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int beispielMethode(int y)
    {
        // tragen Sie hier den Code ein
        return x + y;
    }
    public Picture weichzeichnen (Picture originalbild) {
        
    }
    public Picture faltung(Picture originalbild) { //double[][] filter
         int filter [][] = new int [3][3];
        filter [0][0] = -1;
        filter [1][0] = -2;
        filter [2][0] = -1;
        filter [0][1] = 0;
        filter [1][1] = 0;
        filter [2][1] = 0;
        filter [0][2] = 1;
        filter [1][2] = 2;
        filter [2][2] = 1;
        
        Color[][] pixel = originalbild.getPixelArray();
       Color[][] pixelNeu = originalbild.getPixelArray();
       double rot = 0.0;
       double gruen = 0.0;
       double blau = 0.0;
       int laenge = filter.length; 
       int halb = laenge / 2; 
    }    

}

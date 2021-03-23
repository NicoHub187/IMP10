import imp.*;
import java.awt.Color;
import java.util.Random;
/**
 * Beschreiben Sie hier die Klasse Mehrpixeloperationen.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Mehrpixeloperationen
{
    
    /**
     * Konstruktor für Objekte der Klasse Mehrpixeloperationen
     */
    public Picture Faltung(Picture originalbild) {
       Color[][] pixel = originalbild.getPixelArray();
       Color[][] pixelNeu = originalbild.getPixelArray();
       int länge;
       int half = länge/2;
       double Rot;
       double Grün;
       double Blau;
       for(int x=half; x < originalbild.getWidth() - half; x++) {
            for(int y=half;y < originalbild.getHeight() - half; y++) {
              int x2 = x - half;
              int y2 = y - half;
              pixelNeu[x][y] = new Color ((int) rot, (int) grün, (int) blau);
               for(int a=0; a < länge; a++) {
                 for(int b=0;b < länge; b++) {
                  
                }
              }
            }
        }
       
       Picture neuesBild = new Picture();
       neuesBild.setPixelArray(pixelNeu); 
       return neuesBild;
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
        
    }
}

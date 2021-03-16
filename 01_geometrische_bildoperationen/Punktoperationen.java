import imp.*;
import java.awt.Color;
import java.util.Random;

/**
 * Beschreiben Sie hier die Klasse Punktoperationen.
 * 
 * @author Clemens 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Punktoperationen
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    /**
     * Konstruktor für Objekte der Klasse Punktoperationen
     */
    public Picture graustufenDurchschnitt(Picture originalbild) {
        int breite = originalbild.getWidth();
        int hoehe  = originalbild.getHeight();

        Color[][] pixel = originalbild.getPixelArray();
        Color[][] pixelNeu = new Color[breite][hoehe];
        int color;
        Color farbe;
         for(int x=0; x < breite; x++) {
            for(int y=0;y < hoehe; y++) {
              color = (pixel[x][y].getRed() + pixel[x][y].getGreen() + pixel[x][y].getBlue())/3;
              farbe = new Color (color,color,color);
              pixelNeu[x][y] = farbe;
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
        return x + y;
    }
}

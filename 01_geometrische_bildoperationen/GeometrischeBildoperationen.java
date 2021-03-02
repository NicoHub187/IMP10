import imp.*;
import java.awt.Color;
import java.util.Random;

/**
 * Algorithmen zur Änderung der Pixelpositionen eines Pictures
 * z.B. drehen, spiegeln usw.
 *
 * @author Clemens Schulmeister
 * @version 1.1**/
public class GeometrischeBildoperationen 
{
    /** spiegeleHorizontal spiegelt das Bild, so dass rechts und links getauscht werden
     * @param originalbild Ein Bild (Picture), das gespiegelt werden soll
     * @return Eine gespiegelte Kopie des Bildes
     */

//die anderen Methoden nicht löschen, brauchen wir alle später noch!
//ich habe die Methoden nur umbenannt, jetzt aber die erste nochmal erstellt 
    public  Picture dreheRechts(Picture originalbild) {
        int breite = originalbild.getWidth();
        int hoehe  = originalbild.getHeight();

        Color[][] pixel = originalbild.getPixelArray();
        Color[][] pixelNeu = new Color[hoehe][breite];

         for(int x=0; x < hoehe; x++) {
            for(int y=0;y < breite; y++) {
                pixelNeu[x][y] = pixel[y][(hoehe-1)-x];// noch nicht ganz richtig, da du einmal zuviel von oben nach unten spiegelst.
                                                          //müsste jetzt richtig sein
            }
        }

        Picture neuesBild = new Picture();
        neuesBild.setPixelArray(pixelNeu); 
        return neuesBild;
    }
public  Picture dreheLinks(Picture originalbild) {
        int breite = originalbild.getWidth();
        int hoehe  = originalbild.getHeight();

        Color[][] pixel = originalbild.getPixelArray();
        Color[][] pixelNeu = new Color[hoehe][breite];

         for(int x=0; x < hoehe; x++) {
            for(int y=0;y < breite; y++) {
                pixelNeu[x][y] = pixel[(breite-1)-y][x];//auch nicht richtig, kannst du das Ergebnis nicht prüfen?
                                                        //habe ich auch korrigiert
            }
        }

        Picture neuesBild = new Picture();
        neuesBild.setPixelArray(pixelNeu); 
        return neuesBild;
    }
public  Picture spiegeleHorizontal(Picture originalbild) {
        int breite = originalbild.getWidth();
        int hoehe  = originalbild.getHeight();

        Color[][] pixel = originalbild.getPixelArray();
        Color[][] pixelNeu = new Color[breite][hoehe];

        for(int x=0; x < breite; x++) {
            for(int y=0;y < hoehe; y++) {
                pixelNeu[x][y] = pixel[(breite-1)-x][y];
            }
        }

        Picture neuesBild = new Picture();
        neuesBild.setPixelArray(pixelNeu); 
        return neuesBild;
    }
public  Picture drehe180(Picture originalbild) {
        int breite = originalbild.getWidth();
        int hoehe  = originalbild.getHeight();

        Color[][] pixel = originalbild.getPixelArray();
        Color[][] pixelNeu = new Color[breite][hoehe];

         for(int x=0; x < breite; x++) {
            for(int y=0;y < hoehe; y++) {
                pixelNeu[x][y] = pixel[(breite-1)-x][(hoehe-1)-y];
            }
        }

        Picture neuesBild = new Picture();
        neuesBild.setPixelArray(pixelNeu); 
        return neuesBild;
    }

}

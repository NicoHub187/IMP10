import imp.*;
import java.awt.Color;
import java.util.Random;

/**
 * Algorithmen zur Änderung der Pixelpositionen eines Pictures
 * z.B. drehen, spiegeln usw.
 *
 * @author Thomas Schaller
 * @author Sara Wulhorst
 * @version 1.1 (23.02.2021)
 */
public class GeometrischeBildoperationen 
{
    /** spiegeleHorizontal spiegelt das Bild, so dass rechts und links getauscht werden
     * @param originalbild Ein Bild (Picture), das gespiegelt werden soll
     * @return Eine gespiegelte Kopie des Bildes
     */

    public  Picture spiegelHorizontal(Picture originalbild) {
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
    public Picture dreheUm90GradLinks(Picture originalbild) {
        int breite = originalbild.getHeight();
        int hoehe = originalbild.getWidth();
        
        Color[][] pixel = originalbild.getPixelArray();
        Color[][] pixelNeu = new Color[breite][hoehe];
        
        for(int x=0; x < breite; x++) {
            for(int y=0; y < hoehe; y++) {
                pixelNeu[x][y] = pixel[(hoehe-1)-y][x];
            }
        }
    
        Picture neuesBild = new Picture();
        neuesBild.setPixelArray(pixelNeu);
        return neuesBild;
    }
    public Picture dreheUm90GradRechts(Picture originalbild){
        int breite = originalbild.getHeight();
        int hoehe = originalbild.getWidth();
        
        Color[][] pixel = originalbild.getPixelArray();
        Color[][] pixelNeu = new Color[breite][hoehe];
        
        for(int x=0; x < breite; x++) {
            for(int y=0; y < hoehe; y++) {
                pixelNeu[x][y] = pixel[y][(breite-1)-x];
            }
        }
        
        Picture neuesBild = new Picture();
        neuesBild.setPixelArray(pixelNeu);
        return neuesBild;
    }
    }
        

    




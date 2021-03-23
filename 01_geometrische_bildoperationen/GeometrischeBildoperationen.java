import imp.*;
import java.awt.Color;
import java.util.Random;

/**
 * Algorithmen zur Änderung der Pixelpositionen eines Pictures
 * z.B. drehen, spiegeln usw.
 *
 * @author Thomas Schaller
 * @author Henriette Rupp
 * @version 1.1
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
    
    public  Picture spiegelVertikal(Picture originalbild) {
        int breite = originalbild.getWidth();
        int hoehe  = originalbild.getHeight();

        Color[][] pixel = originalbild.getPixelArray();
        Color[][] pixelNeu = new Color[breite][hoehe];

        for(int x=0; x < breite; x++) {
            for(int y=0;y < hoehe; y++) {
                pixelNeu[x][y] = pixel[x][breite-1-y];
            }
        }

        Picture neuesBild = new Picture();
        neuesBild.setPixelArray(pixelNeu); 
        return neuesBild;
    }

    public Picture dreheUm90Grad(Picture originalbild){
        int breite = originalbild.getHeight(); // auch hier musst du umstellen
        int hoehe  = originalbild.getWidth();
        
        Color[][] pixel = originalbild.getPixelArray();
        Color[][] pixelNeu = new Color[breite][hoehe];
        
        //Color[][] bildNeu = new Color[breite][hoehe];
        
        for(int x=0; x < breite; x++) {
            for(int y=0;y < hoehe; y++) {
                pixelNeu[x][y] = pixel[(hoehe-1)-y][x]; // hier ist der Fehler
            }
        }
        
        Picture neuesBild = new Picture();
        neuesBild.setPixelArray(pixelNeu); // du hast ja pixelNeu benutzt um dein neues Bild zu erzeugen
        return neuesBild;
    }    
    
    public Picture dreheUm270Grad(Picture originalbild){
        int breite = originalbild.getHeight(); // auch hier musst du umstellen
        int hoehe  = originalbild.getWidth();
        
        Color[][] pixel = originalbild.getPixelArray();
        Color[][] pixelNeu = new Color[breite][hoehe];
        
        //Color[][] bildNeu = new Color[breite][hoehe];
        
        for(int x=0; x < breite; x++) {
            for(int y=0;y < hoehe; y++) {
                pixelNeu[x][y] = pixel[y][breite-1-x]; // hier ist der Fehler
            }
        }
        
        Picture neuesBild = new Picture();
        neuesBild.setPixelArray(pixelNeu); // du hast ja pixelNeu benutzt um dein neues Bild zu erzeugen
        return neuesBild;
    }    
    
    public Picture dreheUm180Grad(Picture originalbild){
        int breite = originalbild.getHeight(); // auch hier musst du umstellen
        int hoehe  = originalbild.getWidth();
        
        Color[][] pixel = originalbild.getPixelArray();
        Color[][] pixelNeu = new Color[breite][hoehe];
        
        //Color[][] bildNeu = new Color[breite][hoehe];
        
        for(int x=0; x < breite; x++) {
            for(int y=0;y < hoehe; y++) {
                pixelNeu[x][y] = pixel[hoehe-1-x][breite-1-y]; // hier ist der Fehler
            }
        }
        
        Picture neuesBild = new Picture();
        neuesBild.setPixelArray(pixelNeu); // du hast ja pixelNeu benutzt um dein neues Bild zu erzeugen
        return neuesBild;
    }    

}

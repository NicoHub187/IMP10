import imp.*;
import java.awt.Color;
import java.util.Random;

/**
 * Algorithmen zur Änderung der Pixelpositionen eines Pictures
 * z.B. drehen, spiegeln usw.
 *
 * @author Thomas Schaller
 * @author Uli Göppert
 * @version 1.1 (28.11.2019)
 */
public class Punktoperationen 
{
    /** spiegeleHorizontal spiegelt das Bild, so dass rechts und links getauscht werden
     * @param originalbild Ein Bild (Picture), das gespiegelt werden soll
     * @return Eine gespiegelte Kopie des Bildes
     */

    public  Picture graustufenDurchschnitt(Picture originalbild) {
        int breite = originalbild.getHeight(); // auch hier musst du umstellen
        int hoehe  = originalbild.getWidth();
        
        Color[][] pixel = originalbild.getPixelArray();
        Color[][] pixelNeu = new Color[breite][hoehe];
        for(int x=0; x < breite; x++){
            for(int y=0; y < hoehe; y++){
                int rotanteil = 0;
                rotanteil = pixel[x][y].getRed();
                int gruenanteil = 0;
                gruenanteil = pixel[x][y].getGreen();
                int blauanteil = 0;
                blauanteil = pixel[x][y].getBlue();
                
                int durchschnitt = 0;
                durchschnitt = (rotanteil + gruenanteil + blauanteil) / 3;
                
                Color Farbeneu;
                pixelNeu[x][y] = new Color(durchschnitt, durchschnitt, durchschnitt);
            }
        }
        
        Picture neuesBild = new Picture();
        neuesBild.setPixelArray(pixelNeu); 
        return neuesBild;
    }
    
    public Picture graustufenMin(Picture originalbild) {
        int breite = originalbild.getWidth();
        int hoehe = originalbild.getHeight();
        
        Color[][] pixel = originalbild.getPixelArray();
        Color[][] pixelNeu = new Color[breite][hoehe];
        
        for(int x=0; x < breite; x++) {
            for(int y=0; y < hoehe; y++) {
                int grau = 0;
                grau = pixel[x][y].getRed();
                
                int gruenanteil = 0;
                gruenanteil = pixel[x][y].getGreen();
                if (grau > gruenanteil) grau = gruenanteil;
                int blauanteil = 0;
                blauanteil = pixel[x][y].getBlue();
                if (grau > blauanteil) grau = blauanteil;
                
                pixelNeu[x][y] = new Color (grau, grau, grau);
            }
        }
        
        Picture neuesBild = new Picture();
        neuesBild.setPixelArray(pixelNeu);
        return neuesBild;
    }
    
    public Picture graustufenMax(Picture originalbild) {
        int breite = originalbild.getWidth();
        int hoehe = originalbild.getHeight();
        
        Color[][] pixel = originalbild.getPixelArray();
        Color[][] pixelNeu = new Color[breite][hoehe];
        
        for(int x=0; x < breite; x++) {
            for(int y=0; y < hoehe; y++) {
                int grau = 0;
                grau = pixel[x][y].getRed();
                
                int gruenanteil = 0;
                gruenanteil = pixel[x][y].getGreen();
                if (grau < gruenanteil) grau = gruenanteil;
                int blauanteil = 0;
                blauanteil = pixel[x][y].getBlue();
                if (grau < blauanteil) grau = blauanteil;
                
                pixelNeu[x][y] = new Color (grau, grau, grau);
            }
        }
        
        Picture neuesBild = new Picture();
        neuesBild.setPixelArray(pixelNeu);
        return neuesBild;
    }
    
    public Picture graustufenNatuerlich(Picture originalbild){
        int breite = originalbild.getWidth();
        int hoehe = originalbild.getHeight();
        
        Color[][] pixel = originalbild.getPixelArray();
        Color[][] pixelNeu = new Color[breite][hoehe];
        for(int x=0; x < breite; x++) {
            for(int y=0; y < hoehe; y++) {
                int rotanteil = 0;
                rotanteil = pixel[x][y].getRed;
                int rotanteilNeu = rotanteil * 0.299;
                
                int gruenanteil = 0;
                gruenanteil = pixel[x][y].getBlue;
                int gruenanteilNeu = gruenanteil * 0.587;
                
                int blauanteil = 0;
                blauanteil = pixel[x][y].getBlue;
                int blauanteilNeu = blauanteil * 0.114;
                
                pixelNeu[x][y] = new Color (rotanteilNeu, gruenanteilNeu, blauanteilNeu);
            }
        }
        
        Picture neuesBild = new Picture();
        neuesBild.setPixelArray(pixelNeu);
        return neuesBild;
    }
    
}

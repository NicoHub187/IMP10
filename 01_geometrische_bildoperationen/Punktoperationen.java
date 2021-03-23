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
    public Picture graustufenMin (Picture originalbild){
        int breite = originalbild.getWidth();
        int hoehe  = originalbild.getHeight();

        Color[][] pixel = originalbild.getPixelArray();
        Color[][] pixelNeu = new Color[breite][hoehe];
        int color;
        Color farbe;
        for(int x=0; x < breite; x++) {
            for(int y=0;y < hoehe; y++) {
              color = pixel [x][y].getBlue();
              if (color < pixel [x][y].getRed()){
                 color = pixel[x][y].getRed(); 
              }
              if (color < pixel [x][y].getGreen()){
                 color = pixel[x][y].getGreen(); 
              }
              if (color < pixel [x][y].getBlue()){
                 color = pixel[x][y].getBlue(); 
              }
              farbe = new Color (color,color,color);
              pixelNeu[x][y] = farbe;
            }
        }
        Picture neuesBild = new Picture();
        neuesBild.setPixelArray(pixelNeu); 
        return neuesBild;
        //ist nur ein minimaler Unterschied zum Original
    }
    public Picture graustufenMax (Picture originalbild){
        int breite = originalbild.getWidth();
        int hoehe  = originalbild.getHeight();

        Color[][] pixel = originalbild.getPixelArray();
        Color[][] pixelNeu = new Color[breite][hoehe];
        int color;
        Color farbe;
        for(int x=0; x < breite; x++) {
            for(int y=0;y < hoehe; y++) {
              color = pixel [x][y].getBlue();
              if (color > pixel [x][y].getRed()){
                 color = pixel[x][y].getRed(); 
              }
              if (color > pixel [x][y].getGreen()){
                 color = pixel[x][y].getGreen(); 
              }
              if (color > pixel [x][y].getBlue()){
                 color = pixel[x][y].getBlue(); 
              }
              farbe = new Color (color,color,color);
              pixelNeu[x][y] = farbe;
            }
        }
        Picture neuesBild = new Picture();
        neuesBild.setPixelArray(pixelNeu); 
        return neuesBild;
    }
    public Picture graustufenNatuerlich (Picture originalbild){
        int breite = originalbild.getWidth();
        int hoehe  = originalbild.getHeight();

        Color[][] pixel = originalbild.getPixelArray();
        Color[][] pixelNeu = new Color[breite][hoehe];
        int color;
        Color farbe;
        for(int x=0; x < breite; x++) {
          for(int y=0;y < hoehe; y++) {
            color = pixel[x][y].getRed()*0.299 + pixel[x][y].getGreen()*0.587 + pixel[x][y].getBlue()*0.114; 
            farbe = new Color (color,color,color);
            pixelNeu[x][y] = farbe;  
          }
        }
        Picture neuesBild = new Picture();
        neuesBild.setPixelArray(pixelNeu); 
        return neuesBild;
    }
}

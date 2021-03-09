import imp.*;
import java.awt.Color;
import java.util.Random;
/**
 * Beschreiben Sie hier die Klasse Punktoperation.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Punktoperation
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    /**
     * Konstruktor für Objekte der Klasse Punktoperation
     */
    public Punktoperation()
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
    public Picture graustufenDurchschnitt(Picture originalbild) {
        int breite = originalbild.getWidth();
        int hoehe = originalbild.getHeight();
        Color[][] pixel = originalbild.getPixelArray();
        Color[][] pixelNeu = new Color[breite][hoehe];
        
        int c;
        Color farbe;
        for(int x=0; x < breite; x++) {
            for(int y=0; y < hoehe; y++) {
              c = (pixel[x][y].getBlue()+pixel[x][y].getRed()+pixel[x][y].getGreen())/3;
              farbe = new Color(c,c,c);
              pixelNeu[x][y] = farbe;
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
        
        int c = 0;
        int r;
        int g;
        int b;
        Color farbe;
        for(int x=0; x < breite; x++) {
            for(int y=0; y < hoehe; y++) {
              r = pixel[x][y].getRed();
              b = pixel[x][y].getBlue();
              g = pixel[x][y].getGreen();
              if(r>g){
                  if(r>b){
                    c = r;  
                    }
                    else{
                       c = b;
                    }
                }
                else{
                    if(g>b){
                       c = g; 
                    }
                    else{
                        c = b;
                    }
                }
              farbe = new Color(c,c,c);
              pixelNeu[x][y] = farbe;
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
        
        int c = 0;
        int r;
        int g;
        int b;
        Color farbe;
        for(int x=0; x < breite; x++) {
            for(int y=0; y < hoehe; y++) {
              r = pixel[x][y].getRed();
              b = pixel[x][y].getBlue();
              g = pixel[x][y].getGreen();
              if(r<g){
                  if(r<b){
                    c = r;  
                    }
                    else{
                       c = b;
                    }
                }
                else{
                    if(g<b){
                       c = g; 
                    }
                    else{
                        c = b;
                    }
                }
              farbe = new Color(c,c,c);
              pixelNeu[x][y] = farbe;
            }
        }
        Picture neuesBild = new Picture();
        neuesBild.setPixelArray(pixelNeu);
        return neuesBild;
        
    }
    private int runden(double value) {
      return (int) value;
   }
    public Picture graustufenNatürlich(Picture originalbild) {
        int breite = originalbild.getWidth();
        int hoehe = originalbild.getHeight();
        Color[][] pixel = originalbild.getPixelArray();
        Color[][] pixelNeu = new Color[breite][hoehe];
        
        double c = 0;
        int r;
        
        Color farbe;
        for(int x=0; x < breite; x++) {
            for(int y=0; y < hoehe; y++) {
              c = pixel[x][y].getBlue()*0.114+pixel[x][y].getRed()*0.299+pixel[x][y].getGreen()*0.587;
              r = runden(c);
              farbe = new Color(r,r,r);
              pixelNeu[x][y] = farbe;
            }
        }
        
        Picture neuesBild = new Picture();
        neuesBild.setPixelArray(pixelNeu);
        return neuesBild;
        
    }
}


import imp.*;
import java.awt.Color;
import java.util.Random;
/**
 * Beschreiben Sie hier die Klasse Punktoperationen.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Punktoperationen
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    /**
     * Konstruktor für Objekte der Klasse Punktoperationen
     */
    public Punktoperationen()
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
        return 100 + 50;
    }
    
    
    
        public Picture graustufenDurchschnitt(Picture originalbild){
        int breite = originalbild.getWidth();
        int hoehe = originalbild.getHeight();
        
        Color[][] pixel = originalbild.getPixelArray();
        Color[][] pixelNeu = new Color[breite][hoehe];
        int c;
        
        for(int x=0; x < breite; x++) {
            for(int y=0;y < hoehe; y++) {
                c = (int) (pixel[x][y].getRed()+ pixel[x][y].getGreen()+ pixel[x][y].getBlue())/ 3;
                pixelNeu[x][y] = new Color(c,c,c);
            }
        }
         Picture neuesBild = new Picture();
        neuesBild.setPixelArray(pixelNeu); 
        return neuesBild;  
        
        
  }
    
     public Picture graustufenMin(Picture originalbild){
        int breite = originalbild.getWidth();
        int hoehe = originalbild.getHeight();
        
        Color[][] pixel = originalbild.getPixelArray();
        Color[][] pixelNeu = new Color[breite][hoehe];
        int c;
        
        for(int x=0; x < breite; x++) {
           for(int y=0;y < hoehe; y++) {
                c = pixel [x][y].getRed();
                if (c > pixel[x][y].getGreen()) c = pixel [x][y].getGreen();
                if (c > pixel[x][y].getBlue()) c = pixel [x][y].getBlue();
                pixelNeu[x][y] = new Color(c,c,c);
        }
    }
         Picture neuesBild = new Picture();
        neuesBild.setPixelArray(pixelNeu); 
        return neuesBild;  
        
        
  }
  
  
  
  
}

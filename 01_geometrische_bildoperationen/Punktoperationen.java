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

    /**
     * Konstruktor für Objekte der Klasse Punktoperationen
     */
    public Picture graustufenDurchschnitt(Picture originalbild)
    { int a;
        Color farbe;
        int breite = originalbild.getWidth();
        int hoehe = originalbild.getHeight();
        Color[][]pixel = originalbild.getPixelArray();
        Color[][]pixelNew = new Color[breite][hoehe];
        for(int x=0; x<breite; x++){
            for(int y=0; y<hoehe; y++){
                a = (pixel[x][y].getRed()+pixel[x][y].getGreen()+pixel[x][y].getBlue())/3;
                farbe = new Color(a,a,a);
                pixelNew[x][y] = farbe;
            }
        }
        Picture neuesBild = new Picture();
        neuesBild.setPixelArray(pixelNew); 
        return neuesBild;
    }

    public Picture graustufenMax(Picture originalbild)
    { int a=0;
        Color farbe;
        int breite = originalbild.getWidth();
        int hoehe = originalbild.getHeight();
        Color[][]pixel = originalbild.getPixelArray();
        Color[][]pixelNew = new Color[breite][hoehe];
        for(int x=0; x<breite; x++){
            for(int y=0; y<hoehe; y++){

               
                a=pixel[x][y].getRed();

                if(a<pixel[x][y].getGreen()){
                    a=pixel[x][y].getGreen();
                }
                if(a<pixel[x][y].getBlue()){
                    a=pixel[x][y].getBlue();
                }
                farbe = new Color(a,a,a);
                pixelNew[x][y] = farbe;
            }
        }
        Picture neuesBild = new Picture();
        neuesBild.setPixelArray(pixelNew); 
        return neuesBild;
    }

    public Picture graustufenMin(Picture originalbild)
    { int a;
        Color farbe;
        int breite = originalbild.getWidth();
        int hoehe = originalbild.getHeight();
        Color[][]pixel = originalbild.getPixelArray();
        Color[][]pixelNew = new Color[breite][hoehe];
        for(int x=0; x<breite; x++){
            for(int y=0; y<hoehe; y++){
                a = pixel[x][y].getRed();
                if(a>pixel[x][y].getBlue()){
                    a=pixel[x][y].getBlue();
                }
                if(a>pixel[x][y].getGreen()){
                    a=pixel[x][y].getGreen();
                }
                farbe = new Color(a,a,a);
                pixelNew[x][y] = farbe;
            }
        }
        Picture neuesBild = new Picture();
        neuesBild.setPixelArray(pixelNew); 
        return neuesBild;
    }
    private int runden(double value) {
      return (int) value;
   }
   public Picture graustufenNatuerlich(Picture originalbild)
    { double r;//noch nicht fertig
      double g;
      double b;
        Color farbe;
        int breite = originalbild.getWidth();
        int hoehe = originalbild.getHeight();
        Color[][]pixel = originalbild.getPixelArray();
        Color[][]pixelNew = new Color[breite][hoehe];
        for(int x=0; x<breite; x++){
            for(int y=0; y<hoehe; y++){
                r=pixel[x][y].getGreen();
                b=pixel[x][y].getBlue();
                g=pixel[x][y].getRed();
                farbe = new Color(r,g,b);
                pixelNew[x][y] = farbe;
            }
        }
        Picture neuesBild = new Picture();
        neuesBild.setPixelArray(pixelNew); 
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
        return y;
    }
}

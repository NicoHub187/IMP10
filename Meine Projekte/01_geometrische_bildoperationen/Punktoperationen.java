
import imp.*;
import java.awt.Color;
import java.util.Random;
/**
 * 
 * 
 * @author Paul
 * 
 */
public class Punktoperationen
{
    public  Picture Schwarz_weiß_convert(Picture originalbild) {
        int breite = originalbild.getWidth();
        int hoehe  = originalbild.getHeight();

        Color[][] pixel = originalbild.getPixelArray();
        Color[][] pixelNeu = new Color[breite][hoehe];
        int c;
        Color farbe;

        for(int x=0; x < breite; x++) {
            for(int y=0;y < hoehe; y++) {
                c = (pixel[x][y].getBlue() + pixel[x][y].getGreen() + pixel[x][y].getRed()) / 3;
                farbe = new Color(c,c,c);
                pixelNeu[x][y] = farbe;
            }
        }

        Picture neuesBild = new Picture();
        neuesBild.setPixelArray(pixelNeu); 
        return neuesBild;
    }
    public  Picture Schwarz_weiß_convert_nat(Picture originalbild) {
        int breite = originalbild.getWidth();
        int hoehe  = originalbild.getHeight();

        Color[][] pixel = originalbild.getPixelArray();
        Color[][] pixelNeu = new Color[breite][hoehe];
        int c;
        Color farbe;

        for(int x=0; x < breite; x++) {
            for(int y=0;y < hoehe; y++) {
                //durchschnitt mit mit % berechnen und runden
                c = runden((pixel[x][y].getBlue()  * 0.114+ pixel[x][y].getGreen() * 0.587+ pixel[x][y].getRed() * 0.299) / 3);
                
                farbe = new Color(c,c,c);
                pixelNeu[x][y] = farbe;
            }
        }

        Picture neuesBild = new Picture();
        neuesBild.setPixelArray(pixelNeu); 
        return neuesBild;
    }
    public  Picture Schwarz_weiß_max (Picture originalbild) {
        int breite = originalbild.getWidth();
        int hoehe  = originalbild.getHeight();

        Color[][] pixel = originalbild.getPixelArray();
        Color[][] pixelNeu = new Color[breite][hoehe];
        int c;
        Color farbe;

        for(int x=0; x < breite; x++) {
            for(int y=0;y < hoehe; y++) {
                c = pixel[x][y].getBlue(); 
                if (c < pixel[x][y].getGreen()){
                    c = pixel[x][y].getGreen();
                }
                if (c < pixel[x][y].getRed()){
                    c = pixel[x][y].getRed();
                }
                if (c < pixel[x][y].getBlue()){
                    c = pixel[x][y].getBlue();
                }
                farbe = new Color(c,c,c);
                pixelNeu[x][y] = farbe;
            }
        }

        Picture neuesBild = new Picture();
        neuesBild.setPixelArray(pixelNeu); 
        return neuesBild;
    }
    
    public  Picture Schwarz_weiß_min (Picture originalbild) {
        int breite = originalbild.getWidth();
        int hoehe  = originalbild.getHeight();

        Color[][] pixel = originalbild.getPixelArray();
        Color[][] pixelNeu = new Color[breite][hoehe];
        int c;
        Color farbe;

        for(int x=0; x < breite; x++) {
            for(int y=0;y < hoehe; y++) {
                c = pixel[x][y].getBlue(); 
                if (c > pixel[x][y].getGreen()){
                    c = pixel[x][y].getGreen();
                }
                if (c > pixel[x][y].getRed()){
                    c = pixel[x][y].getRed();
                }
                if (c > pixel[x][y].getBlue()){
                    c = pixel[x][y].getBlue();
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
    
}

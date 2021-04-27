import imp.*;
import java.awt.Color;
/**
 * Beschreiben Sie hier die Klasse Mehrpixeloperationen.
 * 
 * @author Frederik
 * @version 27.04.21
 */
public class Mehrpixeloperationen
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    /**
     * Konstruktor für Objekte der Klasse Mehrpixeloperationen
     */
    public Mehrpixeloperationen()
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
    public Picture faltung(Picture originalbild,double[][] filter) {

        Color[][] pixel = originalbild.getPixelArray();
        Color[][] pixelNeu = originalbild.getPixelArray();
        double rot = 0.0;
        double gruen = 0.0;
        double blau = 0.0;
        int laenge = filter.length;
        int halb = laenge / 2;

        for (int x = halb; x < originalbild.getWidth() - halb; x++){
            for (int y = halb; y < originalbild.getHeight() - halb; y++) {
                rot = 0.0;
                gruen = 0.0;
                blau = 0.0;

                for (int i = 0; i < laenge; i++) {
                    for (int j = 0; j < laenge; j++) {
                        int xx = x - halb;
                        int yy = y - halb;

                        rot += filter[i][j] * pixel[xx+i][yy+j].getRed(); 
                        gruen += filter[i][j] * pixel[xx+i][yy+j].getGreen(); 
                        blau += filter[i][j] * pixel[xx+i][yy+j].getBlue();

                    }
                }
                if(rot < 0.0) rot = 0.0; 
                if(rot > 255.0) rot = 255.0;
                if(gruen < 0.0) gruen = 0.0; 
                if(gruen > 255.0) gruen = 255.0;
                if(blau < 0.0) blau = 0.0; 
                if(blau > 255.0) blau = 255.0; 

                pixelNeu[x][y] = new Color((int)rot,(int) gruen,(int) blau);

            }
        }
        Picture neuesBild = new Picture(); 
        neuesBild.setPixelArray(pixelNeu);
        return neuesBild;
    }
}
        


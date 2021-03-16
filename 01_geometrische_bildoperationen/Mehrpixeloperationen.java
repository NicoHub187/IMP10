
import imp.*;
import java.awt.Color;

/**
 * Beschreiben Sie hier die Klasse Mehrpixeloperationen.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Mehrpixeloperationen
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen

    /**
     * Konstruktor für Objekte der Klasse Mehrpixeloperationen
     */
    public  Picture faltung(Picture originalbild//,double filter 
    )
    {   int filter [][] = new int [3][3]; //das ist der Filter
        filter [0][0] = -1;
        filter [1][0] = -2;
        filter [2][0] = -1;
        filter [0][1] = 0;
        filter [1][1] = 0;
        filter [2][1] = 0;
        filter [0][2] = 1;
        filter [1][2] = 2;
        filter [2][2] = 1;

        Color[][] pixel = originalbild.getPixelArray();
        Color[][] pixelNeu = originalbild.getPixelArray();
        int laenge = filter.length;
        int halb = laenge / 2;
        double rot = 0.0;
        double gruen = 0.0;
        double blau = 0.0;
        for (int x = halb; x < originalbild.getWidth() - halb; x++){ 
            for (int y = halb; y < originalbild.getHeight() - halb; y++) {
                int xx = x - halb;
                int yy = y - halb;
                pixelNeu[x][y] = new Color((int) rot, (int) gruen, (int) blau);

                for (int i = 0; i < laenge; i++) { 
                    for (int j = 0; j < laenge; j++) { 
                        rot += filter[i][j] * pixel[xx+i][yy+j].getRed();
                        gruen += filter[i][j] * pixel[xx+i][yy+j].getGreen();
                        blau += filter[i][j] * pixel[xx+i][yy+j].getBlue();
                        if(rot < 0.0) rot = 0.0;
                        if(rot > 255.0) rot = 255.0;
                        if(gruen < 0.0) gruen = 0.0;
                        if(gruen > 255.0) gruen = 255.0;
                        if(blau < 0.0) blau = 0.0;
                        if(blau > 255.0) blau = 255.0;
                    }
                }
            }
        }
        Picture neuesBild = new Picture();
        neuesBild.setPixelArray(pixelNeu);
        return neuesBild;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    
}

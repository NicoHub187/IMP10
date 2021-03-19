
import imp.*;
import java.awt.Color;
import java.util.Random;
/**
 * 
 * 
 * @author Paul
 * 
 * super !!!!!
 * 
 */
public class Mehrpixeloperationen{
    public Picture ____(Picture originalbild) {
        double filter [][] = new double [3][3];
        double x = 1.0 / 9.0 ;
        filter [0][0] = x;
        filter [1][0] = x;
        filter [2][0] = x;
        filter [0][1] = x;
        filter [1][1] = x;
        filter [2][1] = x;
        filter [0][2] = x;
        filter [1][2] = x;
        filter [2][2] = x;
        double y = 1.0 / 4.0 ;
        java.lang.System.out.println(filter [2][2]);
        java.lang.System.out.println(x);
        
        return faltung(originalbild,(double[][]) filter);
    
      }
    public Picture weich(Picture originalbild) {
        int filter_groesse = 3;
        double filter [][] = new double [3][3];
        double filter_content = 1.0 / 9.0 ;
            for (int i = 0;i < filter_groesse; i++ ){
                for (int n = 0;n < filter_groesse; n++ ){
                    filter [i][n] = filter_content;
                    
                }  
            }
        
        
        return faltung(originalbild,(double[][]) filter);
    
      }
  
     
    public Picture faltung(Picture originalbild,double[][] filter) {
       
        
       
         Color[][] pixel = originalbild.getPixelArray();
         Color[][] pixelNeu = originalbild.getPixelArray();
         double rot = 0.0;
         double gruen = 0.0;
         double blau = 0.0;
         int laenge = filter.length;
         java.lang.System.out.println(laenge);
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

    private int runden(double value) {
      return (int) value;
    }
    
}
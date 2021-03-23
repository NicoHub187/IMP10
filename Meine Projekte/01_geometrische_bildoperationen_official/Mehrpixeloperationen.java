
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
    public Picture ____ (Picture originalbild, int filter_groesse) {
        double l = 0;     
        
        double filter [][] = new double [filter_groesse][filter_groesse];
        
            for (int i = 0;i < filter_groesse; i++ ){
                for (int n = 0;n < filter_groesse; n++ ){
                    double x = -1 * (Math.sqrt(i)*Math.sqrt(n)) /  2 * Math.sqrt((filter_groesse / 6));
                    
                    filter [i][n] = Math.exp(x);
                    l = filter [i][n];
                    }  
            }
            for (int i = 0;i < filter_groesse; i++ ){
                for (int n = 0;n < filter_groesse; n++ ){
                    filter [i][n] = (l * -1) * filter [i][n];
                    
                   }  
            }
            
        
        
        return faltung(originalbild,(double[][]) filter);
    
    
     }
    public Picture relief(Picture originalbild) {
        double filter [][] = new double [3][3];
        
        filter [0][0] = -1;
        filter [1][0] = 1;
        filter [2][0] = -1;
        filter [0][1] = 1;
        filter [1][1] = 1;
        filter [2][1] = 1;
        filter [0][2] = -1;
        filter [1][2] = 1;
        filter [2][2] = -1;
        
        
        
        return faltung(originalbild,(double[][]) filter);
    
     }
    public Picture weich(Picture originalbild,int filter_groesse) {
        double filter [][] = new double [filter_groesse][filter_groesse];
        double filter_content = 1.0 /  (double)(filter_groesse * filter_groesse) ;
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
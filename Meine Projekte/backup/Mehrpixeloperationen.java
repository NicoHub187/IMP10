
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
     public Picture weich(Picture originalbild) {
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
  
     //,double[][] filter
    public Picture faltung(Picture originalbild,double[][] filter) {
       // // der Filter
      // int filter [][] = new int [3][3];
        // filter [0][0] = -1;
        // filter [1][0] = -2;
        // filter [2][0] = -1;
        // filter [0][1] = 0;
        // filter [1][1] = 0;
        // filter [2][1] = 0;
        // filter [0][2] = 1;
        // filter [1][2] = 2;
        // filter [2][2] = 1; 
        
       
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
           
           
          for (int i = 0; i < laenge; i++) {
            for (int j = 0; j < laenge; j++) {
                int xx = x - halb;
                int yy = y - halb;
           
                
                rot += filter[i][j] * pixel[xx+i][yy+j].getRed(); 
                gruen += filter[i][j] * pixel[xx+i][yy+j].getGreen(); 
                blau += filter[i][j] * pixel[xx+i][yy+j].getBlue();
                // java.lang.System.out.println("Red: " + rot);
                // java.lang.System.out.println("Green: " + gruen);
                // java.lang.System.out.println("Blue: " + blau);
                
                
                
                
            }
            }
          if(rot < 0.0) rot = 0.0; 
          if(rot > 255.0) rot = 2295.0;
          if(gruen < 0.0) gruen = 0.0; 
          if(gruen > 255.0) gruen = 2295.0;
          if(blau < 0.0) blau = 0.0; 
          if(blau > 255.0) blau = 2295.0; 
          // java.lang.System.out.println("G: "+gruen/ (filter.length ^2) );
          // java.lang.System.out.println("B: "+ blau/ (filter.length ^2));
          double r = rot / 9 ;
          double g =  gruen/ 9;  
          double b =  blau/ 9;
          if(rot < 0.0) r = 0.0; 
          if(rot > 255.0) r = 255.0;
          if(gruen < 0.0) g = 0.0; 
          if(gruen > 255.0) g = 255.0;
          if(blau < 0.0) b = 0.0; 
          if(blau > 255.0) b = 255.0;
          // java.lang.System.out.println("RGB_raw: " +runden(r)+" , "+runden(g)+" , "+runden(b));    
          pixelNeu[x][y] = new Color((int) runden(r),(int) runden(g),(int) runden(b));
          // java.lang.System.out.println("RGB: "+ pixelNeu[x][y] );
           
        

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
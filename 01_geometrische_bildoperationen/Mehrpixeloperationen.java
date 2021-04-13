
import imp.*;
import java.awt.Color;


public class Mehrpixeloperationen
{   public Picture relief(Picture originalbild) {
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
    public Picture ____(Picture originalbild){
        double filter[][] = new double [3][3];
        double x =1.0/9.0;
        filter [0][0] = x;
        filter [1][0] = x;
        filter [2][0] = x;
        filter [0][1] = x;
        filter [1][1] = x;
        filter [2][1] = x;
        filter [0][2] = x;
        filter [1][2] = x;
        filter [2][2] = x;
        return faltung(originalbild,(double[][])filter);
    }

    public Picture weich(Picture originalbild,int filtergroesse) {
        double filter [][] = new double [filtergroesse][filtergroesse];
        double filtercontent = 1.0 /  (double)(filtergroesse * filtergroesse) ;
            for (int i = 0;i < filtergroesse; i++ ){
                for (int j = 0;j < filtergroesse; j++ ){
                    filter [i][j] = filtercontent;

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
    

    

}

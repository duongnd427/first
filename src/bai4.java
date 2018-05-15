import java.util.Random;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        String[][] array = new String[4][4];
        int i,j,u1,u2,v1,v2,gx,gy;
        for (i=0; i < 4; i++)   {
            for (j=0; j<4; j++) {
                array[i][j] = "*";
            }
        }

        i = 1;
        j = 2;
        array[i][j] = "p";

        Random random = new Random();
        while (true)    {
            u1 = random.nextInt(4);
            v1 = random.nextInt(4);
            if((u1!=1) || (v1!=2)) break;
        }
        array[u1][v1] = "x";


        while (true)    {
            u2 = random.nextInt(4);
            v2 = random.nextInt(4);
            if(((u2!=u1) || (v2!=v1)) && ((u2!=1) || (v2!=2))) break;
        }
        array[u2][v2] = "x";


        while (true)    {
            gx = random.nextInt(4);
            gy = random.nextInt(4);
            if(((gx!=u1) || (gy!=v1)) && ((gx!=u2) || (gy!=v2)) && ((gx!=1) || (gy!=2))) break;
        }
        array[gx][gy] = "G";


        while (true) {

            for (int m = 0; m < 4; m++) {
                for (int n = 0; n < 4; n++) {
                    System.out.print(array[m][n] + " ");
                }
                System.out.println();
            }

            if ((i==gx) && (j==gy)) {
                System.out.println("Chuc mung, ban da chien thang!");
                break;
            }

            array[u1][v1] = "*";
            array[u2][v2] = "*";

            if ((u1==gx) && (v1==gy))
                array[u1][v1] = "G";
            if (u1 == 3) {
                u1 = 0;
            } else {
                u1++;
            }
            array[u1][v1] = "x";


            if ((u1==gx) && (v1==gy))
                array[u1][v1] = "G";
            if (v2==3)   {v2=0;}
            else{
                v2++;
            }
            array[u2][v2] = "x";


            if (((u2==gx) && (v2==gy))) {
                array[u2][v2-1] = "G";
            }


            Scanner scanner = new Scanner(System.in);


            String x = scanner.next();
            if (x.equalsIgnoreCase("a")) {

                array[i][j] = "*";
                if(j==0){
                    j=3;
                }
                else{
                    j--;
                }
                array[i][j] = "p";
            }

            else if (x.equalsIgnoreCase("w")) {
                array[i][j] = "*";
                if(i==0){
                    i=3;
                }
                else{
                    i--;
                }
                array[i][j] = "p";
            }

            else if (x.equalsIgnoreCase("s")) {
                array[i][j] = "*";
                if (i==3){
                    i=0;}
                else
                    i++;
                array[i][j] = "p";
            }

            else if (x.equalsIgnoreCase("d")) {
                array[i][j] = "*";
                if (j==3){
                    j=0;}
                else
                    j++;
                array[i][j] = "p";
            }
        }
    }
}

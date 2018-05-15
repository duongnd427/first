import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        String[][] array = new String[4][4];
        int i,j;
        for (i=0; i < 4; i++)   {
            for (j=0; j<4; j++) {
                array[i][j] = "*";
            }
        }

            i = 1;
            j = 2;
            array[i][j] = "p";

        while (true) {
            for (int m = 0; m < 4; m++) {
                for (int n = 0; n < 4; n++) {
                    System.out.print(array[m][n] + " ");
                }
                System.out.println();
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

                    array[i][j] = "p";}

                 else if (x.equalsIgnoreCase("w")) {
                    array[i][j] = "*";
                    if(i==0){
                            i=3;
                        }
                    else{
                        i--;
                    }
                    array[i][j] = "p";

                } else if (x.equalsIgnoreCase("s")) {
                    array[i][j] = "*";
                    if (i==3){
                        i=0;}
                    else
                    i++;
                    array[i][j] = "p";

                } else if (x.equalsIgnoreCase("d")) {
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

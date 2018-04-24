import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class CompareTheTriplet {

    /*
     * Complete the solve function below.
     */
    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        int[] cpArr = new int[3];
        int count = 0;

                 
        if((a0-b0) != 0 || (b0-a0) != 0){
            cpArr[0] = 1;
            count++;
        }
        if((a1-b1) != 0 || (b1-a1) != 0){
            cpArr[1] = 1;
            count++;
        }       
        if((a2-b2) != 0 || (b2-a2) != 0){
            cpArr[2] = 1;
            count++;
        }
        
        int[] resultArr = new int[count];
        int index = 0;
        for(int c : cpArr){
            if(c != 0){
                resultArr[index] = c;
                index++;
            }
        }
        return resultArr;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("d:/result.txt")));

        String[] a0A1A2 = scan.nextLine().split(" ");

        int a0 = Integer.parseInt(a0A1A2[0].trim());

        int a1 = Integer.parseInt(a0A1A2[1].trim());

        int a2 = Integer.parseInt(a0A1A2[2].trim());

        String[] b0B1B2 = scan.nextLine().split(" ");

        int b0 = Integer.parseInt(b0B1B2[0].trim());

        int b1 = Integer.parseInt(b0B1B2[1].trim());

        int b2 = Integer.parseInt(b0B1B2[2].trim());

        int[] result = solve(a0, a1, a2, b0, b1, b2);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write(" ");
            }
        }

        bw.newLine();

        bw.close();
    }
}

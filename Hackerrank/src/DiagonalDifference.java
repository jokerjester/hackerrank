import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class DiagonalDifference {

    /*
     * Complete the diagonalDifference function below.
     */
    static int diagonalDifference(int[][] a) {
        /*
         * Write your code here.
         */
    	
    	//System.out.println("a.length = "+ a.length);
    	int arrLen = (a.length-1);
        int first = 0;
        for(int i = 0; i <= arrLen; i++){
             first += a[i][i];
        }
             
        int second = 0;
        for(int i = arrLen; i >=0; i--){
            int j = arrLen-i;
            System.out.println("j = "+ j);
             second += a[i][(j)];
        }
        
        //System.out.println("first = "+ first);
        //System.out.println("second = "+ second);
        int result = Math.abs(first-second);
        return result;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	BufferedWriter bw = new BufferedWriter(new FileWriter(new File("d:/result.txt")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[][] a = new int[n][n];

        for (int aRowItr = 0; aRowItr < n; aRowItr++) {
            String[] aRowItems = scan.nextLine().split(" ");

            for (int aColumnItr = 0; aColumnItr < n; aColumnItr++) {
                int aItem = Integer.parseInt(aRowItems[aColumnItr].trim());
                a[aRowItr][aColumnItr] = aItem;
            }
        }

        int result = diagonalDifference(a);

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();
    }
}
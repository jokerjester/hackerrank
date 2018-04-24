import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class PlusMinus {

    /*
     * Complete the plusMinus function below.
     */
    static void plusMinus(int[] arr) {
        /*
         * Write your code here.
         */
    	int plus = 0;
    	int zero = 0;
    	int minus = 0;
    	for(int a : arr) {
    		if(a < 0) {
    			minus += 1;
    		} 
    		if(a == 0) {
    			zero+= 1;
    		}
    		if(a > 0) {
    			plus+= 1;
    		}
    	}
    	
    	System.out.println((double)plus/arr.length);
    	System.out.println((double)minus/arr.length);
    	System.out.println((double)zero/arr.length);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        plusMinus(arr);
    }
}
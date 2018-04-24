import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BirthdayCakeCandles {

	/*
     * Complete the birthdayCakeCandles function below.
     */
    static int birthdayCakeCandles(int n, int[] ar) {
        /*
         * Write your code here.
         */
    	
    	if(n < ar.length) {
    		return 0;
    	}
    	
    	// sort
    	int temp;
    	for(int i =0; i<n;i++) {
    		for(int j = i+1; j<n;j++) {
        		if(ar[i] >ar[j]) {
        			temp = ar[i];
        			ar[i] = ar[j];
        			ar[j] = temp;
        		}
        	}
    	}
    	
    	int count =0;
    	for(int a : ar) {
    		if(a == ar[ar.length-1] ) {
    			count+=1;
    		}
    	}
    	
    	return count;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] ar = new int[n];

        String[] arItems = scan.nextLine().split(" ");

        for (int arItr = 0; arItr < n; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = birthdayCakeCandles(n, ar);

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();
    }
}

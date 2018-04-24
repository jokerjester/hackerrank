import java.util.Scanner;

public class MiniMaxSum {
	/*
     * Complete the miniMaxSum function below.
     */
    static void miniMaxSum(int[] arr) {
        /*
         * Write your code here.
         */
    	long[] sumArr = new long[5];
    	long sum = 0;
    	for(int i =0;i<arr.length;i++) {
    		sum = 0;
    		for(int j = 0; j<arr.length;j++) {
    			if(j!=i) {
    				sum+=arr[j];
    			}
    		}
    		sumArr[i] = sum;
    	}
    	
    	// sort
    	long temp;
    	for(int i =0; i<sumArr.length;i++) {
    		for(int j = i+1; j<sumArr.length;j++) {
        		if(sumArr[i] >sumArr[j]) {
        			temp = sumArr[i];
        			sumArr[i] = sumArr[j];
        			sumArr[j] = temp;
        		}
        	}
    	}
    	
    	System.out.println(sumArr[0]+" "+sumArr[sumArr.length-1]);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < 5; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        miniMaxSum(arr);
    }
}

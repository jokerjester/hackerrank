import java.util.Scanner;

public class Staircase {

    /*
     * Complete the staircase function below.
     */
    static void staircase(int n) {
        /*
         * Write your code here.
         */
    	for(int i = 0; i< n; i++) {
    		for(int c =1; c < n-i ; c++) {
    			System.out.print(" ");
    		}
    		for(int j = 0; j <= i; j++) {
    			System.out.print("#");
    		}  		
    		System.out.println(" ");
    	}
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        staircase(n);
    }
}
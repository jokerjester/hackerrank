import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {
	  /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
    	String[] strArr = s.split(":");
    	System.out.println(strArr[0]);
    	System.out.println(strArr[1]);
    	System.out.println(strArr[2]);
    	String hh = strArr[0];
    	String mm = strArr[1];
    	String ss = strArr[2];
    	String ampm = strArr[2].substring(2, 4);
    	ss = ss.replaceAll("AM", "").replace("PM", "");
    	System.out.println(ampm);
    	if(ampm.equalsIgnoreCase("PM")) {
    		int intHH = Integer.parseInt(hh);
    		if(intHH<12) {
    			intHH = intHH+12;
    		}
    		
    		hh = String.valueOf(intHH);
    		
    		if(intHH==24) {
    			hh = "00";
    		}
    		
    	}

    	return hh+":"+mm+":"+ss;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}

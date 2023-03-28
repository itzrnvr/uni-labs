// importing the FileWriter class
import java.util.*;
import java.io.*;

class Q1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter input val 1: ");
    int a = sc.nextInt();
    System.out.println("Enter input val 2: ");
    int b = sc.nextInt();

    String as = Integer.toString(a);
    String bs = Integer.toString(b);
    
     try {

       FileWriter output = new FileWriter("JavaFile.java");

       output.write(as);
       output.write(bs);
       System.out.println("Data is written to the file.");

       output.close();
     }
     catch (Exception e) {
       e.getStackTrace();
     }

     try {
			Scanner scanner = new Scanner(new File("JavaFile.java"));
      System.out.println("Opening file and reading...")
      String mstr = "";
    	while (scanner.hasNextLine()) {
    		mstr = scanner.nextLine();
    	}

      int a1 = Character.getNumericValue(mstr.charAt(0));
      int b1 = Character.getNumericValue(mstr.charAt(1));
    
      System.out.println("The product of " + a1 + " and " + b1 + " is "  + a1 * b1);

			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
  }
}

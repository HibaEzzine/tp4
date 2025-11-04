package tp4;
import java.util.Scanner;
   public class Client {
	             public static void main(String[] args) {
	        	 Scanner scr= new Scanner(System.in);
	        	 System.out.println("Saisir un nombre");
	        	 int n= scr.nextInt();
	        	 ProgramInterface p = ProgramFactory.createProgram(n);
	        	 p.go();
	   }  
}

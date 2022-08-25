import java.util.Scanner;
import java.util.Arrays;
public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		// Enter number for hcf
		System.out.println("Enter the no");
		int a = obj.nextInt();
		
		System.out.println("Enter the no");
		int b = obj.nextInt();
		// declare c for taking greatest no.between a and b;
		int c;
		if (a>b) {
			c = a;
		}
		else {
			c = b;
		}
		// declare single dimensional array for storing i value;
		int [] arr =new  int[1];
		//use loop for finding out multiple of a and b;
		for(int i = 1;i<=c;i++) {
			
			if(a%i == 0 &&  b%i == 0) {

				arr[0] = i;	
				
			}
			
		}
		// declare h for storing array value into varible;
		int h = arr[0];
		System.out.println("hcf is" +" " +  h);
		
	}

}

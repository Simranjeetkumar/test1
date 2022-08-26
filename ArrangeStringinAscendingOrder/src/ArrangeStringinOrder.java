import java.util.Arrays;
public class ArrangeStringinOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// enter the string 
		String str = "this is a example";
		String [] str1 = str.split(" ");//convert string into string array for deleting or removing the white space
		for(int i=0;i<str1.length;i++) {
			//1st loop for taking the value at different index no 
			
			for(int j = i+1;j<str1.length;j++) {
				//2nd loop for comparing the 1st loop i value(indexvalue)to another index values.
				if(i<str1.length-1) {
					// if conditionfor checking given i value is not last.
					String st = str1[i];// string for storing initiall value of i.
					int l = str1[i].length();//intl take the length of initiall value of i.
					int a = str1[j].length();// int a take the length of j(another value at j index).
					if(a<l) {
						// this if compare both length
						str1[i] = str1[j];// than change indexi value with index j value.
						str1[j] = st; //than change j value to st(store value of initall i)
					}
				}
				
			}
			
		}
		System.out.println(Arrays.toString(str1));
		
	
	}

}

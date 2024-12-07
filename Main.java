import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] marks = new int[5];
		marks[0] = 12;
		marks[1] = 13;
		marks[2] = 11;
		marks[3] = 16;
		marks[4] = 14;
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		try{
		    System.out.println("Hello i am frist block of try catch......!");
		}
		catch(Exception e){
		    System.out.println("e");
		}
		    try{
		        System.out.println("hello index value is :"+ marks[s]);
		    }
		
		catch(ArrayIndexOutOfBoundsException e){
		    System.out.println("error occur.....!");
		}
		
		
		}
}

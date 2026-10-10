import java.util.Scanner;
class Even{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int number=sc.nextInt();
		
		if(number%2==0)
		{
			System.out.println("This Number is even");
		}
		else
		{
			System.out.println("This Number is odd");
		}
	}
}
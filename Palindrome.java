import java.util.*;
class Palindrome{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n,rem,rev=0;
		System.out.println("Enter a number");
		n=sc.nextInt();
		int store=n;
		int temp=n;
		while(n!=0)
			{
				rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
			if(rev==temp)
				System.out.println(store+" is Palindrome number");
			else
				System.out.println(store+" is not a Palindrome number");
	}
}




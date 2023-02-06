package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_1 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter The Size Of The Array : ");
		
		int m = sc.nextInt();
		
		List<Integer> arr = new ArrayList();
		
		for(int i=0; i<m; i++)
		{
			arr.add(sc.nextInt());
		}
		
		arr.forEach(s1->{if(s1%2!=0)
			System.out.println(s1 + "is Odd Number");
		});		
	}
	
}

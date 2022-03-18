package Arrays;

public class DivisibleBy7 {

	public static void main(String[] args) {
		int c=0;
		for(int a=100;a>=1;a--)
		{
			if(a%7==0)
			{
				c=c+1;
			}
		}
		System.out.println("No.s Which is Divisible by 7:" +c );
		int a[]=new int[c];
		int l=0;
		for(int s=100;s>=1;s--)
		{
			if(s%7==0)
			{
				a[l]=s;
				l++;
			}
		}
		for(int xx:a)
		{
			System.out.println(xx);
		}

	}

}

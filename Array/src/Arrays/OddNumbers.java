package Arrays;

public class OddNumbers {

	public static void main(String[] args) {
		int count=0;
		{
			for(int i=51;i>=31;i--)
			{
				if(i%2!=0)
				{
					count=count+1;
				}
				
			}
			System.out.println("No. of Odd Numbers: " +count);
			int b[]=new int[count];
			int m=0;
			for(int j=51;j>=31;j--)
			{
				if(j%2!=0)
				{
					b[m]=j;
					m=m+1;
				}
			}
			for(int yy:b)
			{
				System.out.println(yy);
			}
		}
		
	}

}

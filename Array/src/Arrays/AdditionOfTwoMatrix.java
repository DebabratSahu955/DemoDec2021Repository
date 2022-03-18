package Arrays;

public class AdditionOfTwoMatrix {

	public static void main(String[] args) {
		int m1[][]= {{1,2,3},{4,5,6},{1,4,5}};
		int m2[][]= {{7,8,9},{4,5,7},{2,3,6}};
		int sum[][]=new int[3][3];
		System.out.println("Elements of first matrix:");
		for(int a=0;a<3;a++)
		{
			for(int b=0;b<3;b++)
			{
				System.out.print(m1[a][b]+" ");
			}
			System.out.println(); 
		}
		System.out.println("Elements of second matrix; ");
		for(int a=0;a<3;a++)
		{
			for(int b=0;b<3;b++)
			{
				System.out.print(m2[a][b]+" ");
			}
			System.out.println();
		}
		for(int a=0;a<3;a++)
		{
			for(int b=0;b<3;b++)
			{
				sum[a][b]=m1[a][b]+m2[a][b];
			}
		}
		System.out.println("Addition of two matrix: ");
		for(int a=0;a<3;a++)
		{
			for(int b=0;b<3;b++)
			{
				System.out.print(sum[a][b]+" ");
			}
			System.out.println();
		}

	}

}

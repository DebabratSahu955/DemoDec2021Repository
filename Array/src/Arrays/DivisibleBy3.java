package Arrays;

public class DivisibleBy3 {

	public static void main(String[] args) {
		int c=0;
		for(int w=50;w<=150;w++)
		{
			if(w%3==0)
			{
				c=c+1;
			}
		}
		System.out.println("No.s Which Is Divisible by 3:"+c);
		int x[]=new int[c];
		int y=0;
		for(int z=50;z<=150;z++)
		{
			if(z%3==0)
			{
				x[y]=z;
				y++;
			}
		}
		for(int aa:x)
		{
			System.out.println(aa);
		}

	}

}

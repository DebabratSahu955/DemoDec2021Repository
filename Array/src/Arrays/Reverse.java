package Arrays;

public class Reverse {

	public static void main(String[] args) {
		int count=0;
		for(int c=171;c>=121;c--)
		{
			if(c%2!=0)
			{
				count=count+1;
			}
		}
		System.out.println("No. of Odd Numbers:"+count);
		int e[]=new int[count];
		int d=0;
		for(int f=171;f>=121;f--)
		{
			if(f%2!=0)
			{
				e[d]=f;
				d++;
			}
		}
		for(int zz:e)
		{
			System.out.println(zz);
		}

	}

}

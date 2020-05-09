package IntroductionBasics;

public class ArraySmultiDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = {{1,2,3},{4,5,6},{6,7,8}};
		int b[][] = {{0,9,11},{12,13,14},{15,16,17}};
		System.out.println(b[2][1]);
		int min = a[0][0];
		int Max = b[0][0];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.println(a[i][j]);
				if(a[i][j]<min)
				{
					min = a[i][j];
				}
			}
			
			
		}
		System.out.println("The mminimum number = " + min);
		
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				System.out.println(b[i][j]);
				if(a[i][j]>Max)
				{
					Max = a[i][j];
				}
			}
			
			
		}
		System.out.println("The mminimum number = " + Max);
	}

}

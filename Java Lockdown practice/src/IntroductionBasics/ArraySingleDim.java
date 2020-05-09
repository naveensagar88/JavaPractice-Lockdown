package IntroductionBasics;

public class ArraySingleDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
		int b[] = {6,7,8,9,0};

		for(int i=0;i<b.length;i++)
		{
			System.out.println("The Arrays values are = " + b[i]);
			
			if(b[i]==8)
			{
				System.out.println(i);
				break;
			}

		}
	}

}

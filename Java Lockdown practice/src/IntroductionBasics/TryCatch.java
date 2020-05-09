package IntroductionBasics;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=7;
		int b=0;
		
		try 
		{
			
			//int c=a/b;`
			//System.out.println(c);
			
			
			int array[]=new int[8];
			System.out.println(array[9]);

			
		}
		
		
		catch(ArithmeticException et)
		{
			System.out.println("i catched the Arithmetic Exception");
		}
		
		catch(IndexOutOfBoundsException ib)
		{
			System.out.println("i catched the IndexOutOfBoundsException Exception");
		}
		
		catch(Exception e)
		{
			System.out.println("i catched the Exception");
		}
		
		finally
		{
			System.out.println("I am the final");
			
		}
	}

}

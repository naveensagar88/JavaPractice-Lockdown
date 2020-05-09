package IntroductionBasics;

public class constructors {

	
	public constructors()
	{
		System.out.println("I am the constructor");
		
		
	}
	
	public constructors(int a,int b)
	{
		System.out.println("I am the parametezed constructor");
		int c=a+b;
		System.out.println(c);
		
		
	}
	
	
	public constructors(String str)
	{
		System.out.println("I am the parametezed constructor string");
		System.out.println(str);
		
		
	}
	
	public void method()
	{
		System.out.println("I am the method");
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	constructors ct= new constructors();
	constructors cd= new constructors(4,5);
	constructors cs= new constructors("sagar");
	System.out.println("hi");
	ct.method();
	
		
	}

}

package IntroductionBasics;

public class thiskeyword {

	
	int a = 3;
	
	public void demo()
	{
		
		int a= 2;
		int b=a+this.a;
		
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		thiskeyword d=new thiskeyword();
		d.demo();
		
		
	}

}

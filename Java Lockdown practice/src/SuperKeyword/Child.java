package SuperKeyword;

public class Child extends Parent {
	
	String str="Qa";

	public Child()
	{
		super();
		System.out.println("i am the child Constructor");
	}
	
	
	public void getdata()
	{
		super.getdata();
		System.out.println("i am the child data");
	}
	
	
	public void getstring()
	{
		System.out.println(str);
		System.out.println(super.str);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child ch=new Child();
		ch.getdata();
		ch.getstring();
	}

}

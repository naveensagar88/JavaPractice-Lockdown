package OOPS;

public class Parent2Inherit extends ParentInherit {
	
	String st ="Dharshit";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent2Inherit p2 = new Parent2Inherit();
		ParentInherit p1 = new Parent2Inherit();
		
		System.out.println(p2.st);
		System.out.println(p1.st);
		
		
	}
	
	public void Mysore()
	{
		System.out.println("Mysore under control given relief for lockdown  "+st);
		
	}


	public void Bangalore()
	{
		System.out.println("Maharastra spotted top rank in india");
	}
	
	public void Mandya()
	{
		System.out.println("Heavy risk in coming days");
	}

}


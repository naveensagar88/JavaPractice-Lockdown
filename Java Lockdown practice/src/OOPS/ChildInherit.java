package OOPS;

public class ChildInherit extends Parent2Inherit {
	

	String str = "sagar";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildInherit ch = new ChildInherit();
		ChildInherit ch2 = new ChildInherit();
		Parent2Inherit ch3 = new ChildInherit();

		ch.CoronaIndia();
		ch.Coronaitaly();
		ch.Coronamerica();
		ch2.Karnatak();
		ch2.Tamilnadu();
		ch2.Maharastra();
		System.out.println(ch.str);
		System.out.println(ch.st);
		ch3.Mysore();
		ch3.Mandya();
		ch3.Bangalore();
		System.out.println(ch3.st);
		
		
	}
	
		public void Karnatak()
		{
			System.out.println("Karnataka under control given relief for lockdown  "+str);
		}
	

		public void Maharastra()
		{
			System.out.println("Maharastra spotted top rank in india");
		}
		
		public void Tamilnadu()
		{
			System.out.println("Heavy risk in coming days");
		}
		
}

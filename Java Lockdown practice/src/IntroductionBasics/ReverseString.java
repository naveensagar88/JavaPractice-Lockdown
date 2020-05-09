package IntroductionBasics;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer name = new StringBuffer ("Dharshith Sagar");
		System.out.println(name.reverse());
		
		
		String Str = "Naveen Sagar";
		String t = "";
		
		for (int i=Str.length()-1;i>=0;i--)
		{
			
				t = t + Str.charAt(i);
				System.out.println(t);
					
		}
		
		System.out.println(t);
		
	}

}

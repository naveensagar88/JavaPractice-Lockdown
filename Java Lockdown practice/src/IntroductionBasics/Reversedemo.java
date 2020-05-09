package IntroductionBasics;

public class Reversedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Naveen";
		String t = "";
		for(int i=name.length()-1;i>=0;i--)
		{
			
			t=t+name.charAt(i);
			
		}
		
		System.out.println(t);
		
	}
	

}

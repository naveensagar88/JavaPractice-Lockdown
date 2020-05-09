package IntroductionBasics;
import SuperKeyword.Child;

public class Stringsmethodcall {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Payment $100 paid";
		System.out.println(str.charAt(8));
		
		String str1="Payment $100 paid";
		System.out.println(str1.indexOf("p"));
		System.out.println(str1.toUpperCase());
		
		System.out.println(str1.substring(5));
		
		Child p = new Child();
		p.getstring();
		
		Method m=new Method();
		m.ValidateHeader();
			
		
	}

}

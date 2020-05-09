package IntroductionBasics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//--Two ways we can declare strings---//
		String str = new String("Naveen sagar 798641$");
		System.out.println(str.charAt(3));
		
		String str1 = "The Usual suspects 420";
		System.out.println(str1.chars().count());
		System.out.println(str1.compareTo(str));
		System.out.println(str1.concat(str));
		System.out.println(str1.endsWith("420"));
		System.out.println(str1.indexOf("U"));
		System.out.println(str1.contains("na"));
		System.out.println(str1.equals("The Usual suspects 420"));
		System.out.println(str1.equalsIgnoreCase("The USUAL suspects 420"));
		System.out.println(str.isEmpty());
		
		
		String s1="Sachin ";  
		   String s2="Sachin";  
		   String s3=new String("Sachin");  
		   System.out.println(s1==s2);//true (because both refer to same instance)  
		   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool) 
		   
		   
		  System.out.println(s1.concat(str1));
		  System.out.println(s1);
		  
		  
		 //--String join--//
		  
		  String date = String.join("/","05","05","2020");
		  System.out.println(date);
		  System.out.println(str.toUpperCase());
		  
		  
		  System.out.println(s1.replace("Sachin","Sagar"));
		  
		  StringBuffer sb=new StringBuffer("Hello "); 
		  System.out.println(sb);
		  System.out.println(sb.append("Sagar"));
		  System.out.println(sb.reverse());
		  System.out.println(sb.delete(0,3));
		  System.out.println(sb);
		  
		  System.out.println(str.concat(str1));
		  System.out.println(str);
		  
		  
		  
		  System.out.println("---------------------------");
		  System.out.println(str1.substring(0,9));
		  System.out.println(str1.substring(5));
		  System.out.println(str1.substring(5,8));




	}

}

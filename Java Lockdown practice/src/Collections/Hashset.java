package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> ar= new HashSet<String>();
		ar.add("Sagar");
		ar.add("Naveen");
		ar.add("Harshi");
		ar.add("gude");
		//System.out.println(ar);
		
		//System.out.println(ar.size());
		
		//System.out.println(ar);
		//ar.remove("Sagar");
		
		//System.out.println(ar);
		//ar.contains("Naveen");
		//System.out.println(ar.contains("Naveen"));
		
		//System.out.println(ar.isEmpty());
		
		
		Iterator<String> i = ar.iterator();
		System.out.println(ar);
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
		
	}

}

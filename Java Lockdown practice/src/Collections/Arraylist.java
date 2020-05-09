package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> ar= new ArrayList<String>();
		ar.add("Sagar");
		ar.add("Naveen");
		ar.add("Harshi");
		ar.add("sagar");
		System.out.println(ar);
		ar.add(4, "element");
		//System.out.println(ar.size());
		
		System.out.println(ar);
		ar.remove("sagar");
		ar.remove(1);
		System.out.println(ar);
		ar.contains("Naveen");
		System.out.println(ar.contains("Naveen"));
		System.out.println(ar.get(2));
		System.out.println(ar.indexOf("Harshi"));
		System.out.println(ar.isEmpty());
		
		
		Iterator<String> i = ar.iterator();
		
		System.out.println(ar);
		System.out.println(i.next());
		System.out.println(i.next());
	}

}

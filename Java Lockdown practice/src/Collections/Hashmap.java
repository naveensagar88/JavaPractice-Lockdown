package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(0,"Naveen");
		hm.put(1,"Nagaraju");
		hm.put(2,"Sagar");
		hm.put(3,"Shivamma");
		Set st=hm.entrySet();
		
		Iterator it=st.iterator();
		while(it.hasNext())
		{
			Map.Entry mp=(Map.Entry)it.next();
			//System.out.println(mp);
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		
	}

}

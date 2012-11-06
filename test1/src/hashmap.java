import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;


public class hashmap {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add("spring dale");
		ar.add("Meadows");
		ar.get(0);
		HashMap<String, String> hm2 = new HashMap();
		hm2.put("1",(String) ar.get(1));
		Collection<String> col = hm2.values();
		Iterator it = col.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}

	}

}

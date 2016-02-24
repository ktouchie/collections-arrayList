package arrayMain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Enumeration;

public class arrayTest {

	public static void main(String[] args) {
		
		// déclare une collection
		List al = new ArrayList();
		
		// ajout d'élément dans la collection
		al.add(12);
		al.add("Une chaine de caratères");
		al.add(12.20f);
		al.add('d');
		
		// parcours de la collection
		for(int i=0; i<al.size(); i++){
			System.out.println("donnée à l'indice " + i + " = " + al.get(i));
		}
		
		// déclare une collection
		Set hs = new HashSet();
		
		// ajout d'élément dans la collection
		hs.add(12);
		hs.add("Une chaine de caratères");
		hs.add('d');
		hs.add('d');
		
		// parcours de la collection
		Iterator it = hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		// déclare une collection
		Hashtable ht = new Hashtable();
		
		//Map ht = new Hashtable();
		
		// ajout d'éléments dans la collection
		ht.put(1, "primptemps");
		ht.put(10, "ete");
		ht.put(12, "automne");
		ht.put(45, "hiver");
		
		// parcours de la collection
		Enumeration e = ht.elements();
		
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
	}

}

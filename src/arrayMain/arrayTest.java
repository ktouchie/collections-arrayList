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
		
		// d�clare une collection
		List al = new ArrayList();
		
		// ajout d'�l�ment dans la collection
		al.add(12);
		al.add("Une chaine de carat�res");
		al.add(12.20f);
		al.add('d');
		
		// parcours de la collection
		for(int i=0; i<al.size(); i++){
			System.out.println("donn�e � l'indice " + i + " = " + al.get(i));
		}
		
		// d�clare une collection
		Set hs = new HashSet();
		
		// ajout d'�l�ment dans la collection
		hs.add(12);
		hs.add("Une chaine de carat�res");
		hs.add('d');
		hs.add('d');
		
		// parcours de la collection
		Iterator it = hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		// d�clare une collection
		Hashtable ht = new Hashtable();
		
		//Map ht = new Hashtable();
		
		// ajout d'�l�ments dans la collection
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

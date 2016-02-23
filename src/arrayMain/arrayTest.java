package arrayMain;

import java.util.ArrayList;
import java.util.List;

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

	}

}

package arrayMain;

import java.util.ArrayList;
import java.util.List;

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

	}

}

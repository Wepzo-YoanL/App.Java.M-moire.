package App.Java02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String Xpseudos = " Java, Python, Html, Php, JavaScript, GdScript, C++";
	String Pseudo []= Xpseudos.split(",");
	//Boucle String
	// "str" Signifie tout
	//Pourquoi on ne met pas directement le name de là où se situe les names ?
	// Parce que dans le String de celui-ci il n'y'a pas la condition qui
	// montre qu'il s'agit de plusieurs éléments de tableau.
	for( String str: Pseudo) {
		System.out.println(str);
		//Boucle int
		int Notes[] = {10, 13, 13, 40, 50};
		int calcul = 0;
		// Les ":" signifie que c'est le name de la récursive des éléments interne du BlackBorn 
		 for(int note : Notes) {
			 calcul = calcul +note;
			 
		 }
		 System.out.println("La moyenne est de:" + " " + (calcul+Notes.length));
		 System.out.println("Le nombre de notes est de:" + Notes.length);
				
	}
	
		

	}

}

package App.Java02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Mise en place d'un tableau
	// Les tableaux sont réalisés avec un String pour les chaînes de caractère avec l'ajout de []
		String[] names = {"igor"," Mathieu", "Jean Luc"};
		//Au dessus nous avons élaboré une case avec un élément qui est tout ce qui est contenu dans la même paire 
		// De griffe
		System.out.println(names[0]);
			// Ici nous avons la comparaison de deux éléments du tableau 
if (names[0]== names[1]) {
	System.out.println("C'est la meme chose");
}else {
	System.out.println("C'est pas la meme chose");
}
	}

}

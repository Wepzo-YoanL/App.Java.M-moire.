package App.Java02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Mise en place d'un tableau
	// Les tableaux sont réalisés avec un int pour les nombres avec l'ajout de []
		int[] numbers = {12,25,50,100};
	int calcul 		  = (numbers[0]+numbers[1]+numbers[2]+numbers[3]) / numbers.length;
	// le cross "Length est une syntaxe qui permet de donner le nombre de la chose
	// Donc si je mets length près de numbers ca va me donner le nombre d'éléments numbers
		System.out.println(numbers.length);
		System.out.println(calcul);

	}

}

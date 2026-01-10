package App.Java02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Tableau composé de plusieurs tableau 
		//Pour se faire de paires de croché
	String Xspeudos = "Java, Python, Html, JavaScript, Php, C++, GdScirpt";
	// La syntaxe "split" permet de marquer un symbole comme limite
	// Ici la virgule sera prise comme limite pour tous les names 
	String Speudo[]	= Xspeudos.split(",");
		//Erreur résolu
	
			System.out.println("Voici le nombre d'éléments:" + "  " + Speudo.length);

	}

}

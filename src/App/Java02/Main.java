package App.Java02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Player player1 = new Player("Lola", 20.0, 20.0);
	// Ici on a pu récupérer la santé pour le joueur1 
	System.out.println("Voici le nombre de vie" +"  " + player1.getHealth() + " "+"Pour:" + player1.getName());
//	Voici le system de dgts statiques pour le player1
	player1.damage(11);
	System.out.println("Sa vie est maintenant de:" + player1.getHealth());
	
	
	Player player2 = new Player("Nana", 30.0, 30.0);
	
	// Ici on a pu récupérer la santé pour le joueur1 
	System.out.println("Voici le nombre de vie" +"  " + player2.getHealth());
	}
	
		

	}



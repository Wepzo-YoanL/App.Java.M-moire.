package App.Java02;

public class Player {
		private String name = "Lola";
		private double health = 20;
		private double attack = 0.5;
		//Les constructeurs se génèrent avec un crtl+ espace
		// Un constructeur est ce qui peprmet la maléabilité d'une fonction d'une méthode
		// Ici il nous permet d'utiliser les caractéristiques de la classe Player 
		// Pour n'importe quelle autre joueur sans avoir à créer un constructeur particulier pour chacun
public Player() {
	// TODO Auto-generated constructor stub
}
//Création des getters and setters pour chaque variable
// Note une fonction qui se trouve dans un objet bien défini est une méthode 
// Avec les getters et les setters j'ai la possibilité de récupérer la santé "health"
// Ceci est fait dans la classe Main
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getHealth() {
	return health;
}
public void setHealth(double health) {
	this.health = health;
}
public double getAttack() {
	return attack;
}
public void setAttack(double attack) {
	this.attack = attack;
}
}

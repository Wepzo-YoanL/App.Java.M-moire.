package App.Java02;

public class Player {
		private String name ;
		private double health ;
		private double attack;
		//Les constructeurs se génèrent avec un crtl+ espace
		
public Player(String name, double health, double attack) {
	// TODO Auto-generated constructor stub
//	Le constructeur ici est automatisé pour que chaque joueur est ses données spécifiques
	this.name   = name;
	this.health = health;
	this.attack =attack;
}

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
//Ceci est la fonction des dommages "damage"
	public void damage (double damage) {
		this.health -= damage;
	}
public double getAttack() {
	return attack;
}
public void setAttack(double attack) {
	this.attack = attack;
}
}

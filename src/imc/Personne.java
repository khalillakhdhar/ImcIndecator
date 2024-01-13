package imc;

public class Personne {
private String nom,prenom;
private double poids;
private double taille;
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public double getPoids() {
	return poids;
}
public void setPoids(double poids) {
	this.poids = poids;
}
public double getTaille() {
	return taille;
}
public void setTaille(double taille) {
	this.taille = taille;
}
public long imc()
{
return Math.round(this.poids/(taille*taille));	
}
public String interpretation()
{
if(this.imc()<20)
	return "maigre";
else if( this.imc()<=25)
return "idéale";
else
	return "surpoid";

}



public Personne() {
	super();
	// TODO Auto-generated constructor stub
}
public Personne(String nom, String prenom, double poids, double taille) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.poids = poids;
	this.taille = taille;
}
public Personne(double poids, double taille) {
	super();
	this.poids = poids;
	this.taille = taille;
}


}


public class Moteur { //Classe moteur (d�pend de la tension)
double tension;

public Moteur(){
	
}

public void start (){
	setVitesse(1); //setVitesse = d�fini la vitesse du moteur 
}

public void Stop () {
	setVitesse(0);
}

//setVitesse � d�finir => d�pend de la tension
public void setVitesse (int v) {
	tension = 250*v;
}

public void setTension (int t){
	tension = t;
}

}

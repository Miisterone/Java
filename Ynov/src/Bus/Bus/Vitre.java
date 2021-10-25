package Bus.Bus;

public class Vitre {

    float epaisseur;
    float poids;

    public Vitre(float epaisseur, float poids) {
        this.epaisseur = epaisseur;
        this.poids = poids;
    }

    public void getInfo(){
        System.out.println(this.epaisseur + " | "+this.poids);
    }
}

package Bus.Bus;

public class Carrosserie {

    float poids;
    String color;

    public Carrosserie(float poids, String color) {
        this.poids = poids;
        this.color = color;
    }

    public void getInfo(){
        System.out.println(this.poids + " | "+this.color);
    }

}

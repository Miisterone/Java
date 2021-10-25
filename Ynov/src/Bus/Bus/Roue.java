package Bus.Bus;

class Roue {

    float pression;
    float diametre;

    public Roue(float pression,float diametre){
        this.pression = pression;
        this.diametre = diametre;
    }

    public void getInfo(){
        System.out.println(this.pression + " | "+this.diametre);
    }
}

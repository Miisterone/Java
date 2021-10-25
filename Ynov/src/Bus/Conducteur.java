package Bus;

public class Conducteur extends Personne{

    int permis;

    public Conducteur(float age, String name, String sex,int permis) {
        super(age, name, sex);
        this.permis = permis;
    }

    public void showInfo(String var){
        System.out.println(var + " | " + super.age + " | " + super.name + " | " + super.sex + " | " + this.permis);
    }
}

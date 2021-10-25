package Bus;

public class Enfant extends Personne{


    public Enfant(float age, String name, String sex) {
        super(age, name, sex);
    }

    void showInfo(String var){
        System.out.println(var + " | " + super.age + " | " + super.name + " | " + super.sex);
    }
}

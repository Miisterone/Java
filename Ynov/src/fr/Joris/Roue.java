package fr.Joris;

class Roue {

    private final float diameter;
    private String direction;
    private double speed;

    public void angularVelocity(float speed){
        this.speed = Math.round((25/3 * Math.PI * (this.diameter/2) * speed));
    }

    public Roue(float _diameter,String _direction,float _speed){
        this.diameter = _diameter;
        this.direction = _direction;
        angularVelocity(_speed);
    }

    public void getAllInfo(){
        System.out.println("Diameter: "+ this.diameter + "m");
        System.out.println("       Direction: " + this.direction);
        System.out.println("       Angular Velocity: " + this.speed + " rpm");
    }

    public void setDirection(String _direction){
        this.direction = _direction;
    }
}

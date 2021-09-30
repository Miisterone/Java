package fr.Joris;

public class Car {

    private static Roue wheelG;
    private static Roue wheelD;
    private String brand;
    private String color;
    private float speed;

    public void Car(String _brand,String _color,float _diametre,float _speed){
        this.brand = _brand;
        this.color = _color;
        this.speed = _speed;

        wheelG = new Roue(_diametre,"straight", _speed);
        wheelD = new Roue(_diametre,"straight", _speed);
    }

    public static void Rotate(String direction){
        if (wheelG == null || wheelD == null){
            System.out.println("No car.Build one");
            return;
        }
        System.out.println("The car turns at "+direction);
        wheelG.setDirection(direction);
        wheelD.setDirection(direction);
    }

    public void getBrand(){
        System.out.println("Name:" + this.brand);
    }

    public void getSpeed(){
        System.out.println("The car runs at "+ this.speed +" km/h.");
    }

    public void getAllInfo(){
        System.out.print("Car: ");
        System.out.println("Brand: "+ this.brand);
        System.out.println("     Color: " + this.color);
        System.out.println("     Speed: " + this.speed + " km/h");
    }

    public void getAllInfoRoue(){
        System.out.print("WheelG: ");
        wheelG.getAllInfo();
        System.out.print("WheelD: ");
        wheelD.getAllInfo();
    }
}

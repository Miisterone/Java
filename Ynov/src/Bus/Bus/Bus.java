package Bus.Bus;


public class Bus {

    Carrosserie[] carrosserie = new Carrosserie[1];
    Roue[] roues = new Roue[6];
    Siege[] sieges = new Siege[50];
    Vitre[] vitres = new Vitre[50];


    String immatriculation;
    int miseEnService;
    float poids;
    int nombreAnneeService;

    public Bus(String immatriculation, int miseEnService, float poids, int nombreAnneeService) {

        this.immatriculation = immatriculation;
        this.miseEnService = miseEnService;
        this.poids = poids;
        this.nombreAnneeService = nombreAnneeService;

        carrosserie[0] = new Carrosserie(500,"vert");
        for (int i=0; i<6; i++)
            roues[i] = new Roue(8,30);

        for (int i=0; i<22; i++)
            sieges[i] = new Siege("noir");

        for (int i=0; i<30; i++)
            vitres[i] = new Vitre(5,8);

    }

    public void getInfo(){
        System.out.println("Carrosserie: "+this.carrosserie.length + " | "+ "Roues: "+this.roues.length + " | "+ "Sièges: "+this.sieges.length + " | "+ "Vitres: "+this.vitres.length + " | "+ "Immatriculation: "+this.immatriculation + " | "+ "MiseEnService: "+this.miseEnService + " | " + "Poids: "+this.poids + " | " + "NombreAnneeService: "+this.nombreAnneeService);
    }

    public void getCarroserie(){
        System.out.println(carrosserie.length);
    }

    public void getAllRoue(){
        System.out.println(roues.length);
    }

    public void getAllSiege(){
        System.out.println(sieges.length);
    }

    public void getAllVitre(){
        System.out.println(vitres.length);
    }

}

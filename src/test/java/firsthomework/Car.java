package firsthomework;

import org.junit.jupiter.api.Test;

public class Car {
    private String carname;
    private int carcapacityKg;
    private int carspeedKmPerH;
    private int carfuelCostLPer100Km;
    private int carliterperdistance;

    private String trainname;
    private int traincapacityKg;
    private int trainspeedKmPerH;
    private int trainfuelCostLPer100Km;
    private int trainliterperdistance;

    public String getCarName() {return carname;}

    public void setCarName(String name) {
        this.carname = name;
    }

    public int getCarCapacity() {
        return carcapacityKg;
    }

    public void setCarCapacity(int carcapacityKg) {
        this.carcapacityKg = carcapacityKg;
    }

    public int getCarSpeed() {
        return carspeedKmPerH;
    }

    public void setCarSpeed(int carspeedKmPerH) {
        this.carspeedKmPerH = carspeedKmPerH;
    }

    public int getCarFuel() {
        return carfuelCostLPer100Km;
    }

    public void setCarFuel(int carfuelCostLPer100Km) {
        this.carfuelCostLPer100Km = carfuelCostLPer100Km;
    }

    public int getCarLiterPerDistance() {return carliterperdistance;}

    public void setCarLiterPerDistance(int carliterperdistance) {this.carliterperdistance = carliterperdistance;}

    public String getTrainName() {
        return trainname;}
    public void setTrainName(String trainname) {
        this.trainname = trainname;}
    public int getTrainCapacity() {
        return traincapacityKg;}
    public void setTrainCapacity(int traincapacityKg) {
        this.traincapacityKg = traincapacityKg;}
    public int getTrainSpeed() {
        return trainspeedKmPerH;}
    public void setTrainSpeed(int trainspeedKmPerH) {
        this.trainspeedKmPerH = trainspeedKmPerH;}
    public int getTrainFuel() {
        return trainfuelCostLPer100Km;}
    public void setTrainFuel(int trainfuelCostLPer100Km) {
        this.trainfuelCostLPer100Km = trainfuelCostLPer100Km;}
    public int getTrainLiterPerDistance() {
        return trainliterperdistance;}
    public void setTrainLiterPerDistance(int trainliterperdistance) {
        this.trainliterperdistance = trainliterperdistance;}

    @Test
    public void Characteristics() {
        Car firstcar = new Car();
        firstcar.setCarName("One");
        firstcar.setCarCapacity(100);
        firstcar.setCarSpeed(50);
        firstcar.setCarFuel(50);
        Car secondcar = new Car();
        secondcar.setCarName("Two");
        secondcar.setCarCapacity(80);
        secondcar.setCarSpeed(60);
        secondcar.setCarFuel(60);
        Car thirdcar = new Car();
        thirdcar.setCarName("Three");
        thirdcar.setCarCapacity(250);
        thirdcar.setCarSpeed(50);
        thirdcar.setCarFuel(80);
        Train firsttrain = new Train();
        firsttrain.setTrainName("First");
        firsttrain.setTrainCapacity(500);
        firsttrain.setTrainSpeed(50);
        firsttrain.setTrainFuel(55);
        Train secondtrain = new Train();
        secondtrain.setTrainName("Second");
        secondtrain.setTrainCapacity(666);
        secondtrain.setTrainSpeed(69);
        secondtrain.setTrainFuel(80);

        System.out.println("Car Name:" + firstcar.getCarName() +
                "  Capacity in Kilogram:" + firstcar.getCarCapacity() +
                "  Speed in Kilometers per hour:" + firstcar.getCarSpeed() +
                "  Fuel Cost in Liter Per 100Km:" + firstcar.getCarFuel());
        System.out.println("Car Name:" + secondcar.getCarName() +
                "  Capacity in Kilogram:" + secondcar.getCarCapacity() +
                "  Speed in Kilometers per hour:" + secondcar.getCarSpeed() +
                "  Fuel Cost in Liter Per 100Km:" + secondcar.getCarFuel());
        System.out.println("Car Name:" + thirdcar.getCarName() +
                "  Capacity in Kilogram:" + thirdcar.getCarCapacity() +
                "  Speed in Kilometers per hour:" + thirdcar.getCarSpeed() +
                "  Fuel Cost in Liter Per 100Km:" + thirdcar.getCarFuel());
        System.out.println("Train Name:" + firsttrain.getTrainName() +
                "  Capacity in Kilogram:" + firsttrain.getTrainCapacity() +
                "  Speed in Kilometers per hour:" + firsttrain.getTrainSpeed() +
                "  Fuel Cost in Liter Per 100Km:" + firsttrain.getTrainFuel());
        System.out.println("Train Name:" + secondtrain.getTrainName() +
                "  Capacity in Kilogram:" + secondtrain.getTrainCapacity() +
                "  Speed in Kilometers per hour:" + secondtrain.getTrainSpeed() +
                "  Fuel Cost in Liter Per 100Km:" + secondtrain.getTrainFuel());
    }

    @Test
    public void fuelCost() {
        int distance = 1000;
        Car firstcar = new Car();
        firstcar.setCarFuel(50);
        Car secondcar = new Car();
        secondcar.setCarFuel(60);
        Car thirdcar = new Car();
        thirdcar.setCarFuel(80);
        Train firsttrain = new Train();
        firsttrain.getTrainFuel();
        int firstrainfuel = firsttrain.getTrainFuel();
        Train secondtrain = new Train();
        secondtrain.getTrainFuel();
        int secondtrainfuel = secondtrain.getTrainFuel();

        int carliterperdistanceone = distance / 100 * firstcar.getCarFuel();
        System.out.println("First car fuelcost per distance = " + carliterperdistanceone);

        int carliterperdistancetwo = distance / 100 * secondcar.getCarFuel();
        System.out.println("Second car fuelcost per distance = " + carliterperdistancetwo);

        int carliterperdistancethree = distance / 100 * thirdcar.getCarFuel();
        System.out.println("Third car fuelcost per distance = " + carliterperdistancethree);

        int trainliterperdistanceone = distance / 100 * firstrainfuel;
        System.out.println("First train fuelcost per distance = " + trainliterperdistanceone);

        int trainliterperdistancetwo = distance / 100 * secondtrainfuel;
        System.out.println("Second train fuelcost per distance = " + trainliterperdistancetwo);


        firstcar.setCarLiterPerDistance(carliterperdistanceone);
        secondcar.setCarLiterPerDistance(carliterperdistancetwo);
        thirdcar.setCarLiterPerDistance(carliterperdistancethree);
        firsttrain.setTrainLiterPerDistance(trainliterperdistanceone);
        secondtrain.setTrainLiterPerDistance(trainliterperdistancetwo);
    }

    @Test
    public void transcost() {

        int loadinkg = 1000;
        Car firstcar = new Car();
        firstcar.setCarCapacity(100);
        Car secondcar = new Car();
        secondcar.setCarCapacity(80);
        Car thirdcar = new Car();
        thirdcar.setCarFuel(80);
        Train firsttrain = new Train();
        firsttrain.setTrainCapacity(500);
        //firsttrain.setTrainLiterPerDistance(literperdistanceone);
        Train secondtrain = new Train();
        secondtrain.setTrainCapacity(666);
        //secondtrain.setTrainLiterPerDistance(literperdistancetwo);


        //int firstcartranscost = loadinkg / firstcar.getCarCapacity() * literperdistanceone;
        //System.out.println("First car transportation cost = " + firstcartranscost);

        //int secondcartranscost = loadinkg / secondcar.getCarCapacity() * literperdistancetwo;
        //System.out.println("Second car transportation cost = " + secondcartranscost);


        //int thirdcartranscost = loadinkg / thirdcar.getCarCapacity() * thirdcarliterperdistance;
        //System.out.println("Third car transportation cost = " + thirdcartranscost);
    }
}
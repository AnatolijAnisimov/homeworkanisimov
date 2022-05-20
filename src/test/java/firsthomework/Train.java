package firsthomework;

import org.junit.jupiter.api.Test;

public class Train {
    private String trainname;
    private int traincapacityKg;
    private int trainspeedKmPerH;
    private int trainfuelCostLPer100Km;
    private int literperdistance;

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
        return literperdistance;}
    public void setTrainLiterPerDistance(int literperdistance) {
        this.literperdistance = literperdistance;}

    @Test
    public void trainCharacteristics() {
        Train firsttrain = new Train();
        firsttrain.setTrainName("One");
        firsttrain.setTrainCapacity(500);
        firsttrain.setTrainSpeed(50);
        firsttrain.setTrainFuel(55);
        Train secondtrain = new Train();
        secondtrain.setTrainName("Two");
        secondtrain.setTrainCapacity(666);
        secondtrain.setTrainSpeed(69);
        secondtrain.setTrainFuel(80);

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
    public void fuelCost () {
        int distance = 1000;
        Train firsttrain = new Train();
        firsttrain.setTrainFuel(55);
        int firstrainfuel = firsttrain.getTrainFuel();
        Train secondtrain = new Train();
        secondtrain.setTrainFuel(80);
        int secondtrainfuel = secondtrain.getTrainFuel();

        int literperdistanceone = distance / 100 * firstrainfuel;
        System.out.println("First train fuelcost per distance = " + literperdistanceone);

        int literperdistancetwo = distance / 100 * secondtrainfuel;
        System.out.println("Second train fuelcost per distance = " + literperdistancetwo);

        firsttrain.setTrainLiterPerDistance(literperdistanceone);
        secondtrain.setTrainLiterPerDistance(literperdistancetwo);
    }

    @Test
    public void transcost() {
        int loadinkg = 1000;
        Train firsttrain = new Train();
        firsttrain.setTrainCapacity(500);
        //firsttrain.setTrainLiterPerDistance(literperdistanceone);
        Train secondtrain = new Train();
        secondtrain.setTrainCapacity(666);
        //secondtrain.setTrainLiterPerDistance(literperdistancetwo);


        //int firsttraintransportationcost = loadinkg / firsttrain.getTrainCapacity() * firsttrain.getTrainLiterPerDistance;
        //System.out.println("First train transportation cost = " + firsttraintransportationcost);


        //int secondtraintranscost = loadinkg / secondtrain.getTrainCapacity() * secondtrain.getTrainLiterPerDistance;
        //System.out.println("Second train transportation cost = " + secondtraintranscost);

    }
}

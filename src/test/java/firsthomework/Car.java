package firsthomework;

import org.junit.jupiter.api.Test;

public class Car {
    private String carname;
    private int carcapacityKg;
    private int carspeedKmPerH;
    private int carfuelCostLPer100Km;
    private int literperdistance;

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

    public int getCarLiterPerDistance() {return literperdistance;}

    public void setCarLiterPerDistance(int literperdistance) {this.literperdistance = literperdistance;}
    @Test
    public void carCharacteristics() {
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

        System.out.println("Name:" + firstcar.getCarName() +
                "  Capacity in Kilogram:" + firstcar.getCarCapacity() +
                "  Speed in Kilometers per hour:" + firstcar.getCarSpeed() +
                "  Fuel Cost in Liter Per 100Km:" + firstcar.getCarFuel());
        System.out.println("Name:" + secondcar.getCarName() +
                "  Capacity in Kilogram:" + secondcar.getCarCapacity() +
                "  Speed in Kilometers per hour:" + secondcar.getCarSpeed() +
                "  Fuel Cost in Liter Per 100Km:" + secondcar.getCarFuel());
        System.out.println("Name:" + thirdcar.getCarName() +
                "  Capacity in Kilogram:" + thirdcar.getCarCapacity() +
                "  Speed in Kilometers per hour:" + thirdcar.getCarSpeed() +
                "  Fuel Cost in Liter Per 100Km:" + thirdcar.getCarFuel());
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

        int literperdistanceone = distance / 100 * firstcar.getCarFuel();
        System.out.println("First car fuelcost per distance = " + literperdistanceone);

        int literperdistancetwo = distance / 100 * secondcar.getCarFuel();
        System.out.println("Second car fuelcost per distance = " + literperdistancetwo);

        int literperdistancethree = distance / 100 * thirdcar.getCarFuel();
        System.out.println("Third car fuelcost per distance = " + literperdistancethree);
        firstcar.setCarLiterPerDistance(literperdistanceone);
        secondcar.setCarLiterPerDistance(literperdistancetwo);
        thirdcar.setCarLiterPerDistance(literperdistancethree);

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

        //int firstcartranscost = loadinkg / firstcar.getCarCapacity() * literperdistanceone;
        //System.out.println("First car transportation cost = " + firstcartranscost);

        //int secondcartranscost = loadinkg / secondcar.getCarCapacity() * literperdistancetwo;
        //System.out.println("Second car transportation cost = " + secondcartranscost);


        //int thirdcartranscost = loadinkg / thirdcar.getCarCapacity() * thirdcarliterperdistance;
        //System.out.println("Third car transportation cost = " + thirdcartranscost);
    }
}
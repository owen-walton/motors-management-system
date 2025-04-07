package product;

public class HGV extends Vehicle {

    // create the attributes specific to HGV class
    private final int maxTowingWeight;

    // constructor
    public HGV(String brand, String modelName, int engineSize, String fuelType, float avgFuelEfficiency, int maxTowingWeight){

        // sets the attributes inherited from vehicle class
        super(brand, modelName, engineSize, fuelType, avgFuelEfficiency, 50000);

        // sets the attributes specific to HGV class
        this.maxTowingWeight = maxTowingWeight;

    }

    // calculates price of vehicle
    @Override
    public float calculatePrice(){

        // adds variables which don't need manipulation before adding value
        float totalPrice = getBasePrice() + getEngineSize();

        // adds £500 for every 100 towing weight rounded up
        for(int i = maxTowingWeight; i > 0; i -= 1000){
            totalPrice += 500;
        }

        // if fuel type = diesel
        if (getFuelType().equals("Diesel")){
            // add 10% to price
            totalPrice *= 1.1f;
        }

        // returns total price of HGV
        return totalPrice;
    }


    // compiles all details about vehicle together into a string
    @Override
    public String toString(){

        return "Brand: " + getBrand() +
                "\nModel Name: " + getModelName() +
                "\nPrice: £" + priceToString() +
                "\nEngine Size: " + getEngineSize() + " cubic centimetres" +
                "\nFuel Type: " + getFuelType() +
                "\nAverage Fuel Efficiency: " + getAvgFuelEfficiency() + " miles per gallon" +
                "\nMaximum Towing Weight (kg): " + maxTowingWeight;
    }
}
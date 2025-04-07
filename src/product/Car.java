
package product;

public class Car extends Vehicle  {

    // create the attributes specific to car class
    private final boolean hasSunroof;

    // constructor
    public Car(String brand, String modelName, int engineSize, String fuelType, float avgFuelEfficiency, boolean hasSunroof){

        // sets the attributes inherited from vehicle class
        super(brand, modelName, engineSize, fuelType, avgFuelEfficiency, 10000);

        // sets the attributes specific to car class
        this.hasSunroof = hasSunroof;

    }

    // calculates price of vehicle
    @Override
    public float calculatePrice(){

        // adds variables which don't need manipulation before adding value
        float totalPrice = getBasePrice() + getEngineSize();

        // checks if there is a sunroof
        if (hasSunroof){
            // adds cost of a sunroof
            totalPrice += 1500;
        }

        // returns the total price of car
        return totalPrice;
    }

    // compiles all details about vehicle together into a string to be returned
    @Override
    public String toString(){

        return "Brand: " + getBrand() +
                "\nModel Name: " + getModelName() +
                "\nPrice: £" + priceToString() +
                "\nEngine Size: " + getEngineSize() + " cubic centimetres" +
                "\nFuel Type: " + getFuelType() +
                "\nAverage Fuel Efficiency: " + getAvgFuelEfficiency() + " miles per gallon" +
                "\nSunroof: " + hasSunroof;
    }
}

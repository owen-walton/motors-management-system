
package product;

public abstract class Vehicle {

    // create attributes common for all extensions of Vehicle class
    private final String brand; // e.g ford
    private final String modelName; // e.g focus
    private final int engineSize; // cubic centimetres
    private final String fuelType; // e.g petrol or diesel
    private final float avgFuelEfficiency; // miles per gallon
    private final int basePrice;


    // constructor
    public Vehicle(String brand, String modelName, int engineSize, String fuelType, float avgFuelEfficiency, int basePrice){

        // assigns the values entered to attributes
        this.brand = brand;
        this.modelName = modelName;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
        this.avgFuelEfficiency = avgFuelEfficiency;
        this.basePrice = basePrice;

    }

    // abstract methods created because it depends on which extension of vehicle uses it
    public abstract float calculatePrice();
    public abstract String toString();


    // returns price as a string to 2 decimal places
    public String priceToString(){

        return String.format("%,.2f", calculatePrice());
    }


    // getters:
    public String getBrand() {
        return brand;
    }

    public String getModelName() {
        return modelName;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public float getAvgFuelEfficiency() {
        return avgFuelEfficiency;
    }

    public int getBasePrice() {
        return basePrice;
    }

}

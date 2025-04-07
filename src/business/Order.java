
package business;

import product.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Order {

    // creates list
    private final List<Vehicle> vehicles;

    // constructor
    public Order(){
        vehicles = new ArrayList<>();
    }

    // add a vehicle
    public void add(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    // finalises an order of whatever is currently in the list of vehicles
    public List<Vehicle> completeOrder(){

        // variables to be calculated within loop
        String order = "";
        float totalCost = 0;

        // loops through each object
        for (Vehicle v: vehicles){

            // adds the cost of current vehicle
            totalCost += v.calculatePrice();

            // adds the details of current vehicle to the string
            order = String.format("%s%s\n\n", order, v);

        }

        // prints "Order details:" header and the total cost
        System.out.printf("Order details:\nTotal cost: £%,.2f\n", totalCost);

        // line breaks and section off the header from the details of order
        System.out.println("\n----------------------------------------------\n");

        // prints finalised order details
        System.out.println(order);

        // returns current vehicles list to keep a record of what was ordered, this can be written to a database
        return vehicles;
    }


}

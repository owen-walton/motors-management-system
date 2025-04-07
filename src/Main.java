import business.Order;
import product.Car;
import product.HGV;

/**
 * Motor vehicle management system to create and sell vehicles
 *
 * @author Owen Walton
 */

public class Main {

    public static void main(String [] args) {

        // line break
        System.out.println();

        // creates 2 car sample objects
        Car Ford = new Car("Ford", "Fiesta", 2000, "Petrol", 45.6f, true);
        Car Honda = new Car("Honda", "Civic", 2000, "Diesel", 38f, false);

        // creates 2 hgv sample objects
        HGV x = new HGV("Y", "XYZ", 4000, "Petrol", 45.53f, 40000);
        HGV y = new HGV("Y", "XYZ", 4000, "Petrol", 45.53f, 40001);
        HGV volvo = new HGV("Volvo", "Big Vehicle", 4000, "Diesel", 45.53f, 40000);

        // instantiates order class
        Order bulkOrder = new Order();

        // adds all vehicles created to bulkOrder
        bulkOrder.add(Ford);
        bulkOrder.add(Honda);
        bulkOrder.add(Honda); // adds a second Honda with same details
        bulkOrder.add(x);
        bulkOrder.add(y);
        bulkOrder.add(volvo);

        // completes order
        bulkOrder.completeOrder();


    }

}
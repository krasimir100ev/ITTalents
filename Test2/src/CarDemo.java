import carparts.Engine;
import carparts.Frame;
import carparts.Seat;
import carparts.Tyre;

public class CarDemo {

    public static void main(String[] args) throws InterruptedException {


        ProductionLine line1 = new ProductionLine("Line 1");
        ProductionLine line2 = new ProductionLine("Line 2");
        ProductionLine line3 = new ProductionLine("Line 3");

        line1.addCarPart(new Engine());
        line1.addCarPart(new Seat());
        line1.addCarPart(new Tyre());

        line2.addCarPart(new Frame());
        line2.addCarPart(new Seat());
        line2.addCarPart(new Tyre());
        line2.addCarPart(new Tyre());

        line3.addCarPart(new Tyre());
        line3.addCarPart(new Seat());
        line3.addCarPart(new Seat());
        line3.addCarPart(new Seat());

        long started = System.currentTimeMillis();
        line1.start();
        line2.start();
        line3.start();

        line1.join();
        line2.join();
        line3.join();

        long passed = System.currentTimeMillis() - started;
        System.out.println("Time passed: " + passed);


        /*
            4 tyre = 2s
            5 seat = 3s
            1 frame = 5s
            1 engine = 7s

            3 components at a time

            7+3+2
            5+3+2+2
            2+3+3+3

         */

    }
}

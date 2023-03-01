import carparts.CarPart;

import java.util.ArrayList;
import java.util.List;

public class ProductionLine extends Thread{

    private List<CarPart> parts = new ArrayList<>();

    public ProductionLine(String name){
        setName(name);
    }

    public void addCarPart(CarPart carPart){
        this.parts.add(carPart);
    }

    @Override
    public void run() {
        for(CarPart carPart : parts){
            try {
                Thread.sleep(carPart.getProductionTime());
            } catch (InterruptedException e) {
                System.out.println("ops");
            }
            System.out.println(carPart.getName() + " is produced by " + Thread.currentThread().getName());
        }
    }
}

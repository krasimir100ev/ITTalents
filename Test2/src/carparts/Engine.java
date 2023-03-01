package carparts;

public class Engine extends CarPart{

    public Engine() {
        super("carparts.Engine");
    }

    @Override
    public int getProductionTime() {
        return 7000;
    }
}

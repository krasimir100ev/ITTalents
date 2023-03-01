package carparts;

public class Frame extends CarPart{

    public Frame() {
        super("carparts.Frame");
    }

    @Override
    public int getProductionTime() {
        return 5000;
    }
}
package carparts;

public class Seat extends CarPart{

    public Seat() {
        super("carparts.Seat");
    }

    @Override
    public int getProductionTime() {
        return 3000;
    }
}

package carparts;

public class Tyre extends CarPart{

    public Tyre() {
        super("carparts.Tyre");
    }

    @Override
    public int getProductionTime() {
        return 2000;
    }
}

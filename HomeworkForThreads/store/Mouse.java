package sorting.store;

public class Mouse extends Product{
    public Mouse(String name) {
        super(name);
    }

    @Override
    int getCategoryId() {
        return 3;
    }
}

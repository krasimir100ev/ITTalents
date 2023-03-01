package sorting.store;

public class Keyboard extends Product{

    public Keyboard(String name) {
        super(name);
    }

    @Override
    int getCategoryId() {
        return 2;
    }
}

package sorting.store;

public class Beer extends Product{
    public Beer(String name) {
        super(name);
    }

    @Override
    int getCategoryId() {
        return 1;
    }
}

package sorting.store;

import java.util.*;

public class Store {

    HashMap<Product, Integer> sales = new HashMap<>();

    public void sell(Product product, int quantity){
        if(!this.sales.containsKey(product)){
            this.sales.put(product, quantity);
        }
        else {
            this.sales.put(product, this.sales.get(product) + quantity);
        }
    }

    public void showSales() {
        TreeMap<Product, Integer> sorted = new TreeMap<>((p1, p2) -> Integer.compare(p1.getCategoryId(), p2.getCategoryId()));
        sorted.putAll(this.sales);
        for(Map.Entry<Product, Integer> e : sorted.entrySet()){
            System.out.println(e.getKey() + " - " + e.getValue() + " sales");
        }
    }
}

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;

public class CollectionsDemo {

    public static void main(String[] args) throws InterruptedException {

        List<String> list = Collections.synchronizedList(new ArrayList<>());

        for (int i = 0; i < 1000; i++) {
            new Thread(()-> list.add("lalala")).start();
        }

        Thread.sleep(1000);
        System.out.println(list.size());

    }
}

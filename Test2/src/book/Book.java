package book;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Book {

    public synchronized void print(){
        //
    }

    public synchronized static void getPublisher(){
        //...
    }

    public static void main(String[] args) {

        Book malazan = new Book();
        malazan.print();
        Book.getPublisher();

//        synchronized (/*monitor object*/){
//
//        }

    }
}

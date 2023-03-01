package bank;

import book.Book;

public class Demo {

    public static void main(String[] args) {

        Bank bank = new Bank();

        new Thread(()-> bank.deposit()).start();
        new Thread(()-> bank.withdraw()).start();
        new Thread(()-> bank.check()).start();

    }
}

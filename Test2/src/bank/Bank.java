package bank;

public class Bank {

    private int amount = 0;

    public synchronized void deposit(){
        this.amount += 100;
        System.out.println("Deposited 100");
    }

    public synchronized void withdraw(){
        this.amount -= 100;
        System.out.println("Withdrawn 100");
    }

    public synchronized void check(){
        System.out.println("Balance = " + amount);
    }
}

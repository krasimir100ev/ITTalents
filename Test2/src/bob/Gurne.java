package bob;

public class Gurne {

    private int bob = 0;
    private int capacity = 100;

    public synchronized void sipiBob(){
        try {
            while(bob >= capacity) {
                this.wait();
            }
            this.bob++;
            System.out.println("Sipahme bob, sega boba e " + this.bob);
            this.notifyAll();
        } catch (InterruptedException e) {
            System.out.println("...");
        }
    }

    public synchronized void vzemiBob(){
        try {
            while(this.bob <= 0) {
                this.wait();
            }
            this.bob--;
            System.out.println("Hapnahme bob, sega boba e " + this.bob);
            this.notifyAll();
        } catch (InterruptedException e) {
            System.out.println("ops");
        }
    }


}

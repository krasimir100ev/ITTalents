import carparts.Seat;
import carparts.Tyre;

public class Phone {

    Object lock1 = new Object();
    Object lock2 = new Object();
    //intrinsic lock
    //acquired by a thread that starts executing a syncronized method
    //released by the thread when the method body is done

    private boolean isCalling = false;

    synchronized void changeBattery(){

    }

    private Seat seat = new Seat();
    private Tyre tyre = new Tyre();

    void call(){
        synchronized (seat) {
            if(isCalling == false){
                isCalling = true;
                //.....50 lines
                isCalling = false;
            }
            else{
                System.out.println("Sorry, only one call at a time");
            }
        }
    }


    void charge(){
        //50 lines of code
        synchronized (this){
            //2 lines of code
        }
        //150 lines of code
    }
}

package bob;

public class Deti extends Thread{

    private Gurne gurne;

    public Deti(Gurne gurne){
        this.gurne = gurne;
    }

    @Override
    public void run() {
        while(true){
            gurne.vzemiBob();
        }
    }
}

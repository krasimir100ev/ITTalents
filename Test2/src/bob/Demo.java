package bob;

public class Demo {

    public static void main(String[] args) {

        Gurne gurne = new Gurne();

        for (int i = 0; i < 10; i++) {

            Deti deti = new Deti(gurne);
            Baba baba = new Baba(gurne);
            baba.start();
            deti.start();
        }

    }
}

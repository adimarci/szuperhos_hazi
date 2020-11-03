import java.util.Random;

public class Vasember extends Bosszuallo implements Milliardos {


    public Vasember() {
        setSzuperero(150);
        setVanEGyengesege(true);


    }

    @Override
    public boolean megmentiAVilagot() {
        if (getSzuperero()>1000){
            return true;
        }else{
            return false;
        }
    }


    @Override
    public void kutyutKeszit() {
        Random rnd =new Random();
        double random= rnd.nextDouble()*10;

            double noveltEro= getSzuperero()*random;

    }

    @Override
    public String toString() {
        return "Vasember" + "szuperereje=" + getSzuperero() ;
    }
}

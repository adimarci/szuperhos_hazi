public class Batman extends Bosszuallo implements Szuperhos,Milliardos {
    public double lelemenyesseg;

    public Batman() {
        this.lelemenyesseg = 100;
    }

    @Override
    public void kutyutKeszit() {
        lelemenyesseg+=50;
    }

    @Override
    public boolean legyoziE() {
        if (getSzuperero() < lelemenyesseg) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double mekkoraAzEreje() {
        return lelemenyesseg*2;
    }

    @Override
    public boolean megmentiAVilagot() {
        return false;
    }

    @Override
    public String toString() {
        return "Batman" + "leleményessége=" + lelemenyesseg ;
    }
}

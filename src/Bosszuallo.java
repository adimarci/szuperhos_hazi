public abstract class Bosszuallo implements Szuperhos {
    private double szuperero;
    private boolean vanEGyengesege;
    private boolean legyoziE;

    @Override
    public boolean legyoziE() {
        if (this.vanEGyengesege == true && szuperero > this.szuperero) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double mekkoraAzEreje() {
        return this.szuperero;
    }

    public abstract boolean megmentiAVilagot();

    public double getSzuperero() {
        return szuperero;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    public boolean isLegyoziE() {
        return legyoziE;
    }

    public void setLegyoziE(boolean legyoziE) {
        this.legyoziE = legyoziE;
    }

    @Override
    public String toString() {
        return "Bosszuallo" +
                "szuperero=" + szuperero +
                ", vanEGyengesege=" + vanEGyengesege +
                ", legyoziE=" + legyoziE ;
    }
}

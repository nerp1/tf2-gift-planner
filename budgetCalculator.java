public class budgetCalculator {
    private double keyPrice;

    public budgetCalculator(double keyPrice) {
        this.keyPrice = keyPrice;
    }
    public double keysToRef(int keys) {
            return keys * this.getKeyPrice();
    }

    public double getKeyPrice() {
        return keyPrice;
    }

    public double pullKeyPrice() {
        //TBD;
        return 0;
    }

    public void setKeyPrice(double keyPrice) {
        this.keyPrice = keyPrice;
    }
}

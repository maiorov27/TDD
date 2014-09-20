package app;

public class Dollar {
    public int amount;

    public Dollar(int i) {
        this.amount = i;
    }

    public Dollar  times(int number){
        return new Dollar(amount * number);
    }
}

package app;

public class Dollar {
    private int amount;

    public Dollar(int i) {
        this.amount = i;
    }

    public Dollar times(int number) {
        return new Dollar(amount * number);
    }

    public boolean equals(Object o) {

        if (! (o instanceof Dollar))
            return false;

        Dollar that = (Dollar) o;
        return this.amount == that.amount;
    }
}

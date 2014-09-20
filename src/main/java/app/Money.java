package app;

public class Money {
    protected int amount;

    public boolean equals(Object o) {

        if (! (o instanceof Money))
            return false;
        Money that = (Money) o;
        return this.amount == that.amount;
    }

}

package app;

public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int number) {
        return new Franc(amount * number);
    }

//    public boolean equals(Object o) {
//
//        if (! (o instanceof Franc))
//            return false;
//        Franc that = (Franc) o;
//        return this.amount == that.amount;
//    }
}

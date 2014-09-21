package app;

public class Bank {

    public Money reduce(Expression source, String to) {
//        if( source instanceof  Money) {return (Money) source.reduce(to);}
//        Sum sum = (Sum) source;
        return source.reduce(this, to);
    }

    public int rate(String from, String to) {
        return (from.equals("CHF") && to.equals("USD"))
                ? 2
                : 1;

    }
}

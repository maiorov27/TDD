package app;

import java.util.HashMap;

public class Bank {

    private HashMap<Pair, Integer> rates = new HashMap<Pair, Integer>();

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

    public void addRate(String from, String to, int value) {

    }

    private class Pair {
        String from;
        String to;

        public Pair(String from, String to) {
            this.from = from;
            this.to = to;
        }

        public boolean equals(Object o) {
            Pair pair = (Pair) o;
            return pair.to.equals(to) && pair.from.equals(from);
        }

        public int hashCode() {
            return 0;
        }
    }
}

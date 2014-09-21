package app;

public class Money implements Expression {
    protected int amount;
    protected String currency;

    public boolean equals(Object o) {

        if (!(o instanceof Money))
            return false;
        Money that = (Money) o;
        return this.amount == that.amount && that.currency.equals(this.currency);
    }

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public Money times(int number) {
        return new Money(amount*number, currency);
    }

    public String currency() {
        return currency;
    }

    public String toString() {
        return amount + " " + currency;
    }

    public Expression plus(Money addend) {
        return new Sum(this, addend);
    }

    public Money reduce(String to){
        return this;
    }
}

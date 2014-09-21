package app;

public class Sum implements Expression {
    private Expression augend;
    private Expression addend;

    public Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(Bank bank, String to) {

        int rezult = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount;
        return new Money(rezult, to);
    }

    @Override
    public Expression plus(Expression addend) {
        return null;
    }


}

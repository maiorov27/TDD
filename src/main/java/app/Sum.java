package app;

public class Sum implements Expression {
    private Money augend;
    private Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(Bank bank, String to) {

        int rezult = augend.amount + addend.amount;
        return new Money(rezult, to);
    }


}

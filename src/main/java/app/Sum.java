package app;

public class Sum implements Expression {
    private Money augend;
    private Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }


}

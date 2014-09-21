package app;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DollarTest {

    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertThat(five.times(2)).isEqualTo(Money.dollar(10));
        assertThat(five.times(3)).isEqualTo(Money.dollar(15));
    }

    @Test
    public void testEquality() {
        assertThat(Money.dollar(5)).isEqualTo(Money.dollar(5));
        assertThat(Money.dollar(5)).isNotEqualTo(Money.dollar(6));
        assertThat(Money.dollar(5)).isNotEqualTo(Money.franc(5));
    }

    @Test
    public void testCurrency() {
        assertThat(Money.dollar(5).currency()).isEqualTo("USD");
        assertThat(Money.franc(5).currency()).isEqualTo("CHF");
    }

    @Test
    public void testSimpleAddition() {
        Money five = Money.dollar(5);
        Expression rezult = five.plus(five);
        Sum sum = (Sum) rezult;
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertThat(reduced).isEqualTo(Money.dollar(10));
    }

    @Test
    public void testReduceSum() {
        Expression sum = new Sum(Money.dollar(5), Money.dollar(6));
        Bank bank = new Bank();
        Money result = bank.reduce(sum, "USD");
        assertThat(result).isEqualTo(Money.dollar(11));
    }

    @Test
    public void testReduceMoney() {
        Bank bank = new Bank();
        Money result = bank.reduce(Money.dollar(1), "USD");
        assertThat(result).isEqualTo(Money.dollar(1));
    }

    @Test
    public void testReduceMoneyDifferentCurrency() {
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(Money.franc(2), "USD");
        assertThat(result).isEqualTo(Money.dollar(1));
    }

    @Test
    public void testIndentityRate() {
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        assertThat(bank.rate("USD", "USD")).isEqualTo(1);
    }

    @Test
    public void testMixedCurrency() {
        Expression fiveBucks = Money.dollar(5);
        Expression tenFrancs = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF","USD",2);
        Money rezult = bank.reduce(fiveBucks.plus(tenFrancs),"USD");
        assertThat(rezult).isEqualTo(Money.dollar(10));
    }


}

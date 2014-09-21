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
        Bank bank = new Bank();
        Expression sum = Money.dollar(5).plus(Money.dollar(5));
        assertThat(sum).isEqualTo(Money.dollar(10));
    }


}

package app;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FrancTest {

    @Test
    public void testMultiplication() {
        Franc five  = new Franc(5);
        assertThat(five.times(2)).isEqualTo(new Franc(10));
        assertThat(five.times(3)).isEqualTo(new Franc(15));
    }

}

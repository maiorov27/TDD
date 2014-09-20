import app.Dollar;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DollarTest {

    @Test
    public void testMultiplication() {
        Dollar five  = new Dollar(5);
        Dollar product = five.times(2);
        assertThat(product.amount).isEqualTo(10);
    }

    @Test
    public void testEquality(){
        Dollar five  = new Dollar(5);
        assertThat(new Dollar(5)).isEqualTo(new Dollar(5));
    }


}

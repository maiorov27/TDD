import app.Dollar;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DollarTest {

    @Test
    public void testMultiplication() {
        Dollar five  = new Dollar(5);
        Dollar product = five.times(2);
        assertThat(product).isEqualTo(10);
    }


}

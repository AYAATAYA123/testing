import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SumTest {
    @Test
    public void testAdd() {
        assertEquals(8, Sum.add(5, 3));
    }
}

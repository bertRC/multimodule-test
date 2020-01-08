package education.bert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SummatorTest {
    @Test
    public void sumTest() {
        Summator summator = new Summator();
        int a = 1;
        int b = 2;
        int expected = 3;
        assertEquals(expected, summator.sum(a, b));
    }
}

package education.bert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MainTest {
    @Test
    public void mainTest() {
        String text = "Hello World!";
        System.out.println(text);
        assertNotNull(text);
    }
}

package education.bert.unit;

import education.bert.benchmark.MyBenchmark;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MainTest {
    @AfterAll
    static void benchmarksRunner() throws RunnerException {
        Options options = new OptionsBuilder()
                .include(MyBenchmark.class.getSimpleName())
                .forks(1)
                .build();
        new Runner(options).run();
    }

    @Test
    public void mainTest() {
        String text = "Hello World!";
        System.out.println(text);
        assertNotNull(text);
    }
}

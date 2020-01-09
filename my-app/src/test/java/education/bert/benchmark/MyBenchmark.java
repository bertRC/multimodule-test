package education.bert.benchmark;

import education.bert.Summator;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class MyBenchmark {
    @State(Scope.Thread)
    public static class MyState {
        public int a = 1;
        public int b = 2;
        public Summator summator = new Summator();
    }

    @Benchmark
    public void sumBenchmark(MyState state, Blackhole blackhole) {
        int sum = state.summator.sum(state.a, state.b);

        blackhole.consume(sum);
    }

    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder()
                .include(MyBenchmark.class.getSimpleName())
                .forks(1)
                .build();
        new Runner(options).run();
    }
}

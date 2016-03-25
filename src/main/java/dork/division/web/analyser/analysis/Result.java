package dork.division.web.analyser.analysis;

import java.util.Map;

public class Result {

    private Map<String, Integer> frequency;

    /**
     * This is on purpose private, so that the factory methods below are used instead
     */
    private Result() {
    }

    public static Result createResultWithFrequency( Map<String, Integer> frequency) {
        Result result = new Result();
        result.frequency = frequency;
        return result;
    }

    public Map<String, Integer> getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return "Result{" +
                "frequency=" + frequency +
                '}';
    }
}

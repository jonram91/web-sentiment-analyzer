package dork.division.web.analyser.analysis;

import dork.division.web.analyser.data.Data;

import java.util.LinkedHashMap;
import java.util.Map;

public class Analyser {

    public Result analyse(Data data) {
        Map<String, Integer> frequencies = new LinkedHashMap<String, Integer>();


        //TODO: for Jonathan: analyse frequencies here

        return Result.createResultWithFrequency(frequencies);
    }

}

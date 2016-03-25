package dork.division.web.analyser;

import dork.division.web.analyser.analysis.Analyser;
import dork.division.web.analyser.analysis.Result;
import dork.division.web.analyser.data.Data;
import dork.division.web.analyser.provider.BBCHeadlinesDataProvider;
import dork.division.web.analyser.provider.DataProvider;

public class Main {

    public static void main(String[] args) {
        DataProvider provider = new BBCHeadlinesDataProvider();
        Analyser analyser = new Analyser();
        String searchTerm = "trump";
        Data dataForTrump = provider.findDataFor(searchTerm);
        Result result = analyser.analyse(dataForTrump);
        System.out.println("result for "+searchTerm+":\n" + result);
    }

}

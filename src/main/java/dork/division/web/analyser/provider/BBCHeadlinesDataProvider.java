package dork.division.web.analyser.provider;

import dork.division.web.analyser.data.BBCHeadlinesData;
import dork.division.web.analyser.data.Data;

public class BBCHeadlinesDataProvider implements DataProvider {
    public Data findDataFor(String term) {
        return new BBCHeadlinesData();
    }
}

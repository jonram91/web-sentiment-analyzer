package dork.division.web.analyser.provider;

import dork.division.web.analyser.data.Data;

public interface DataProvider {
    Data findDataFor(String term);
}

package dork.division.web.analyser.data;

import java.util.List;

public abstract class Data {

    private final String source;

    public Data(String source) {
        this.source = source;
    }

    public abstract String getWholeDataAsString();

}

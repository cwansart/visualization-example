package de.cwansart.visualization.springboot;

import java.util.List;

public class PlotDataObject {

    private String name;

    private List<PlotDataObject> children;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PlotDataObject> getChildren() {
        return children;
    }

    public void setChildren(List<PlotDataObject> children) {
        this.children = children;
    }
}

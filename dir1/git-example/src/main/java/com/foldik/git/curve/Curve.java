package com.foldik.git.curve;

import java.util.ArrayList;
import java.util.List;

public class Curve {

    private final List<String> xPoint;
    private final List<String> yPoints;

    public Curve(List<String> xPoint, List<String> yPoints) {
        this.xPoint = new ArrayList<>(xPoint);
        this.yPoints = new ArrayList<>(yPoints);
    }

    public List<String> getXPoint() {
        return new ArrayList<>(xPoint);
    }

    public List<String> getYPoints() {
        return new ArrayList<>(yPoints);
    }
}

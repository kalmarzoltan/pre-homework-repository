package com.foldik.git.curve;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;

public class CurveGenerator {

    private final CurveFunction curveFunction;

    public CurveGenerator(CurveFunction curveFunction) {
        this.curveFunction = curveFunction;
    }

    public Curve getCurve(BigDecimal start, BigDecimal end, BigDecimal step) {
        DecimalFormat decimalFormat = getNumberFormatter();
        List<String> xPoints = new ArrayList<>();
        List<String> yPoints = new ArrayList<>();
        BigDecimal xPoint = start;
        while (xPoint.compareTo(end) < 0) {
            BigDecimal yPoint = curveFunction.calcY(xPoint);
            xPoints.add(decimalFormat.format(xPoint));
            yPoints.add(decimalFormat.format(yPoint));
            xPoint = xPoint.add(step);
        }
        return new Curve(xPoints, yPoints);
    }

    private DecimalFormat getNumberFormatter() {
        DecimalFormat formatter = new DecimalFormat("#0.####");
        DecimalFormatSymbols pointSeparator = new DecimalFormatSymbols();
        pointSeparator.setDecimalSeparator('.');
        formatter.setDecimalFormatSymbols(pointSeparator);
        return formatter;
    }
}

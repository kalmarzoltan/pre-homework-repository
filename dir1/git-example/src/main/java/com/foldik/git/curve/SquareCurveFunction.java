package com.foldik.git.curve;

import java.math.BigDecimal;

public class SquareCurveFunction implements CurveFunction {

    @Override
    public BigDecimal calcY(BigDecimal xPoint) {
        return xPoint.multiply(xPoint);
    }
}

package com.foldik.git.curve;

import java.math.BigDecimal;

public interface CurveFunction {

    BigDecimal calcY(BigDecimal xPoint);
}

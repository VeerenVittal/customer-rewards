package com.service.rewards.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Utils {

  public Integer addDecimalPlacesToQty(BigDecimal price) {
    // setting the scaling to 0 to avoid complexity
    BigDecimal qtyWithPrecision = price.setScale(0, RoundingMode.CEILING);
    return qtyWithPrecision.intValue();
  }


}

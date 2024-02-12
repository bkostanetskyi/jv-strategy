package core.basesyntax.strategy.impl;

import core.basesyntax.DiscountService;

public class NewYearDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 20;
    }
}

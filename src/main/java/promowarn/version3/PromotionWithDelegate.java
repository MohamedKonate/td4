package promowarn.version3;

import promowarn.version3.Promotion;

public interface PromotionWithDelegate extends Promotion {
    Student delegate();

    void chooseDelegate(final Student e);
}

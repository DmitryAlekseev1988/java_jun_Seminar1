package seminar1.common;

import seminar1.common.interfaces.SemiFinishedFood;

/**
 * Чебурек
 */
public class Cheburek implements SemiFinishedFood {
    @Override
    public boolean getProteins() {
        return false;
    }
    @Override
    public boolean getFats() {
        return true;
    }
    @Override
    public boolean getCarbohydrates() {
        return false;
    }
    @Override
    public String getName() {
        return "Чебурек";
    }
}
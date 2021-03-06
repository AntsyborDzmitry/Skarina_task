package kiryl.mark.impl;

import kiryl.mark.exception.InvalidMarkValueException;

public class DoubleMark20<T extends Double> extends AbstractDoubleMark<T> {

    public DoubleMark20(final T mark) {
        super(mark);
    }

    @Override
    public void isValid() throws InvalidMarkValueException {
        if (mark.compareTo(1.0) < 0 || mark.compareTo(20.0) > 0 || !isWholeOrHalf()) {
            throw new InvalidMarkValueException("Out of bounds or not half value");
        }
    }
}

package bemoore.programming;

import java.util.Random;

public class NumberGeneratorImpl implements NumberGenerator {
    private final Random random = new Random();
    private final int maxNumber = 100;
    // Public methods //
    @Override
    public int next() {
        return  random.nextInt(maxNumber);
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;
    }
}

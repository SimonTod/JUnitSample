import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SampleClassTest
{
    @Test
    public void multiplyingByZeroShouldReturnZero()
    {
        SampleClass sample = new SampleClass();
        assertEquals("10 x 0 must equal 0", sample.multiply(10, 0), 0);
    }
    
    @Test
    public void multiplyingByOneShouldReturnSame()
    {
        SampleClass sample = new SampleClass();
        assertEquals("10 x 1 must equal 10", sample.multiply(10, 1), 10);
    }
    
    @Test
    public void multiplyingByOneShouldReturnEight()
    {
        SampleClass sample = new SampleClass();
        assertEquals("10 x 1 must equal 8", sample.multiply(10, 1), 8);
    }
}

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static com.google.common.math.IntMath.pow;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PowMathTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void PowShouldThrowException()
    {
        //Arrange
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("exponent (-2) must be >= 0");

        //Act
        pow(5, -2);

        //Assert
        fail();
    }

    @Test
    public void PowShouldAlsoThrowException()
    {
        //Arrange
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("exponent (-2) must be >= 0");

        //Act
        pow(-5, -2);

        //Assert
        fail();
    }

    @Test
    public void CannotUseNegativeExponentException()
    {
        //Arrange
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("exponent (-1) must be >= 0");

        //Act
        pow(1, -1);

        //Assert
        fail();
    }

    @Test
    public void CannotUseNegativeExponentException2()
    {
        //Arrange
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("exponent (-1) must be >= 0");

        //Act
        pow(-1, -1);

        //Assert
        fail();
    }

    @Test
    public void ShouldReturnMinusOne()
    {
        //Arrange
        //Act
        int result = pow(-1, 1);

        //Assert
        assertEquals(-1, result);
    }

    @Test
    public void PowShouldReturnCorrectValue()
    {
        //Arrange
        //Act
        int result = pow(2, 4);

        //Assert
        assertEquals(16, result);
    }

    @Test
    public void PowShouldReturnProperValue()
    {
        //Arrange
        //Act
        int result = pow(-2, 4);

        //Assert
        assertEquals(16, result);
    }

    @Test
    public void PowShouldReturnOne()
    {
        //Arrange
        //Act
        int result = pow(0, 0);

        //Assert
        assertEquals(1, result);
    }

    @Test
    public void PowShouldAlsoReturnOne()
    {
        //Arrange
        //Act
        int result = pow(Integer.MAX_VALUE, 0);

        //Assert
        assertEquals(1, result);
    }

    @Test
    public void PowShouldOverflowAndReturnIntegerMinValue()
    {
        //Arrange
        //Act
        int result = pow(2, 31);

        //Assert
        assertEquals(Integer.MIN_VALUE, result);
    }

    @Test
    public void PowShouldOverflowAndReturnZero()
    {
        //Arrange
        //Act
        int result = pow(2, 32);

        //Assert
        assertEquals(0, result);
    }

    @Test
    public void PowShouldOverflowAndReturnZero2()
    {
        //Arrange
        //Act
        int result = pow(2, 50);

        //Assert
        assertEquals(0, result);
    }

    @Test
    public void PowShouldOverflowAndReturnZero3()
    {
        //Arrange
        //Act
        int result = pow(2, 150);

        //Assert
        assertEquals(0, result);
    }

    @Test
    public void OverflowsAndReturns1()
    {
        //Arrange
        //Act
        int result = pow(Integer.MAX_VALUE, 2);

        //Assert
        assertEquals(1, result);
    }

    @Test
    public void OverflowsAndAlsoReturns1()
    {
        //Arrange
        //Act
        int result = pow(Integer.MAX_VALUE, 8);

        //Assert
        assertEquals(1, result);
    }

    @Test
    public void OverflowsAndReturnsIntegerMaxValue()
    {
        //Arrange
        //Act
        int result = pow(Integer.MAX_VALUE, 3);

        //Assert
        assertEquals(Integer.MAX_VALUE, result);
    }

    @Test
    public void OverflowsAndAlsoReturnsIntegerMaxValue()
    {
        //Arrange
        //Act
        int result = pow(Integer.MAX_VALUE, 9);

        //Assert
        assertEquals(Integer.MAX_VALUE, result);
    }

    @Test
    public void OverflowsAndAlsoReturnsIntegerMaxValue2()
    {
        //Arrange
        //Act
        int result = pow(Integer.MAX_VALUE, Integer.MAX_VALUE);

        //Assert
        assertEquals(Integer.MAX_VALUE, result);
    }

    @Test
    public void IntegerMinValueToEverythingReturns0()
    {
        //Arrange
        //Act
        int result = pow(Integer.MIN_VALUE, 15);

        //Assert
        assertEquals(0, result);
    }

    @Test
    public void IntegerMinValueToEverything2Returns0()
    {
        //Arrange
        //Act
        int result = pow(Integer.MIN_VALUE, Integer.MAX_VALUE);

        //Assert
        assertEquals(0, result);
    }

}

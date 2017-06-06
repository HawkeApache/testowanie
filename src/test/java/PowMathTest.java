import com.google.common.math.IntMath;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static com.google.common.math.IntMath.binomial;
import static com.google.common.math.IntMath.pow;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PowMathTest
{
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void PowShouldReturnCorrectValue()
    {
        //Arrange
        //Act
        int result = pow(2,4);

        //Assert
        assertEquals(16,result);
    }

    @Test
    public void PowShouldReturnProperValue()
    {
        //Arrange
        //Act
        int result = pow(-2,4);

        //Assert
        assertEquals(16,result);
    }

    @Test
    public void PowShouldReturnOne()
    {
        //Arrange
        //Act
        int result = pow(0,0);

        //Assert
        assertEquals(1,result);
    }

    @Test
    public void PowShouldThrowException()
    {
        //Arrange
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("exponent (-2) must be >= 0");

        //Act
        pow(5,-2);

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
        pow(-5,-2);

        //Assert
        fail();
    }
}

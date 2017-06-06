import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static com.google.common.math.IntMath.binomial;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class BinomialMathTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void binomialShouldReturnCorrectValueMin(){
        //Arrange
        //Act
        int result = binomial(0,0);

        //Assert
        assertEquals(1,result);
    }

    @Test
    public void binomialShouldReturnCorrectValue(){
        //Arrange
        //Act
        int result = binomial(10,3);

        //Assert
        assertEquals(120,result);
    }

    @Test
    public void binomialShouldReturnIntegerMaxValueWhenResultNotFitInInt(){
        //Arrange
        //Act
        int result = binomial(300000,5);

        //Assert
        assertEquals(Integer.MAX_VALUE,result);
    }

    @Test
    public void binomialShouldThrowExceptionWhenNSmallerThanK(){
        //Arrange
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("k (15) > n (10)");

        //Act
        binomial(10,15);

        //Assert
        fail();
    }

    @Test
    public void binomialShouldThrowExceptionWhenKIsNegative(){//3
        //Arrange
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("k (-3) must be >= 0");

        //Act
        binomial(12,-3);

        //Assert
        fail();
    }

    @Test
    public void binomialShouldThrowExceptionWhenNIsNegative(){
        //Arrange
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("n (-5) must be >= 0");

        //Act
        binomial(-5,2);

        //Assert
        fail();
    }
}

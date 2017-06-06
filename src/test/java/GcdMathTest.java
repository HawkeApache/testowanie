import com.google.common.math.IntMath;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.fail;

public class GcdMathTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void bothArgumentAreNotNegative() {
        //Arrange
        int a = 125;
        int b = 25;
        //Act
        int gcd = IntMath.gcd(a, b);
        //Assert
        assertEquals(25, gcd);
    }

    @Test
    public void firstArgumentIsNotNegativeAndSecondIsNegative() {
        //Arrange
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("b (-1) must be >= 0");
        int a = 25;
        int b = -1;
        //Act
        int gcd = IntMath.gcd(a, b);
        //Assert
        fail();
    }

    @Test
    public void bothArgumentsAreNegative() {
        //Arrange
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("a (-1) must be >= 0");
        int a = -1;
        int b = -1;
        //Act
        int gcd = IntMath.gcd(a, b);
        //Assert
        fail();
    }

    @Test
    public void firstArgumentIsNegativeAndSecondIsNotNegative() {
        //Arrange
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("a (-1) must be >= 0");
        int a = -1;
        int b = 2;
        //Act
        int gcd = IntMath.gcd(a, b);
        //Assert
        fail();
    }

    @Test
    public void resultForTwoZerosShouldBeZero() {
        //Arrange
        int a = 0;
        int b = 0;
        //Act
        int gcd = IntMath.gcd(a, b);
        //Assert
        assertEquals(0, gcd);
    }

    @Test
    public void resultIsCorrect() {
        //Arrange
        int a = 2670;
        int b = 2015;
        //Act
        int gcd = IntMath.gcd(a, b);
        //Assert
        assertEquals(5, gcd);
    }
}

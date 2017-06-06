import com.google.common.math.IntMath;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.fail;

public class GcdMathTest {
    @Test
    public void bothArgumentAreNotNegative(){
        //setup
        int a = 125;
        int b = 25;
        //examine
        int gcd = IntMath.gcd(a,b);
        //verify
        assertEquals(25, gcd);
    }

    @Test(expected = IllegalArgumentException.class)
    public void firstArgumentIsNotNegativeAndSecondIsNegative(){
        //setup
        int a = 25;
        int b = -1;
        //examine
        int gcd = IntMath.gcd(a,b);
        //verify
        fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void bothArgumentsAreNegative(){
        //setup
        int a = -1;
        int b = -1;
        //examine
        int gcd = IntMath.gcd(a,b);
        //verify
        fail();
    }

    @Test(expected = IllegalArgumentException.class )
    public void firstArgumentIsNegativeAndSecondIsNotNegative(){
        //setup
        int a = -1;
        int b = 2;
        //examine
        int gcd = IntMath.gcd(a,b);
        //verify
        fail();
    }
}

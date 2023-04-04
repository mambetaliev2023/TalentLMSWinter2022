import com.digital.Calculator;
import com.digital.SomeClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.*;

import static org.testng.Assert.*;

public class CalculatorTest {

    SoftAssert softAssert = new SoftAssert();


    @Test
    public void addTwoNumsTest() {
        Assert.assertEquals(Calculator.add(2, 2), 4);
        Assert.assertEquals(Calculator.add(2, 2), 3);
        Assert.assertEquals(Calculator.add(2, 3), 5);

    }

    @Test
    public void testSoftAssert() {
        softAssert.assertEquals(Calculator.add(2, 2), 4);
        softAssert.assertEquals(Calculator.add(3, 3), 5);
        softAssert.assertEquals(Calculator.add(3, 3), 5);
        softAssert.assertEquals(Calculator.add(5, 2), 5);
        softAssert.assertEquals(Calculator.add(6, 2), 9);
        softAssert.assertAll();
    }

    @Test
    public void testAssertTrue() {
        assertTrue(SomeClass.isFunny(true));
        assertFalse(false);
    }

    @Test
    public void test123() {

        Object obj = new Object();
        obj = 1;

        assertNotNull(obj);


    }


}
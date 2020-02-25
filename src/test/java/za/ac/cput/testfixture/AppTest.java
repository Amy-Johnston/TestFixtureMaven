package za.ac.cput.testfixture;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    Customer cus1 = new Customer("Yusrah", "Soeker");
    Customer cus2 = new Customer("Amy", "Johnston");
    Customer cus3 = cus1;
    Customer cus4 = new Customer("William", "King");

    @Test
    public void equalityTest(){
        //System.out.println("\nEquality Test START");
//        Assert.assertEquals(cus1, cus3);
//        if(cus1.equals(cus2)) {
//            System.out.println("cus1 and cus2 are equal");
//        }
//        if(cus1.equals(cus3)) {
//            System.out.println("cus1 and cus3 are equal");
//        }
        Assert.assertTrue(cus1.equals(cus3));
        //Assert.assertTrue(cus1.hashCode() != cus4.hashCode() && cus1.hashCode() == cus3.hashCode());
    }

    @Test
    public void identityTest(){
        //System.out.println("\nIdentity Test START");
       /* if(cus1 == cus2) {
            System.out.println("Identity Test of cus1 and cus2 is complete! " + cus1 + " and " + cus2 +" refer to the same objects");
            return;
        }
        if(cus1 == cus3) {
            System.out.println("Identity Test of cus1 and cus3 is complete! " + cus1 + " and " + cus3 +" refer to the same objects");
            return;
        }*/
        Assert.assertTrue(cus1 == cus3);
    }

    @Test
    public void failingTest() {
        //Assert.fail("A failing test");
        Assert.assertTrue(cus1 == cus4);
    }

    @Test(timeout = 100)
    //@Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    public void timeoutTest() {
        // fails if execution time exceeds 100 milliseconds
        //System.out.println("\nTimeout test");
        //Assert.assertTrue (cus1 != cus2 && cus3 == cus1);
    }

    @Ignore //JUnit5 it is @Disabled
        @Test
        public void disablingTest() {
            Assert.assertTrue(cus1 == cus3);
        }
}

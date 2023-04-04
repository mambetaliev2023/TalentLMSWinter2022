package annotations;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.*;

    public class DemoClass {
        @BeforeMethod
        public void DemoBefore() {
            System.out.println("Demo Before");
        }
        @Test(groups = "group1")
        public void DemoTest1(){
            System.out.println("Demo Test1");
        }
        @Test (groups = "group2")
        public void DemoTest2(){
            System.out.println("Demo Test2");
            Assert.assertEquals(100,100);

        }
        @AfterMethod
        public void DemoAfter() {
            System.out.println("Demo After");
        }
        @BeforeClass
        public void DemoBeforeClass() {
            System.out.println("Demo Before Class");
        }
        @AfterClass
        public void AfterClass(){
            System.out.println("Demo After Class");
        }
        @BeforeTest
        public void BeforeTest(){
            System.out.println("Before Test");
        }
        @BeforeSuite
        public void BeforeSuit(){
            System.out.println("Before Suit");
        }
        @AfterSuite
        public void AfterSuit() {
            System.out.println("After Suit");

        }
        @BeforeGroups (groups = "group1")
        public void BeforeGroup(){
            System.out.println("Before Group1");
        }
        @AfterGroups (groups = "group2")
        public void AfterGroup() {
            System.out.println("After Group2");
        }
    }


package gun01;

import org.testng.annotations.*;

public class BaseClass {

    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod");
    }


}

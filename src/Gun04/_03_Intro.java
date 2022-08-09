package Gun04;

import org.testng.annotations.*;

public class _03_Intro {

/*
     @BeforeSuit
       @BeforeTest
         @BeforeGroup
           @BeforeClass
             @BeforeMethod
               @Test
               @Test
             @AfterMethod
           @AfterClass
        @AfterGroup
     @AfterTest
   @AfterSuit
    */

    @BeforeSuite
    void bSuit() {  System.out.println("Before Suite"); }

    @BeforeTest
    void bTest() {  System.out.println("Before Test"); }

    @BeforeGroups
    void bGroups() {  System.out.println("Before Groups"); }

    @BeforeClass
    void bClass() {  System.out.println("Before Class"); }

    @BeforeMethod
    void bMethod() {  System.out.println("Before Method"); }

    @Test
    void TestIntro1_1() {  System.out.println("Before Test Intro1 1"); }

    @Test
    void TestIntro1_2() {  System.out.println("Before Test Intro1 2");}

    @AfterMethod
    void aMethod() {  System.out.println("After Method");}

    @AfterClass
    void aClass() {  System.out.println("After Class");}

    @AfterGroups
    void aGroups() {  System.out.println("After Groups");}

    @AfterTest
    void aTest() {  System.out.println("After Test");}

    @AfterSuite
    void aSuite() {  System.out.println("After Suite");}

}

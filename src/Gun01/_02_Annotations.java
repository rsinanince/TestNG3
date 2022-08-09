package Gun01;

import org.testng.annotations.*;

public class _02_Annotations {

    /*
    Annotations :

    @BeforeClass -->  // Her class çalışıyorken önce burası çalışır
       @BeforeMetod --> // Her metoddan (test metod) önce burası çalışır
            @Test  --> testlerin çalıştığı metodlar
            @Test  --> testlerin çalıştığı metodlar
        @AfterMetod --> // Her metoddan (test metod) sonra burası çalışır
    @AfterClass --> // Her class çalışıyorken sonra burası çalışır

     */
    @BeforeClass
    void beforeClass(){ System.out.println("Before Class : Her class dan ÖNCE çalışacak "); }

    @BeforeMethod
    void beforeMethod(){ System.out.println("Before Method : Her test method dan ÖNCE çalışacak"); }

    @Test
    void test1(){ System.out.println("Test 1 çalıştı");    }
    @Test
    void test2(){ System.out.println("Test 2 çalıştı");    }

    @AfterMethod
    void afterMethod(){  System.out.println("After Method : Her test method dan SONRA çalışacak"); }

    @AfterClass
    void afterClass(){  System.out.println("After Class : Her class dan SONRA çalışacak");   }

}

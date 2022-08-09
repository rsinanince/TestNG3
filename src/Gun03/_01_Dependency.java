package Gun03;

/*
   interviewlarda sorulan bir konu : testlere öncelikleri nasıl verirsin ?
   priority, dependecy;   Nasıl kullanırsın ?
   1- priority =1 gibi sıralı rakamlar vererek bununla çalışma sırasını belirtirim.
   2- dependOnMethods : bununla kendinden önce hangi metod çalışması gerekiyor ise onu belirtirim.
 */

import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Dependency {

    @Test
    void startCar()
    {
        System.out.println("car started");
    }

    @Test (dependsOnMethods = {"startCar"})  // bu testin çalışması, startCar ın hatasız çalışmasına bağımlı
    void driveCar()
    {
        System.out.println("car drive");
        //Assert.fail();   //buraya SKIP durumunu görebilmek için koyduk
    }

    @Test (dependsOnMethods = {"startCar", "driveCar"})//bu testin çalışması için verilen 2 testin hatasız bitmesi lazım
    void parkCar()
    {
        System.out.println("car parked");
    }

    @Test (dependsOnMethods = {"parkCar"}, alwaysRun = true)
    void stopCar()
    {
        System.out.println("car stop");
    }

}

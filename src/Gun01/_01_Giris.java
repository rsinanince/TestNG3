package Gun01;

import org.testng.annotations.Test;

public class _01_Giris {


    @Test (priority = 1)  //annotation lar
    void webSitesiniAc(){
        System.out.println("Driver tanımlandı ve web sitesi açıldı");
    }

    @Test (priority = 2)
    void loginTestIsleminiYap(){
        System.out.println("Login test işlemleri yapıldı");
    }

    @Test (priority = 3)
    void driverKapat(){
        System.out.println("Driver kapatıldı ve çıkıldı");
    }

}

//sıra verilmezse alfabetik sıraya göre çalıştırır.

//yeşil tik, hatalı assertion yok demektir.
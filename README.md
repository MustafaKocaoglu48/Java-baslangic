# Java-baslangic
---
### Ekrana yazdırma
````
package A;
public class B{
public static void main(String[] args){
System.out.println("Hello World");
}
}

````
### Konsoldan veri alma
````java
public class veri_tipleri {
    public static void main(String[] args) {
        int sayi=12;
        String isim="Mustafa";
        char karakter='a';
       double ondaliklisayi=3.14;
       float ondaliklisayi2=3.4323f;
       boolean sonuc=true;
    }
    
}
````
### Konsoldan veri alma
````java
import java.util.Scanner;
public class Konsoldan_veri_alma {
    public static void main(String[] args) {
      
        Scanner m=new Scanner(System.in); //Scanner sınıfını tanımladık
        
        System.out.println("Lütfen bir sayı giriniz");
        int sayi=m.nextInt();//sayi değişkeni için konsoldan veri aldık
        System.out.println("Girilen sayi:"+sayi);
        
        System.out.println("Lütfen bir string giriniz.");
        String isim=m.next();//String değişkeni için konsoldan veri aldık
        System.out.println("Girilen string:"+isim);
       
        System.out.println("Lütfen bir karakter giriniz");
        char karakter=m.next().charAt(0);
        System.out.println("Girilen karakter:"+karakter);
   
        
        System.out.println("Lütfen bir ondalıklı sayı giriniz.");
        double ondalikli_sayi=m.nextDouble();
        System.out.println("Girilen ondalıklı sayi="+ondalikli_sayi);
    }
}

````
### Konsoldan alinan sayilari toplama
````java
import java.util.Scanner;
public class Konsoldan_veri_alma {
    public static void main(String[] args) {
      
        Scanner m=new Scanner(System.in); //Scanner sınıfını tanımladık
        
        System.out.println("Lütfen bir sayı giriniz");
        int sayi=m.nextInt();//sayi değişkeni için konsoldan veri aldık
        System.out.println("Girilen sayi:"+sayi);
        
        System.out.println("Lütfen bir string giriniz.");
        String isim=m.next();//String değişkeni için konsoldan veri aldık
        System.out.println("Girilen string:"+isim);
       
        System.out.println("Lütfen bir karakter giriniz");
        char karakter=m.next().charAt(0);
        System.out.println("Girilen karakter:"+karakter);
   
        
        System.out.println("Lütfen bir ondalıklı sayı giriniz.");
        double ondalikli_sayi=m.nextDouble();
        System.out.println("Girilen ondalıklı sayi="+ondalikli_sayi);
    }
}

````
### İki sayının toplamı
````java
public class sayi_toplama {
    public static void main(String[] args) {
        int a=5;
        int b=12;
        int c=a+b;
        System.out.println("Toplam:"+c);
  }    
}

````
### Vize ve final notuna göre ortalama hesaplayan program
````java
import java.util.Scanner;


public class ortalama_hesaplama {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        System.out.println("Lütfen vize notunuzu giriniz:");
        int vize=m.nextInt();
        
        System.out.println("Lütfen final notunuzu giriniz:");
        int final_notu=m.nextInt();
        
        double ortalama=(vize*0.4)+(final_notu*0.6);
        System.out.println("Genel not ortalamanız:"+ortalama);
    }
    
}

````
### Konsoldan girilen değere göre dairenin alanını ve çevresini döndüren program
````java

import java.util.Scanner;


public class Dairenin_alanını_cevresini_hesaplama {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        
        System.out.println("Lütfen yarıçapı giriniz:");
         int yaricap=m.nextInt();
         
         double alan=yaricap*yaricap*Math.PI;
         System.out.println("Dairenin alanı:"+alan);
       
         double cevre=2*Math.PI*yaricap;
         System.out.println("Dairenin çevresi"+cevre);
        
        
    }
    
}
````
### Girilen ürün fiyatına karşılık kdv fiyatını ve ürünün kdvli fiyatını geri döndüren program.
````java
import java.util.Scanner;


public class kdv_hesabi {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        double fiyat,kdvli_fiyati;
        double kdv=0.18;
        System.out.println("Lütfen ürünün fiyatını giriniz:");
      
         double urun_fiyati=m.nextDouble();
         kdvli_fiyati=urun_fiyati*kdv;
         double toplam_tutar=kdvli_fiyati+urun_fiyati;
         System.out.println("Girilen ürünün kdv tutarı: "+kdvli_fiyati+" Girilen ürünün kdv dahil fiyatı: "+toplam_tutar);
    }
    
}

````
### Hesap makinesi uygulaması
````java
public class hesap_makinesi{
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        System.out.println("Lütfen 2 sayı giriniz:");
        int sayi_1=m.nextInt();
        int sayi_2=m.nextInt();
        System.out.println("Lütfen bir işlem seçiniz:"
        +"1-TOPLAMA"
        +"2-ÇIKARMA"
        +"3-ÇARPMA"
        +"4-BÖLME");
        int islem=m.nextInt();
        if(islem==1){
            System.out.println("İşlem sonucu:"+(sayi_1+sayi_2));
        }else if(islem==2){
            System.out.println("İşlem sonucu:"+(sayi_1-sayi_2));
        }else if(islem==3){
            System.out.println("İşlem sonucu:"+(sayi_1*sayi_2));
        }else if(islem==4){
            System.out.println("İşlem sonucu:"+(sayi_1/sayi_2));
        }
        
    }
    
}

````

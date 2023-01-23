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
### While döngüsü ile adımı 10 kere ekrana yazdıran program
````
public class donguler {
public static void main(String[] args) {
    //Adımı 5 kere ekrana yazan program
    
   while(i<=5){
       System.out.println("Mustafa");
       i++;
              }
     }
   }
````
### do-while döngüsü ile adımızı 5 kere yazan program.
````
public class donguler {
public static void main(String[] args) {
    //Adımı 5 kere ekrana yazan program.
 int i=1;
    do{
     System.out.println("Mustafa");
     i++;
 }while(i<=5);

}
    
}

````
### for döngüsü ile adımızı 5 kere ekrana yazan program
````
public class donguler {
public static void main(String[] args) {
    //Adımı 5 kere ekrana yazan program.
 
    for(int i=0;i<5;i++){
        System.out.println("Mustafa");
    }
   
   
}
    
}
````
### break ve continue ifadeleri
````
public class donguler {
public static void main(String[] args) {
  //break =>Döngüyü durdurur 
  //continue =>Bir sonraki adıma geçer.
   
   for(int i=0;i<5;i++){
       System.out.println("Mustafa");
          break;
   }
  for(int i=0;i<5;i++){
       System.out.println("Mustafa");
         continue;
   }

}
    
}
````
### 1-100 arasında 7 ile bölünebilen sayıları ekrana yazan program
````
public class donguler {
public static void main(String[] args) {
      //1-100 arasındaki sayıların 7 ile bölünebilen sayıları ekran ayazan programı yazınız.
      for (int i = 1; i < 100; i++){
        if(i%7==0){
            System.out.println(i);
        }
    }
}
    
}
````
### 1-20 arasındaki sayıların toplamını bulan program
````
public class donguler {
public static void main(String[] args) {
     //1-20 arasındaki sayıların toplamını bulan programı yazınız.
     int toplam=0;
     for(int i=0;i<21;i++){
         toplam+=i;
     }System.out.println("1-20 arasındaki sayıların toplamı:"+toplam);
}
    
}
````
### Klavyeden girilen 20 adet sayının toplamını veren program
````
import java.util.Scanner;
public class donguler {
public static void main(String[] args) {
    //Klavyeden girilen 20 adet sayının toplamını veren program
   Scanner m=new Scanner(System.in);
   int toplam=0;
   for(int i=0;i<=20;i++){
       int a=m.nextInt();
       toplam+=a;
   }System.out.println("Girilen 20 sayının toplamı:"+toplam);

}
    
}
````
### Klavyeden girilen 10 adet sayının  çift olanları yazan ve kaç adet olduğunu bulan program
````import java.util.Scanner;
public class donguler {
public static void main(String[] args) {
    
   Scanner m=new Scanner(System.in);
   int sayac=0;
      for(int i=0;i<10;i++){
          int a=m.nextInt();
          if(a%2==0){
              System.out.println(a);
              sayac++;
          }
      }System.out.println("Girilen sayılar içinde toplam "+sayac+" tane çift sayı vardır");
}
    
}
````
### Klavyeden girilen 10 adet sayıdan en büyüğünü bulan programı yazınız.
````
import java.util.Scanner;
public class donguler {
public static void main(String[] args) {
   Scanner m=new Scanner(System.in);
      int enb=0;
      for(int i=0;i<10;i++){
          int a=m.nextInt();
          if(enb<=a){
              enb=a;
          }
      }System.out.println("En büyük sayı:"+enb);
   
}
    
}
````
### Klavyeden girilen 10 adet sayıdan en küçüğünü bulan ve ortalamasını yazdıran programı yazınız.
````
import java.util.Scanner;
public class donguler {
public static void main(String[] args) {
    
   Scanner m=new Scanner(System.in);
      int enk=Integer.MAX_VALUE;
      int toplam=0;
      for(int i=0;i<10;i++){
          int a=m.nextInt(); 
         toplam+=a;
          if(enk>=a){
              enk=a;
          }
      }double ortalama=(toplam/10.0);
      System.out.println("En küçük sayı:"+enk+" ve ortalama:"+ortalama);
   
}
    
}
````





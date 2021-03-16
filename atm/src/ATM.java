
import java.util.Scanner;


public class ATM {
    
  public void calis (hesap hesap){
  
  login login = new login();
  
  Scanner input = new Scanner (System.in);
  
      System.out.println("bankaya hoşgeldiniz");
      System.out.println("*********************");
      System.out.println("kullanici girisi");
      System.out.println("*********************");
  int giris_hakki = 3;
   while (true) {
       if (login.login(hesap)) {
           System.out.println("giriş basarili");
           break ;
       }
       else {
           System.out.println("giris basarisiz");
           giris_hakki--;
           System.out.println("kalan giris hakki    :   "+giris_hakki);
       }
       if (giris_hakki == 0) {
           System.out.println("giris hakkınız bitti");
           return ;
       }
   
   }
    
      System.out.println("*********************");
      String islemler = "1. bakiye görüntüle\n"
                        +"2. para yatırm \n"
                        +"3. para çekme \n"
                        +"çıkış için q ya basın\n" ;    
      System.out.println(islemler);
      System.out.println("********************* ");
              
              
       while (true){
           System.out.println("işlemi seçiniz");
           String islem = input.nextLine();
           if (islem.equals("q")) {
               break ;
           }
           else if (islem.equals("1")) {
               System.out.println("bakiyeniz    :   "+hesap.getbakiye());
           }
           else if (islem.equals("2")) {
               System.out.println("yatırmak istediğiniz tutarı yazın");
               int tutar = input.nextInt();
               input.nextLine();
               hesap.parayatir(tutar);
           }
           else if (islem.equals("3")) {
               System.out.println("çekmek istediğiniz tutarı yazın");
           int tutar = input.nextInt();
           input.nextLine();
           hesap.paracek(tutar);
           
           }
           else{
               System.out.println("geçersiz işlem") ;
           }
                   
           
       
       }       
  
  
  }  
    
}

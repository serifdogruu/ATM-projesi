
import java.util.Scanner;



public class login {
    
  public boolean login(hesap hesap){
  
  Scanner input = new Scanner (System.in);
  String kullanici_adi ;
  String parola ;
            System.out.print("kullanici adi   :   ");
            kullanici_adi = input.next();
            System.out.print("parola  :   ");
            parola = input.next();
            
            if (hesap.getkullanici_adi().equals(kullanici_adi) && hesap.getparola().equals(parola)) {
                return true ;
            }
            
            else{
            return false ;
            }
  }  
    
}

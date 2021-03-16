
public class hesap {
    
   private String kullanici_adi ;
   private String parola ;
   private int  bakiye ;

    public hesap(String kullanici_adi, String parola, int bakiye) {
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }
    
    public String getkullanici_adi (){
    return this.kullanici_adi  ;
    }
    public void setkullanici_adi (String kullanici_adi){
    this.kullanici_adi = kullanici_adi ;
    }
    
    public String getparola (){
    return this.parola ;
    }
    public void setparola (String parola){
    this.parola = parola ;
    }
    
    public int getbakiye (){
    return this.bakiye;
    }
    public void setbakiye (int bakiye){
    this.bakiye = bakiye ;
    }
    
    public void parayatir (int tutar){
    this.bakiye+=tutar ;
        System.out.println("yeni bakiyeniz  :   "+bakiye);
    }
    public void paracek (int tutar){
    
        if (tutar>bakiye) {
            System.out.println("yetersiz bakiye");
        }
        else {
        bakiye = bakiye - tutar ;
            System.out.println("yeni bakiye :   "+bakiye);
        }
    }
    
}

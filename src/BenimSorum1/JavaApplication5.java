
package BenimSorum1;



public class JavaApplication5 {
    public static void main(String[] args) {
        Otokiralama otk=new Otokiralama("afur rent a car",1,"elazığ");
        Otokiralama.Müşteri m=otk.new Müşteri(2010,"ford","ahmet","bozkurt",1,"kredi",100,2);
        System.out.println("M E K A N  B İ L G İ L E R İ");
        System.out.println("MEKAN ID: "+otk.mekanId+"   MEKAN İSİM:  "+m.pmekanİsim()+"    MEKAN KONUM: "+otk.mekanKonum);
        System.out.println("M Ü Ş T E R İ  B İ L G İ L E R İ");
        System.out.println("MÜŞTERİ NO:"+m.müşteriNo+"   ADI: "+m.ad+"   SOYADI:  "+m.soyad);
        System.out.println("A R A B A   B İ L G İ L E R İ");
        System.out.println("ARABA MODEL: "+m.arabaModel+"   ARABA MARKA: "+m.arabaMarka);
        System.out.println("Ö D E M E   B İ L G İ L E R İ");
        System.out.println("ÖDEME YÖNTEMİ: "+m.OdemeTipi+"   KİRALAMA GÜN SAYISI: "+m.gün+"   TOPLAM ÖDEME: "+m.kiralamabedeli());  
    }
    
}
class Otokiralama{
    private String mekanİsim;
    int mekanId;
    String mekanKonum;
    
    public Otokiralama(String mekanİsim,int mekanId,String mekanKonum){
        this.mekanİsim=mekanİsim;
        this.mekanId=mekanId;
        this.mekanKonum=mekanKonum;
    }
    abstract class Bilgi{
        int arabaModel;
        String arabaMarka;
        String ad;
        String soyad;
      
    public Bilgi(int arabaModel,String arabaMarka,String ad,String soyad){
        this.arabaMarka=arabaMarka;
        this.arabaModel=arabaModel;
        this.ad=ad;
        this.soyad=soyad;
    }
    public int pmekanId(){
        return mekanId; 
    }
                  
    public String pmekanİsim(){
        return mekanİsim; 
    }
    public String pmekanKonum(){
        return mekanKonum; 
    }
    }
    class Müşteri extends Bilgi{
        int müşteriNo;
        String OdemeTipi;
        int birimUcret;
        int gün;
     
        public Müşteri(int arabaModel, String arabaMarka,String ad,String soyad,int müşteriNo,String OdemeTipi,int birimUcret,int gün )
        {
            super(arabaModel,arabaMarka,ad,soyad);
            this.müşteriNo=müşteriNo;
            this.OdemeTipi=OdemeTipi;
            this.birimUcret=birimUcret;
            this.gün=gün;
        }
        public double kiralamabedeli(){
             double tpl;
             if(OdemeTipi=="nakit")   {
                 tpl= gün*birimUcret;
             }
             else{
                 tpl= (gün*birimUcret)+20;
             }
             return tpl;
        }
   
        
}
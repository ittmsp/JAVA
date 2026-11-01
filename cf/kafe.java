package cf;

public class kafe {
    public String tatli="";
    public String anaYemek="";
    public int tutar=0;
    public String yore="";
    public String soguk="";

    kafe(){
        System.out.println(" ");
    }

    kafe(String anaYemek, String tatli){
        this.anaYemek = anaYemek;
        this.tatli = tatli;
        
        
        System.out.println("\n kafe classı");
    }

    kafe(int tutar, String yore){
        this.tutar = tutar;
        this.yore = yore;
    }

    kafe(String soguk){
        this.soguk = soguk;
    }


    public int kafe(){
        System.out.println("kafe fonksiyonu\n");
        return 0;
    }
    public void Goster(){
        System.out.println("tatli " + this.tatli);
        System.out.println("anaYemek " + this.anaYemek);
        System.out.println("soguk " + this.soguk);
        System.out.println("tutar" + this.tutar + "\nyore " + this.yore);
        }
    }

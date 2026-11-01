package cf;

public class yiyecek extends kafe{
    yiyecek(){
        super("kagitKebabi", "samTatlisi");
        System.out.print("\nyiyecek classı\n");
    }   
    
    yiyecek(String anaYemek, String tatli){
        super(anaYemek, tatli);
        System.out.println("yiyecek classı");
    }

    public void yiyecekGoster(){
        super.Goster();
    }
}
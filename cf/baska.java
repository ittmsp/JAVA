package cf;

public class baska extends kafe{
    baska(){
        super(1000, "Hatay");
        System.out.println("\nbaska classı");
    }

    baska(int tutar, String yore){
        super(tutar, yore);
        System.out.println("baska classı");
    }
    
    public void baskaGoster(){
        super.Goster();
    }
}
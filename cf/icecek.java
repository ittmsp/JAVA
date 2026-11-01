package cf;

public class icecek extends kafe{
    icecek(){
        super(" limonata");
        System.out.println("\nicecek classı");
    }

    icecek(String sogukic){
        super(sogukic);
        System.out.println("icecek classı");
    }
    public void icecekGoster(){
        super.Goster();
    }
}
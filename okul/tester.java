package okul;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		Hayvan obj1=new Hayvan();
		//obj1.setDisDeger(1000);
		//System.out.println(obj1.getDisDeger());
		
		
		Hayvan obj2=new Hayvan(22,222,"iskenderun");
		obj2.Beslenme();
		
		
		
		System.out.println("-----------------------");
		Etcil obj3=new Etcil();
		//obj3.Beslenme();
		//obj2.Beslenme();
		//obj3.Goster();
		
		System.out.println("-----------------------");
		
		
		Kuslar obj4=new Kuslar(666,66,"ankara");
		obj2.CeneYapisi();obj3.CeneYapisi();obj4.CeneYapisi();
		
		
		
		
	}

	
	
	
	
	
	
	
}

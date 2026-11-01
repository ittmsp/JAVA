package babapro;

public enum gokhanhocaders61enum {

	//enum on atamalariGetir()
	Topla, Cikar, Bol, Carp;
	
	int deger=-1;
	
	
	public double Hesapla(double a, double b) {
		double sonuc=-1;
		
		switch (this) {
		case Topla:
			sonuc=a+b;
			break;
		case Cikar:
			sonuc=a-b;
			break;
		case Bol:
			sonuc=a/b;
			break;
		case Carp:
			sonuc=a*b;
			break;
		default:
			//println
			break;
		}
		
		
		//bu enumu gokhanhocaders61num.bol gibi kullanip class gibi kullanabilirim package icinde baska bir classta
		//gokhanhocaders61enum.Bol.Hesapla
		//gokhanhocaders61enum.Topla.deger
		
		return sonuc;
		
	}
	
	
	public int DegerGetir() {
		return this.deger;
	}
	
	
	
	
	
}




enum ParametreliEnum {
	ISTE("192.168.1.1"), GOkhanHoca("192.168.1.2"), Google("192.168.1.3");
	//PARAMETREDE TANIM YAPMAN LAZIM
	
	public String URL;
	
	//kurucusu yazilabilir
	ParametreliEnum(String URL){
		this.URL=URL;
	}
	
	public String URLGoster() {
		return this.URL;
		//disari aktarmak icin
	}
	
	
	
}
















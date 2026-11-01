package uyg63kalitim;

public class Hayvan {
	
public double boy=0,kilo=0;
public String yasadigiYer="";
private int disDeger=-1; //bu degere baska classta ulasamam
//getter ve setter fonksiyonlar bunlari disari aktarmaya yarar



	public int getDisDeger() {
		return this.disDeger; //bunun sayesinde obj olarak aktarabiliyorum disdegeri
	}


	public void setDisDeger(int disDeger) {
		this.disDeger=disDeger;
	}
	
	
	
	
	
	
	
	Hayvan(){
		System.out.println("hayvan classina ait parametresiz kurucu calisti");
	}
	
	Hayvan(double boy, double kilo, String yasadigiYer){
		this.boy=boy;
		this.kilo=kilo;
		this.yasadigiYer=yasadigiYer;
		System.out.println("hayvan classina ait parametresiz kurucu calisti"); 
		//kurucu overload edildi
	}
	
	
	public int Hayvan() {
		System.out.println("hayvan:hayvan fonksiyonu"); 
		return 0;
		//burası overload degildir
		//fonksiyonun kurucu fonksiyon olması icin class ismi veya yapi ismiyle ayni olmalidir. 
		//bu sadece yeni bir fonksiyon tanimidir.
		//kurucuyu asiri yukleyin dendigi zaman bunu yaparsan hata yaparsin.
	}
	
	
	
	public void Beslenme() {
		System.out.println("Hayvan.Beslenme: Her hayvan beslenir");
	}
	
	public void Solunum() {
		System.out.println("Hayvan.Solunum: Her hayvan nefes alır");
	}
	
	public static void YasadigiYer() {
		System.out.println("Hayvan: Static Yasadigi Yer");
	}
	
	public void CeneYapisi() {
		System.out.println("Hayvan.CeneYapisi: Her hayvanda cene var");
	}
	
	public void Goster() {
		System.out.println("Hayvan.boy="+this.boy+"--- kilo="+this.kilo+"--- YasadigiYer"+this.yasadigiYer);
	}
	
	
	
	
	
}






class Etcil extends Hayvan{
	
	Etcil(){
		super(55,555,"Hatay");
		System.out.println("etcil classina ait parametresiz kurucu calisti"); 
	}
	
	
	Etcil(double boy, double kilo, String yasadigiYer){
		System.out.println("etcil classina ait parametresiz kurucu calisti"); 
		//bunu kurmazsan kuslardaki super calismaz !!!!!!!!!!!!!!!!!!!!!!!!
		//bunu kurmazsan kuslardaki super calismaz !!!!!!!!!!!!!!!!!!!!!!!!
		//bunu kurmazsan kuslardaki super calismaz !!!!!!!!!!!!!!!!!!!!!!!!
		//bunu kurmazsan kuslardaki super calismaz !!!!!!!!!!!!!!!!!!!!!!!!
		//bunu kurmazsan kuslardaki super calismaz !!!!!!!!!!!!!!!!!!!!!!!!
		
		
		//basamak basamak bir ustteki parametreyi aldigi icin burada acmazsan alttaki super hata verir tanimsiz kalir.
		
	}
	
	
	public void Beslenme() {
		System.out.println("Etcil.Beslenme: etciller etle beslenir"); //yukaridakini alip buraya extended class a koydugun zaman override atmis oluyorsun
		
	}
	
	public void CeneYapisi() {
		System.out.println("Etcil.CeneYapisi: kesici disler daha gelismistir"); 
		
	}
	
	//public static void YasadigiYer
	public static void YasadigiYer() {
		System.out.println("Etcil: Static Yasadigi Yer"); //static varsa her zaman dikkat et, static tanımı ram uzerinde sadece 1 defa olusturulur.
		//hata vermedi cunku yeni bir fonksiyon olusturuyor.
		//bu override degildir, yeni bir fonksiyon olusturur.
	}
	
	
	public void EtcilGoster() {
		super.Goster();
		//System.out.println("Etcil.boy="+this.boy+"--- etcil.kilo="+this.kilo+"--- etcil.YasadigiYer"+this.yasadigiYer);
		//ustteki gosteri buna cevirir super kullanmak daha kisa
	}
	
	
	
	
	
}
















class Otcul extends Hayvan{
	
	Otcul(){
		super(55,555,"Hatay");
		System.out.println("otcul classina ait parametresiz kurucu calisti"); 
	}
	
	
	Otcul(double boy, double kilo,String YasadigiYer){
		super();
		System.out.println("otcul classina ait parametresiz kurucu calisti"); 
	}

	
	
	
	
	
	public void Beslenme() {
		System.out.println("otcul.Beslenme: otcullar otla beslenir"); //yukaridakini alip buraya extended class a koydugun zaman override atmis oluyorsun
		
	}
	
	public void CeneYapisi() {
		System.out.println("otcul.CeneYapisi: ezici disler daha gelismistir"); 
		
	}
	
	//public static void YasadigiYer
	public static void YasadigiYer() {
		System.out.println("Otcul: Static Yasadigi Yer"); //static varsa her zaman dikkat et, static tanımı ram uzerinde sadece 1 defa olusturulur.
		//hata vermedi cunku yeni bir fonksiyon olusturuyor.
		//bu override degildir, yeni bir fonksiyon olusturur.
	}
	
	
	public void OtculGoster() {
		super.Goster();
		//System.out.println("Etcil.boy="+this.boy+"--- etcil.kilo="+this.kilo+"--- etcil.YasadigiYer"+this.yasadigiYer);
		//ustteki gosteri buna cevirir super kullanmak daha kisa
	}
	
	
	
	
	
}























class Kuslar extends Etcil{
	
	Kuslar(){
		super(55,555,"Hatay");
		System.out.println("Kuslar classina ait parametresiz kurucu calisti"); 
	}
	
	
	Kuslar(double boy, double kilo,String YasadigiYer){
		super();
		System.out.println("Kuslar classina ait parametresiz kurucu calisti"); 
	}

	
	
	
	
	
	public void Beslenme() {
		System.out.println("Kuslar.Beslenme: solucanla"); //yukaridakini alip buraya extended class a koydugun zaman override atmis oluyorsun
		
	}
	
	public void CeneYapisi() {
		System.out.println("Kuslar.CeneYapisi: gaga"); 
		
	}
	
	//public static void YasadigiYer
	public static void YasadigiYer() {
		System.out.println("Kuslar: Static Yasadigi Yer"); //static varsa her zaman dikkat et, static tanımı ram uzerinde sadece 1 defa olusturulur.
		//hata vermedi cunku yeni bir fonksiyon olusturuyor.
		//bu override degildir, yeni bir fonksiyon olusturur.
	}
	
	
	public void KuslarGoster() {
		super.Goster();
		//System.out.println("Etcil.boy="+this.boy+"--- etcil.kilo="+this.kilo+"--- etcil.YasadigiYer"+this.yasadigiYer);
		//ustteki gosteri buna cevirir super kullanmak daha kisa
	}
	
	
	
	
	
}









class BalikcilKuslar extends Kuslar{} //bu sekilde ilerletip daha spesifik ve detayli acabilirsin.






public class Client {

	public static void main(String[] args) {
		//Flaeche kuchl = new Wohnflaeche();
		//System.out.println(kuchl.getQuadratmeter());

		Wohnflaeche w1=new Wohnflaeche("OG", 1, true);
		w1.add(new Abstellflaeche("Kuchl", false));
		w1.add(new Abstellflaeche("Wohnzimmer", true));
		
		Wohnflaeche w2=new Wohnflaeche("2.OG", 2, false);
		w2.add(new Abstellflaeche("Buero1", false));
		w2.add(new Abstellflaeche("Buero2", false));
		
		Wohnflaeche w3=new Wohnflaeche("Tulfes", 2, true);
		w3.add(new Abstellflaeche("Schlafzimmer", true));
		
		Wohnflaeche vermieterHaus = new Wohnflaeche("Hall", 3, true);
		vermieterHaus.add(w1);
		vermieterHaus.add(w2);
		
		vermieterHaus.printen("");
	}

}

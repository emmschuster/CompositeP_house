
public class Abstellflaeche extends Flaeche{

	public Abstellflaeche(String ort, boolean schlafen) {
		super(ort, schlafen);
	}

	public int getQuadratmeter() {
		return 1;
	}

	@Override
	public void printen(String m) {
		System.out.println(m + getOrt()+ ". Schlafbar?: " + isSchlafen());
	}
	
}

public abstract class Flaeche {
	public abstract int getQuadratmeter();
	
	public abstract void printen(String m);
	
	private String ort;
	private boolean schlafen;	//kann man dort schlafen?

	public Flaeche(String ort, boolean schlafen) {
		this.ort=ort;
		this.schlafen=schlafen;
	}
	
	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public boolean isSchlafen() {
		return schlafen;
	}

	public void setSchlafen(boolean schlafen) {
		this.schlafen = schlafen;
	}

}

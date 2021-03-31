import java.util.*;

public class Wohnflaeche extends Flaeche{

	/*public Wohnflaeche(String ort, boolean schlafen) {
		super(ort, schlafen);
		// TODO Auto-generated constructor stub
	}*/

	private List<Flaeche> f = new ArrayList<Flaeche>();

	@Override
	public int getQuadratmeter() {
		int sum=1;
		for (Flaeche fla : f) {
			sum+=fla.getQuadratmeter();
		}
		return sum;
	}

	@Override
	public void printen(String m) {
		 System.out.println(m + "Wohnflaeche " + getOrt() + " (" + getStockwerk() + "). Schlafbar?: "  + isSchlafen());
	        for (Flaeche fla : f) {
	            fla.printen(m + "      ");//Einrückung
	        }
	}
	
private int stockwerk;
    
    public int getStockwerk() {
        return stockwerk;
    }
    public void setStockwerk(int s) {
        this.stockwerk = s;
    }

    public Wohnflaeche(String ort, int stockwerk, boolean schlafen) {
        super(ort, schlafen);
        this.stockwerk = stockwerk;
    }


    public void add(Flaeche ff) {
        f.add(ff);
    }

    public void remove(Flaeche ff) {
        f.remove(ff);
    }

    public Flaeche getFlaeche(int index) {
        return f.get(index);
    }

}
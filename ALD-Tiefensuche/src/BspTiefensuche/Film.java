package BspTiefensuche;

public class Film implements Comparable<Film> {

	private final String titel;
	
	private final double länge;

	public Film(String titel, double länge) {
		this.titel = titel;
		this.länge = länge;
	}

	public String getTitel() {
		return titel;
	}

	public double getLänge() {
		return länge;
	}

	@Override
	public String toString() {
		return titel + " (Länge: " + länge + ")";
	}

	@Override
	public int compareTo(Film arg0) {

		if (this.länge > arg0.getLänge())
			return 1;
		else if (this.länge < arg0.getLänge())
			return -1;
		return 0;

	}

}

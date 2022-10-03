package greenest;

public class Height {

	private final int centimeter;

	public Height(int centimeter) {
		this.centimeter = centimeter;
	}

	public double inMeter() {
		return centimeter/100.0;
	}
}

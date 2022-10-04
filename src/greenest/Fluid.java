package greenest;

public enum Fluid {
	TAPWATER("kranvatten"), MINERALWATER("mineralvatten"), PROTEINDRINK("proteindryck");

	public final String value;

	Fluid(String value) {
		this.value = value;
	}
}

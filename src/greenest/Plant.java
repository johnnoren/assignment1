package greenest;

public abstract class Plant implements Drinker {
	private final String name; // Inkapsling

	public String getName() { // Inkapsling
		return name;
	}

	private final Height height;

	public Height getHeight() {
		return height;
	}

	protected Plant(String name, Height height) {
		this.name = name;
		this.height = height;
	}
}

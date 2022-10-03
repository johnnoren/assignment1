package greenest;

public abstract class Plant implements Drinker{
	protected final String name;
	protected final Height height;
	public boolean isNamed(String name) {
		return this.name.equals(name);
	}

	protected Plant(String name, Height height) {
		this.name = name;
		this.height = height;
	}
}

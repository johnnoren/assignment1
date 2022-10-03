package greenest;

public class Carnivorous extends Plant {

	public Carnivorous(String name, Height height) {
		super(name, height);
	}

	@Override
	public Fluid getFluidType() {
		return Fluid.PROTEINDRINK;
	}

	@Override
	public Double getFluidRequirement() {
		return 0.1 + (0.2 * height.inMeter());
	}
}

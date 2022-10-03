package greenest;

public class Cactus extends Plant {

	public Cactus(String name, Height height) {
		super(name, height);
	}

	@Override
	public Fluid getFluidType() {
		return Fluid.MINERALWATER;
	}

	@Override
	public Double getFluidRequirement() {
		return 0.02;
	}
}

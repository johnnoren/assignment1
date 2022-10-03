package greenest;

public class Palm extends Plant {

	public
	Palm(String name, Height height) {
		super(name, height);
	}

	@Override
	public Fluid getFluidType() {
		return Fluid.TAPWATER;
	}

	@Override
	public Double getFluidRequirement() {
		return 0.5 * height.inMeter();
	}
}
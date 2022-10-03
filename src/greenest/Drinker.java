package greenest;

import javax.swing.*;

public interface Drinker {

	Fluid getFluidType();

	Double getFluidRequirement();

	default void showFluidRequirement() {
		JOptionPane.showMessageDialog(null, "Den här växten behöver " + getFluidRequirement() + " liter " + getFluidType().value + " per dag.", null,JOptionPane.PLAIN_MESSAGE);
	};
}

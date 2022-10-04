package greenest;

import javax.swing.*;
import java.text.DecimalFormat;

public interface Drinker {

	Fluid getFluidType();

	Double getFluidRequirement();

	default void showFluidRequirement() {
		DecimalFormat decimalFormat = new DecimalFormat("####0.00");
		JOptionPane.showMessageDialog(null, "Den här växten behöver " + decimalFormat.format(getFluidRequirement()) +
				" " + "liter " + getFluidType().value + " per dag.", null, JOptionPane.PLAIN_MESSAGE);
	}
}
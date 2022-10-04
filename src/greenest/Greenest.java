package greenest;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Greenest {
	public static void main(String[] args) {
		new Greenest().run();
	}

	private void run() {

		List<Plant> guestList = new ArrayList<>();
		guestList.add(new Cactus("Igge", new Height(20)));
		guestList.add(new Palm("Laura", new Height(500)));
		guestList.add(new Carnivorous("Meatloaf", new Height(70)));
		guestList.add(new Palm("Putte", new Height(100)));

		BiPredicate<Plant, String> isNamed = (plant, name) -> plant.getName()
																   .equals(name); // Polymorfism (plant.getName)

		Predicate<String> isGuest = (name) -> guestList.stream()
													   .anyMatch(plant -> isNamed.test(plant, name));

		var userInput = "";
		while (!isGuest.test(userInput)) {
			userInput = JOptionPane.showInputDialog(null, "Vilken växt ska få vätska?", null,
					JOptionPane.PLAIN_MESSAGE);
			if (!isGuest.test(userInput)) {
				JOptionPane.showMessageDialog(null, "Namnet kunde inte hittas.", null, JOptionPane.PLAIN_MESSAGE);
			}
		}
		final String name = userInput;

		guestList.stream()
				 .filter(plant -> isNamed.test(plant, name))
				 .forEach(Plant::showFluidRequirement); // Polymorfism
	}
}

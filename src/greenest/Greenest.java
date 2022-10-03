package greenest;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
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

		Predicate<String> isGuest = (name) -> guestList.stream().anyMatch(plant -> plant.isNamed(name)); // Polymorfism

		var userInput = "";
		while (!isGuest.test(userInput)) {
			userInput = JOptionPane.showInputDialog(null,"Vilken växt ska få vätska?", null,JOptionPane.PLAIN_MESSAGE);
			if (!isGuest.test(userInput)) {
				JOptionPane.showMessageDialog(null, "Namnet finns inte på gästlistan.", null,JOptionPane.PLAIN_MESSAGE);
			}
		}
		final String name = userInput;

		guestList.stream()
				.filter(plant -> plant.isNamed(name))
				.forEach(Plant::showFluidRequirement);

	}

}

package greenest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarnivorousTest {

	@Test
	void getFluidRequirement() {
		var sut = new Carnivorous("Köttis", new Height(30));
		assert sut.getFluidRequirement().equals(0.16);

		sut = new Carnivorous("Bitis", new Height(140));
		assert sut.getFluidRequirement().equals(0.38);
	}
}
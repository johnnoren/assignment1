package greenest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTest {

	@Test
	void getFluidRequirement() {
		var sut = new Palm("Laura", new Height(500));
		assert sut.getFluidRequirement().equals(2.5);

		sut = new Palm("Bertil", new Height(200));
		assert sut.getFluidRequirement().equals(1.0);
	}
}
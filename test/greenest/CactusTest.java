package greenest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CactusTest {

	@Test
	void getFluidRequirement() {
		var sut = new Cactus("Piggur", new Height(325));
		assert sut.getFluidRequirement().equals(0.02);

		sut = new Cactus("Taggis", new Height(20));
		assert sut.getFluidRequirement().equals(0.02);
	}
}
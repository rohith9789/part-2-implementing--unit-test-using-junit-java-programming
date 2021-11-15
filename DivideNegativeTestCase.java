package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivideNegativeTestCase {

	@Test
	void test() {
		JunitTesting Negativetest =new JunitTesting();
		double output1= Negativetest.divide(24, 4);
		assertEquals(6, output1);
	}

}

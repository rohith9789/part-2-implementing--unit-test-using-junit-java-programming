package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	public  void test() {
		JunitTesting test= new JunitTesting();
		int output = test.square(9);
		assertEquals(81, output);
	}

}

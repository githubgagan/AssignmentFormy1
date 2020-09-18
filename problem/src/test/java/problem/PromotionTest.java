package problem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PromotionTest {

	static Promotion promotion;

	@BeforeAll
	static void setup() {
		promotion = new Promotion();

	}

	@Test
	public void scenario1() {

		String[] source = { "A", "B", "C" };

		assertEquals(100, promotion.getPromotionValue(source));

	}

	@Test
	public void scenario2() {

		String[] source = { "A","A","A","A","A", "B","B","B","B","B", "C" };

		assertEquals(370, promotion.getPromotionValue(source));

	}
	
	
	@Test
	public void scenario3() {

		String[] source = { "A","A","A", "B","B","B","B","B","C", "D"};

		assertEquals(285, promotion.getPromotionValue(source));

	}

}

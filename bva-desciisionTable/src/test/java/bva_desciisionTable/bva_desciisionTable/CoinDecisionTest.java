package bva_desciisionTable.bva_desciisionTable;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CoinDecisionTest  {
	
	CoinDecision c = new CoinDecision();

	@Test
	public void test1_R1R2R3R4() {
		String result=c.CoinDecision("H","H","H","T");
		 assertEquals("Positive", result);
		
	}
	
	@Test
	public void test2_R5R6() { 
		String result=c.CoinDecision("H","T","H","T");
		assertEquals("Positive", result);
		
	}
	@Test
	public void test3_R7() { 
		String result=c.CoinDecision("H","T","T","H");
		 assertEquals("Positive", result);
		
	}
	
	@Test
	public void test4_R8() { 
		String result=c.CoinDecision("H","T","T","T");
		 assertEquals("Negative", result);
		
	}
	@Test
	public void test5_R15R16() { 
		String result=c.CoinDecision("T","T","T","H");
		 assertEquals("Negative", result);
		
	}
 
}

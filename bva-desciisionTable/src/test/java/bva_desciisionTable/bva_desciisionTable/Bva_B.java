package bva_desciisionTable.bva_desciisionTable;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class Bva_B {

	 @Test
//	(Min-1)
	    void testAIsZero_shouldThrowException() {
	        // arrange
	        int a = 50;   // ערך לא חוקי
	        int b = 0;
	        int c = 50;
	        int d = 50;
	        int e = 50;

	        // act + assert
	        assertThrows(IllegalArgumentException.class, () -> {
	        	MinCalculator.findMin(a, b, c, d, e);
	        });
	 }
	
	   @Test
//(Max+1)
	    void testAIs1001_shouldThrowException() {
	        // arrange
	        int a = 50;   // ערך לא חוקי
	        int b = 1001;
	        int c = 50;
	        int d = 50;
	        int e = 50;

	        // act + assert
	        assertThrows(IllegalArgumentException.class, () -> {
	        	MinCalculator.findMin(a, b, c, d, e);
	        });
	    }

	 @Test
//(Min)
	    void testAIsOne_shouldReturnMinimum() {
	        // arrange
	        int a = 50;    // ערך גבול תקין
	        int b = 1;
	        int c = 50;
	        int d = 50;
	        int e = 50;

	        // act
	        int result = MinCalculator.findMin(a, b, c, d, e);

	        // assert
	        assertEquals(1, result);   // 1 הוא הערך המינימלי
	    }
	 
	 
	@Test
//(Min+1)
  void testAIsOne_shouldReturnMinimumAdd1() {
      // arrange
      int a = 50;    // ערך גבול תקין
      int b = 2;
      int c = 50;
      int d = 50;
      int e = 50;

      // act
      int result = MinCalculator.findMin(a, b, c, d, e);

      // assert
      assertEquals(2, result); 
  }
//
	

	@Test
////(Max)
  void testAIsOne_shouldReturnMAX() {
      // arrange
      int a = 50;    // ערך גבול תקין
      int b = 1000;
      int c = 50;
      int d = 50;
      int e = 50;

      // act
      int result = MinCalculator.findMin(a, b, c, d, e);

      // assert
      assertEquals(50, result); 
  }
//
	
	
	
	@Test
////(Max-1)
void testAIsOne_shouldReturnMaxminus1() {
    // arrange
    int a = 50;    // ערך גבול תקין
    int b = 999;
    int c = 50;
    int d = 50;
    int e = 50;

    // act
    int result = MinCalculator.findMin(a, b, c, d, e);

    // assert
    assertEquals(50, result); 
}

	
	
	
	@Test
////(nominal)
  void testAIsOne_shouldReturnnominal() {
      // arrange
      int a = 50;    // ערך גבול תקין
      int b = 500;
      int c = 50;
      int d = 50;
      int e = 50;

      // act
      int result = MinCalculator.findMin(a, b, c, d, e);

      // assert
      assertEquals(50, result); 
  }

}

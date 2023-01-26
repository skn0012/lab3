import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testBugReverseInPlace() {
    int[] input = {0, 1};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{1, 0}, input);
  }

  @Test 
  public void testBugReversed() {
    int[] input = {0, 1};
    assertArrayEquals(new int[]{1, 0}, ArrayExamples.reversed(input));
  }
}

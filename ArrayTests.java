import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {

  
  private static final double DELTA = 1e-15;
	
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

  @Test
  public void testBugAverageWithoutLowest() {
    double[] input = {1.0, 1.0, 3.0, 4.0, 5.0};
    double output = ArrayExamples.averageWithoutLowest(input);
    assertEquals(3.25, output, DELTA);
  }
}

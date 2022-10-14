import static org.junit.Assert.*;

import javax.security.auth.kerberos.DelegationPermission;

import org.junit.*;

public class ArrayTests {

  //ReverseInPlace 
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
  @Test 
  public void testReverseInPlaceWithValues(){
    int[] input = {5,6,7,8};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{8,7,6,5}, input);
  }

 
  //Reverse Methods
  //checking for empty arrays
  @Test
  public void test1Reversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  //checking for arrays with vals
  @Test
  public void testReversed() {
    int[] input1 = {5,6,7};
    assertArrayEquals(new int[]{7,6,5}, ArrayExamples.reversed(input1));
  }

  @Test 
  public void testAvgWithoutLowest(){
    double[] input = {4.0,1.0,1.0,1.0}; 
    assertEquals(2, ArrayExamples.averageWithoutLowest(input), 0.1);
  }

}

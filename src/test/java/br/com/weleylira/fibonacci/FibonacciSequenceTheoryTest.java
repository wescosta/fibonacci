package br.com.weleylira.fibonacci;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class FibonacciSequenceTheoryTest {
	
	private List<Integer> fibonacciSequence = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34);
	
	@DataPoints
	public static int[] parameters = new int []{2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	@DataPoints
	public static FibonacciSequenceCalculator[] fibonacci = new FibonacciSequenceCalculator[]{new SimpleFibonacciSequenceCalculator(), new ClearerFibonacciSequenceCalculator(), new RecursiveFibonacciSequenceCalculator()}; 
		
	@Theory
	public void shouldReturnAFibonacciSequenceWithUpToXNumbers(int length, FibonacciSequenceCalculator fibonacci) {
		assertTrue("By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.", length >= 2);
		assertTrue("For this test the length of the required sequence must be more than 0 and less or equal than the predefined sequence size to avoid array index out of bounds exception.", length > 0 && length <= fibonacciSequence.size());
		
		List<Integer> sequence = fibonacci.sequenceWith(length);
		
		assertThat("The sequence must have exactly the length informed and must be a valid fibonacci sequence", sequence, is(fibonacciSequence.subList(0, length)));
		
		System.out.println(sequence);
	}

}
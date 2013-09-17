package br.com.weleylira.fibonacci;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecursiveFibonacciSequenceCalculator implements FibonacciSequenceCalculator {

	public List<Integer> sequenceWith(int length) {
		List<Integer> sequence = new ArrayList<Integer>();
		
		while (length >= 1)
			sequence.add(fib(--length));
		
		Collections.sort(sequence);
		
		return sequence;
	}

	private int fib(int n) {
		if (n == 0) return 0;
		if (n == 1 || n == 2) return 1;
		
		return fib(n -1) + fib(n -2);
	}

}
package br.com.weleylira.fibonacci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SimpleFibonacciSequenceCalculator implements FibonacciSequenceCalculator {

	public List<Integer> sequenceWith(int length) {
		if (length == 0) return Collections.emptyList();

		List<Integer> sequence = new ArrayList<Integer>(Arrays.asList(new Integer[]{0, 1}));

		int f1 = 0;
		int f2 = 1;
		
		while (sequence.size() < length) {
			int next = f1 + f2;
			sequence.add(next);
			
			f1 = f2;
			f2 = next;
		}

		return sequence;
	}

}
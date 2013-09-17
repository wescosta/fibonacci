package br.com.weleylira.fibonacci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClearerFibonacciSequenceCalculator implements FibonacciSequenceCalculator {

	public List<Integer> sequenceWith(int length) {
		List<Integer> sequence = new ArrayList<Integer>(Arrays.asList(new Integer[]{0, 1}));
		
		if (length <= 0) return sequence;

		while (sequence.size() < length) {
			int index = sequence.size();
			int next = sequence.get(index -1) + sequence.get(index -2);
			
			sequence.add(next);
		}

		return sequence;
	}

}
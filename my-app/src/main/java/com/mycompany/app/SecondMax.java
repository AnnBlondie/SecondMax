package com.mycompany.app;

import com.google.common.base.Preconditions;

public class SecondMax {

	public static int getSecondMax(int[] numbers) {
		Preconditions.checkNotNull(numbers, "array is empty");
		Preconditions.checkArgument(numbers.length != 0, "array is empty");
		Preconditions.checkArgument(numbers.length != 1, "array is too small");
		Preconditions.checkArgument(hasDifferentValues(numbers),
				"all elements are equal");

		int max = numbers[0];
		int secondMax;

		int i = 0;
		while (numbers[0] == numbers[i]) {
			i++;
		}
		if (numbers[0] > numbers[i]) {
			secondMax = numbers[i];
		} else {
			max = numbers[i];
			secondMax = numbers[0];
		}
		i++;

		while (i < numbers.length) {
			if (numbers[i] > max) {
				secondMax = max;
				max = numbers[i];
			} else if (numbers[i] < max && numbers[i] > secondMax) {
				secondMax = numbers[i];
			}
			i++;
		}

		return secondMax;
	}

	public static boolean hasDifferentValues(int[] array) {
		boolean allEqual = true;
		int first = array[0];
		for (int i = 1; i < array.length; i++) {
			allEqual = allEqual && (first == array[i]);
		}
		return !allEqual;
	}
}
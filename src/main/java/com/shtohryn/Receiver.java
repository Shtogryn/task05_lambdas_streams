package com.shtohryn;

import java.util.*;
import java.util.function.Function;

public class Receiver {
    static Scanner scanner = new Scanner(System.in);

    int numbersComparator(int n1, int n2) {
        Numbers<Integer> res = (a, b) -> a > b ? a : b;
        return res.execute(n1, n2);
    }

    int numbersAverage(int n1, int n2) {
        Numbers<Integer> res = (x, y) -> (x + y) / 2;
        return res.execute(n1, n2);
    }

    public void taskWithArray() {
        List list = new ArrayList<>();
        Random random = new Random();
        System.out.println("Enter the length of array");
        int limit = scanner.nextInt();
        System.out.println("Low element- ");
        double low = scanner.nextInt();
        System.out.println("High element- ");
        double high = scanner.nextInt();
        double[] array = random.doubles(limit, low, high).toArray();
        list.add(array);
        Function<double[], String> coverter = value -> Arrays.toString(value);
        String str = coverter.apply(array);
        System.out.println("Random array with double's elements: ");
        Arrays.stream(new String[]{str}).forEach(System.out::print);
        System.out.println();
        OptionalDouble maxElement = Arrays.stream(array).reduce(Double::max);
        OptionalDouble minElement = Arrays.stream(array).reduce(Double::min);
        OptionalDouble averageElement = Arrays.stream(array).average();
        OptionalDouble sumOfElements = Arrays.stream(array).reduce(Double::sum);
        double max = maxElement.getAsDouble();
        double min = minElement.getAsDouble();
        double averange = averageElement.getAsDouble();
        double sum = sumOfElements.getAsDouble();
        Arrays.sort(array);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > averange) {
                count++;
            }
        }
        System.out.println("max element- " + max);
        System.out.println("min element- " + min);
        System.out.println("average element- " + averange);
        System.out.println("sum of all element's- " + sum);
        System.out.println("Total numbers greater than " + averange + " - " + count);


    }
}

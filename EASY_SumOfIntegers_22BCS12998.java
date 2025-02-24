import java.util.*;

public class SumOfIntegers {
    
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;  
        }
        return sum;
    }

    public static List<Integer> parseStringsToIntegers(List<String> stringNumbers) {
        List<Integer> integers = new ArrayList<>();
        for (String str : stringNumbers) {
          
            integers.add(Integer.parseInt(str)); 
        }
        return integers;
    }

    public static void main(String[] args) {
       
        List<String> stringNumbers = Arrays.asList("10", "20", "30", "40", "50");

        
        List<Integer> numbers = parseStringsToIntegers(stringNumbers);

        int sum = calculateSum(numbers);

        System.out.println("Sum of the integers: " + sum);
    }
}

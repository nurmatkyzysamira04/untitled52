import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 23, 6, 0, 12, 123, 6, 5, 1, 99, 3, 4, 1, 2);
        System.out.println(list.stream().mapToInt(x -> x).sum());
        System.out.println(list.stream().mapToInt(x -> x).sum() / list.size());
        Set<Integer>set = new HashSet<>();
        System.out.println(list.stream().filter(x -> !set.add(x)).toList());
        
    }
}
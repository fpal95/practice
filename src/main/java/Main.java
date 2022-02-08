import java.util.Arrays;
import java.util.List;
import logic.BubbleSort;

public class Main {
    public static void main(String[] args) {
        BubbleSort<String> bubbleSort = new BubbleSort<>();
        List<String> list = bubbleSort.sort(Arrays.asList(args));
        System.out.println("Hello World! - result: " + list);
    }
}

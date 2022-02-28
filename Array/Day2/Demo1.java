import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static int numIdenticalPairs(int[] num) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : num) {
            if (map.containsKey(i)) {
                map.replace(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int n = entry.getValue();
            n = (n * (n - 1)) / 2;
            if (n > 0)
                count = count + n;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 1, 1, 3 };
        System.out.println(numIdenticalPairs(a));
    }
}

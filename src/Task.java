import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;

public class Task {
    private String fisier;

    public Task(String fisier) {
        this.fisier = fisier;
    }

    public void solve() throws FileNotFoundException {
        Data date = new Data(fisier);
        Input input;
        input = date.cindata();
        int m = input.getM();
        List<Integer> numbers = input.getArray();
        int n = numbers.size();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            map.put(numbers.get(i), i);
        }
        for (int i = 0; i < n; i++) {
            int x = numbers.get(i) - m;
            if (map.get(x) != null) {
                System.out.println("indexul: " + i + " si indexul: " + map.get(x) + " cu valorile: " + numbers.get(i) + " si " + x);
            }
        }
    }
}

import java.io.FileNotFoundException;
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
        List<Integer> array = input.getArray();
    
    }
}

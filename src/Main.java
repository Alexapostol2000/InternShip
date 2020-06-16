import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Task task = new Task(args[0]);
        task.solve();
    }
}
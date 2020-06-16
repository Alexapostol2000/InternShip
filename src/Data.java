import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Data {
    public String fisier;

    public Data(String fisier) {
        this.fisier = fisier;
    }

    public Input cindata() throws FileNotFoundException {
        File file = new File(fisier);
        Scanner scanner = new Scanner(file);
        List<Integer> integers = new ArrayList<>();
        int m = scanner.nextInt();
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                integers.add(scanner.nextInt());
            } else {
                scanner.next();
            }
        }
        Input input = new Input(m, integers);
        return input;
    }
}

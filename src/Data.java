import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
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
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int i = 0;
        int m = scanner.nextInt();
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                map.put(x, i);
                integers.add(x);
                i++;
            } else {
                scanner.next();
            }
        }
        Input input = new Input(m, integers, map);
        return input;
    }
}

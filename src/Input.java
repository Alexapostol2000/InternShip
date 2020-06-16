import java.util.HashMap;
import java.util.List;

public class Input {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    private int m;
    private List<Integer> array;


    public Input(int m, List<Integer> array, HashMap<Integer, Integer> map) {
        this.m = m;
        this.array = array;
        this.map = map;
    }

    public int getM() {
        return m;
    }

    public List<Integer> getArray() {
        return array;
    }

    public HashMap<Integer, Integer> getMap() {
        return map;
    }
}

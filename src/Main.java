import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
      Data date = new Data(args[0]);
        List<Integer> listnumber = new ArrayList<>();
        listnumber = date.cindata();
        System.out.println(listnumber);
    }
}
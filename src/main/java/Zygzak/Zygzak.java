package Zygzak;


import java.util.ArrayList;
import java.util.Map;

public class Zygzak {

    public ArrayList<String> start(int number) {
        ArrayList<String> list = new ArrayList<>();

        if (number <= 0) {
            list.add("Sorry, you cannot use 0 or lower.");
        } else {
        for (int i = 0; i < number; i++) {
            int newValue = number + 1;
            if (newValue % 3 == 0) {
                list.add("ZYG");
            } else {
                list.add(String.valueOf(newValue));
            }
            if (newValue % 5 == 0) {
                list.add("ZAK");
            } else {
                list.add(String.valueOf(newValue));
            }


            list.add(String.valueOf(newValue));
        }

        }
        return list;
    }
}

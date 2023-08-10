import java.util.*;

public class listex {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Aaryan");// 0
        list.add("Arush"); // 1

        // list.remove(1);
        list.get(0).equalsIgnoreCase("aarYan");

        list.indexOf("Arush");

        /* for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (String s : list) {
            System.out.println(s);
        }

        int i = 0;
        while (i < list.size()) {
            System.out.println(list.get(i));
            i++;
        } */
        
        // list.forEach(e -> System.out.print(e + " "));
        list.forEach(System.out::println);
    }
}

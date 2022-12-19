import java.util.Collections;
import java.util.LinkedList;

public class HW4Task1 {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
                list.add("П");
                list.add("О");
                list.add("Т");
                list.add("О");
                list.add("П");

        Collections.reverse(list);
        System.out.println(list);
    }
}
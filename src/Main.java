import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main (String[] args){
        List<String> arrayList = new ArrayList<>();
        arrayList.add("E");
        arrayList.add("D");
        arrayList.add("C");
        arrayList.add("B");
        arrayList.add("A");
        arrayList.remove("C");
        Collections.sort(arrayList);
        System.out.println("ArrayList: " + arrayList);
    }
}

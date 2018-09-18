import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add("" + i);
        }
        System.out.println("ArrayList Contents: " + arr.toString());

        String str = "";
        for (String i: arr) {
            str += "Element: " + i + " ";
        }
        System.out.println(str);

        System.out.println("Removed Val: " + arr.remove(0));
        System.out.println("ArrayList Contents: " + arr.toString());

        arr.remove("3");
        System.out.println("String contains item '1': " + arr.contains("1"));
        System.out.println("Size the array: " + arr.size());

    }

}

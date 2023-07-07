import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);

        //list.forEach(i-> System.out.println(i));
        list.stream().skip(4).forEach(i->System.out.println(i));
    }
}

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.addFirst("Fox");
        cars.addLast("Ferrari");
        cars.removeFirst();
        cars.removeLast();
        cars.remove(1);
        System.out.println(cars);
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("one");
        queue.add("two");
        queue.add("three");

        System.out.println(queue);

        queue.remove("three");
        System.out.println(queue);
        System.out.println("Queue Size: " + queue.size());
        System.out.println("Queue Contains element 'two' or not? : " + queue.contains("two"));


        // To empty the queue
        queue.clear();

        // Add an array to a queue
        String nums[] = {"one","two","three","four","five"};
        Collections.addAll(queue, nums);
        System.out.println(queue);

        // Convert queue to array
        String strArray[] = queue.toArray(new String[queue.size()]);
        System.out.println(Arrays.toString(strArray));
    }
}
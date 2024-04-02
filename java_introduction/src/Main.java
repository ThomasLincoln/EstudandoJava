import java.util.ArrayList;
import java.util.Scanner;

public class Main {

//    public String name;
//    protected int salary;

    public static void main(String[] args) {
//        short idade = 10;
//
//        Ser meuSerAnimal = new Cachorro("Max", idade, "Lucio");
//        meuSerAnimal.setNome("Maxuel");
//        System.out.println(meuSerAnimal.saudacao());
//
//        Scanner input = new Scanner(System.in);
//        String fruit = input.next();
//
//        switch (fruit) {
//            case "manga" -> System.out.println("King of the fruits");
//            case "Apple" -> System.out.println("A sweet red fruit");
//            case "Orange" -> System.out.println("Round fruit");
//            case "Grapes" -> System.out.println("Small fruit");
//            default -> System.out.println("Please enter a valid fruit");
//        }
        int a = 5;
        int b = 0;
//        Primeira forma de mostrar uma exceção
//        try {
//            System.out.println(a/b);
//        }catch (ArithmeticException e){
//            e.printStackTrace();
//            }

//        Segunda forma de mostrar uma exceção
//        try {
//            System.out.println(a / b);
//        } catch (ArithmeticException e) {
//            System.out.println(e.toString());
//        }

//        Terceira forma de mostrar uma exceção
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }
}
//    public int getSalary() {
//        return this.salary;
//    }
//}

import java.util.ArrayList;

public class Main {

    public String name;
    protected int salary;
    public static void main(String[] args)
    {
        short idade = 10;
        Ser meuSerAnimal = new Cachorro("Max", idade, "Lucio");
        meuSerAnimal.setNome("Maxuel");
        System.out.println(meuSerAnimal.saudacao());

    }

    public int getSalary() {
        return this.salary;
    }
}

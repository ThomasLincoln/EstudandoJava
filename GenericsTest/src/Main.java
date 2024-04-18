public class Main {
    public static void main(String[] args) {
        System.out.println("Métodos Genéricos");

        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = {1.3, 2.9, 3.1, 5.9, 4.9, 3.0};
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O'};

        System.out.println("Array intArray Contains: ");
        printArray(intArray);
        System.out.println("Array doubleArray Contains: ");
        printArray(doubleArray);
        System.out.println("Array stringArray Contains: ");
        printArray(charArray);

        System.out.println("Métodos Genéricos com limites");

        System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 4, 5,
         maximum( 3, 4, 5 ));
        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n",
         6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ));

        System.out.printf("Max of %s, %s and %s is %s\n","pear",
         "apple", "orange", maximum("pear", "apple", "orange"));


        //  Classe Genérica
        System.out.println("Classe genérica");
        
        Caixa<String> caixaDeTexto = new Caixa<>("Olá Mundo!");
        Caixa<Integer> caixaDeNumero = new Caixa<>(10);

        System.out.println(caixaDeTexto.getObjeto());
        System.out.println(caixaDeNumero.getObjeto());

    }

    public static < E > void printArray(E [] inputArray){
//  Mostrando os elemenros
        for(E element : inputArray){
            System.out.println("Elemento: " + element);
        }
        System.out.println();
    }

    // método genérico com tipo delimitado
    public static < T extends Comparable<T>> T maximum (T x, T y, T z){
        T max = x; 

        if(y.compareTo(max) > 0){
            max = y; 
        }

        if(z.compareTo(max) > 0){
            max = z; 
        }

        return max;
    }
}


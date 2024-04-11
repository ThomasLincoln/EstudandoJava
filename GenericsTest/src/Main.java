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

        System.out.println();
    }

    public static < E > void printArray(E [] inputArray){
//  Mostrando os elemenros
        for(E element : inputArray){
            System.out.println("Elemento: " + element);
        }
        System.out.println();
    }
}
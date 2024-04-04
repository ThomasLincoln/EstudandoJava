import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException {
        System.out.println("Coloque o arquivo na pasta documentos");
        System.out.println("Escreva o nome do arquivo com extensão 'text.txt': ");

        Scanner sc1 = new Scanner(System.in);
        String nome = sc1.next();

        Path path = Path.of("/home", "sicario", "Documentos").resolve(nome);
        System.out.println(path);

        boolean exists = Files.exists(path);
        System.out.println(exists);
        if(!exists){
            System.out.println("Arquivo não encontrado");
            return;
        }

        String s = Files.readString(path);
//        System.out.println(s);
        int numeroDeVogais = 0;
        int numeroDeConsoantes = 0;
        int espacosEmBranco = 0;
        int outros = 0;

        for(int i = 0; i < s.length(); i++){
            char charAtual = s.charAt(i);

            switch (charAtual){
                case 65, 69, 73, 79, 85, 97, 101, 105, 111, 117:
                    numeroDeVogais++;
                    break;
                case 32:
                    espacosEmBranco++;
                    break;
                case 66, 67, 68, 70, 71, 72, 74, 75, 76, 77, 78, 80, 81, 82, 83, 84, 86, 87, 88, 89, 90,
                     98, 99, 100, 102, 103, 104, 106, 107, 108, 109, 110, 112, 113, 114, 115, 116,
                        118, 119, 120, 121, 122:
                    numeroDeConsoantes++;
                    break;
                default:
                    outros++;

            }

        }
        System.out.println("Número de Vogais: " + numeroDeVogais);
        System.out.println("Número de consoantes: " + numeroDeConsoantes);
        System.out.println("Número de espaços: " + espacosEmBranco);
        System.out.println("Número de outros: " + outros);
    }
}
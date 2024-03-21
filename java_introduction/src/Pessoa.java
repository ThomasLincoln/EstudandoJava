

public class Pessoa extends Ser{
    String sobrenome;

    public  Pessoa(String nome, String sobrenome, short idade){
        super(nome, idade);
        this.sobrenome = sobrenome;
    }
    void criaMain(){
        Main meuMain = new Main();
        System.out.println(meuMain.name);
        System.out.println(meuMain.salary);
        this.idade = 2;
    }

    @Override
    public String saudacao(){
        return "Olá, meu nome é?" + this.nome;
    }


}

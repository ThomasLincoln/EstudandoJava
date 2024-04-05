package br.com.meubuscadordecep.dominio;

public class Endereco {
    String logradouro;
    String bairro;
    String localidade;

    public String getLocalidade() {
        return localidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    @Override
    public String toString() {
        String s = "Endereco{" +
                "logradouro=" + logradouro +
                ", bairro=" + bairro +
                ", localidade=" + localidade +
                '}';
        return s;
    }
}

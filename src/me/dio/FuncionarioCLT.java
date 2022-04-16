package me.dio;
/* Utiliza-se o abstract para travar a classe APENAS para HERENÇA */
public abstract class FuncionarioCLT {
    //atributos
    //protected para que as classes filhas tenham acessos aos atributos abaixo
    protected String nome;
    protected String documento;
    protected String ValorSalrio;
    protected String Endereco; // <<< composição

    public FuncionarioCLT(String nome, String documento, String valorSalrio, String endereco) {
        this.nome = nome;
        this.documento = documento;
        ValorSalrio = valorSalrio;
        Endereco = endereco;
    }

    public FuncionarioCLT() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getValorSalrio() {
        return ValorSalrio;
    }

    public void setValorSalrio(String valorSalrio) {
        ValorSalrio = valorSalrio;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    @Override
    public String toString() {
        return "FuncionarioCLT{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", ValorSalrio='" + ValorSalrio + '\'' +
                ", Endereco='" + Endereco + '\'' +
                '}';
    }
}

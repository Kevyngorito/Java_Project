package me.dio.model;
/* Utiliza-se o abstract para travar a classe APENAS para HERENÇA */
public abstract class FuncionarioCLT {
    //atributos
    //protected para que as classes filhas tenham acessos aos atributos abaixo
    protected String nome;
    protected String documento;
    protected Double ValorSalario;
    protected Endereco endereco; // <<< composição

    public FuncionarioCLT(String nome, String documento, Double valorSalario, Endereco endereco) {
        this.nome = nome;
        this.documento = documento;
        this.ValorSalario = valorSalario;
        this.endereco = endereco;
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

    public Double getValorSalario() {
        return ValorSalario;
    }

    public void setValorSalario(Double valorSalario) {
        this.ValorSalario = valorSalario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
       this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "FuncionarioCLT{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", ValorSalrio='" + ValorSalario + '\'' +
                ", Endereco='" + endereco + '\'' +
                '}';
    }
}

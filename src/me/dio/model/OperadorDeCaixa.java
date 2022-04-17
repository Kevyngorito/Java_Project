package me.dio.model;

import me.dio.model.Endereco;
import me.dio.model.FuncionarioCLT;

public class OperadorDeCaixa extends FuncionarioCLT {
    /*Pega o construtor da classe FuncionarioCLT por ser sua classe pai
    e utiliza o super para sobreescrever os parâmetros.
     */
    public OperadorDeCaixa(String nome, String documento, Double valorSalario, Endereco endereco) {
        super(nome, documento,valorSalario,endereco);
    }

    @Override
    public String toString() {
        return "OperadorDeCaixa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", ValorSalario=" + ValorSalario +
                ", endereco=" + endereco.getBairro() +
                '}';
    }
}

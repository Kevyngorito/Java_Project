package me.dio.model;

import me.dio.model.CalculaBonificacao;
import me.dio.model.FuncionarioCLT;

/*Atribui a classe Vendedor como filha de FuncionarioCLT*/
public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {
    private Double ValorDaBonificacao;

    @Override
    public void calculaBonificacao(Double porcetagemBonificacao) {
        this.ValorDaBonificacao = this.ValorSalario * (porcetagemBonificacao/100d);
    }

    @Override
    /*toString serve para imprimir o valor da variaveis strings ao invés do valor alocado na memória*/
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", ValorSalario='" + ValorSalario + '\'' +
                ", Endereco='" + endereco.getRua() + '\'' +
                ", ValorDaBonificacao=" + ValorDaBonificacao +
                '}';
    }


}

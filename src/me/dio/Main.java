package me.dio;


import me.dio.model.Endereco;
import me.dio.model.Gerente;
import me.dio.model.OperadorDeCaixa;
import me.dio.model.Vendedor;

public class Main {
public static void main (String[]args) {

   /* Endereco endereco = new Endereco();
    endereco.setRua("Rua 2999");
    System.out.println(endereco.getRua());*/


    Endereco endereco = new Endereco ("Flore de Liz",
    "Casa 22", "Botafogo");
    System.out.println(endereco);
    System.out.println("-----");
/* O método SET pode ser usado pois a classe vendedor é filha
da classe FuncionarioCLT, onde foi declarado o getter e setter.
Pois estes estão como PUBLIC.
 */
    Vendedor vendedor
             = new Vendedor();
    /*Dados seetados via setter, declarado um novo construtor VAZIO*/
    vendedor.setNome("Luana Gomes");
    vendedor.setDocumento("123.456.789-10");
    vendedor.setValorSalario(1000d);
    vendedor.calculaBonificacao (2.0);
    vendedor.setEndereco (endereco);
    System.out.println (vendedor);
    System.out.println ("------");

    /*Dados seetados via super, aproveitando o construtor pai*/
    OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa(
            "Juliana Soares",
            "998.157.304-09",
            1500d, endereco);
    System.out.println(operadorDeCaixa);
    System.out.println("-------------");

    Gerente gerente = new Gerente();
    gerente.setNome("Bianca Oliveira");
    gerente.setDocumento("159.113.204-01");
    gerente.setEndereco(endereco);
    gerente.setHorasTrabalhadas(40);
    gerente.setValorHora(97.50);
    gerente.calculaRemuneracao();
    gerente.calculaBonificacao(3.5);
    System.out.println(gerente);
    }
}
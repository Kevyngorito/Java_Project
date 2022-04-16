package me.dio;


public class Main {
public static void main (String[]args) {

   /* Endereco endereco = new Endereco();
    endereco.setRua("Rua 2999");
    System.out.println(endereco.getRua());*/


    Endereco endereco = new Endereco ("Rua funcionario",
    "Complemento funcionario", "Bairro funcionario");
    System.out.println(endereco);
    System.out.println("-----");
}

}



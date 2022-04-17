package me.dio.model;

public class Gerente extends FuncionarioPJ implements CalculaBonificacao{
    private Double valorBonificacao;


    /*Utiliza-se o super para pegar os parâmetros da classe mãe e
    sobreescrever, pois em FuncionarioPJ, os parâmetros estão como private.
    Logo, não seria possível criar o toString com os campos do pai, devido
    a proteção dos parâmetros com pivate, para que não fossem alterados a
    privacidade dos parâmetros de private para public ou protected
    foi utilizado o super.
     */

    @Override
    public void calculaBonificacao(Double porcetagemBonificacao) {
        this.valorBonificacao = (super.getValorRemuneracao() * (porcetagemBonificacao/100)) + 100d;
    }

    @Override
    public String toString() {
        return "Gerente:" +
                "nome = " + super.getNome() +
                ", documento =" + " " + super.getDocumento() +
                ", endereco =" + " "+ super.getEndereco().getBairro() +
                ", horasTrabalhadas =" + " "+ super.getHorasTrabalhadas() +
                ", valorHora=" +  " "+ super.getValorHora() +
                ", valorRemuneracao =" + " "+ super.getValorRemuneracao() +
                ", valorBonificacao =" + " "+ this.valorBonificacao +
                ']';
    }


}

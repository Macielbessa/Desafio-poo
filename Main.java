package com.basico.desafiopoo;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrenteDoJõao = new ContaCorrente();
        contaCorrenteDoJõao.setCliente("João"); // cliente
        contaCorrenteDoJõao.setSaldo(new BigDecimal(100.00)); // saldo atual

        System.out.println(contaCorrenteDoJõao.getSaldo());

        CaixaEletronico caixaEletronicoDoJoão = new CaixaEletronico();
        caixaEletronicoDoJoão.sacarSaldo(contaCorrenteDoJõao,new BigDecimal(20.00)); // valor a ser sacado

        System.out.println(contaCorrenteDoJõao.getSaldo());

        /**
        ContaCorrente contaCorrenteAntonio = new ContaCorrente();
        contaCorrenteAntonio.setCliente("Antonio");
        contaCorrenteAntonio.setSaldo(new BigDecimal(150.00));

        System.out.println(contaCorrenteAntonio.getSaldo());
        CaixaEletronico caixaEletronico = new CaixaEletronico();
        caixaEletronico.sacarSaldo(contaCorrenteAntonio, new BigDecimal(50.00));

        System.out.println(contaCorrenteAntonio.getSaldo());*/

    }
}

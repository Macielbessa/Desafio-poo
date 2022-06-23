package com.basico.desafiopoo;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws ExceptionDoSaldo {
        try {
            ContaCorrente contaCorrenteDoJõao = new ContaCorrente();

            contaCorrenteDoJõao.setCliente("João"); // cliente
            contaCorrenteDoJõao.setSaldo(new BigDecimal (100.00)); // saldo atual

            CaixaEletronico caixaEletronicoDoJoão = new CaixaEletronico();
            caixaEletronicoDoJoão.sacarSaldo(contaCorrenteDoJõao,new BigDecimal(50.00)); // valor a ser sacado

            contaCorrenteDoJõao.logarSaldoAtual();
        } catch (ExceptionDoSaldo e){
            System.out.println(e.getMessage());
        }
    }
}

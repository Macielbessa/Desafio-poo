package com.basico.desafiopoo;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws ExceptionDoSaldo {
        try {

            ContaCorrente contaCorrenteDoJõao = new ContaCorrente(); // criando a conta do cliente

            contaCorrenteDoJõao.setCliente("João"); // nome do cliente

            contaCorrenteDoJõao.setSaldo(new BigDecimal (500.00)); // saldo atual do cliente

            CaixaEletronico caixaEletronicoDoJoão = new CaixaEletronico();

            caixaEletronicoDoJoão.depositar(contaCorrenteDoJõao, new BigDecimal(500.00 )); // depositando na conta

            caixaEletronicoDoJoão.sacarSaldo(contaCorrenteDoJõao,new BigDecimal(500.00).divide(new BigDecimal(2.0))); // valor a ser sacado da conta do cliente

            contaCorrenteDoJõao.logarSaldoAtual();

        } catch (ExceptionDoSaldo e){
            System.out.println(e.getMessage());
        } catch (ExceptionDoDeposito e) {
            System.out.println(e.getMessage());
        }
    }
}

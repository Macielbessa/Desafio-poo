package com.basico.desafiopoo;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws ExceptionDoSaldo {
        try {

            ContaCorrente contaCorrenteDoJõao = new ContaCorrente(); // criando a conta do cliente

            contaCorrenteDoJõao.setCliente("João"); // nome do cliente

            contaCorrenteDoJõao.setSaldo(new BigDecimal (50.00)); // saldo atual do cliente

            CaixaEletronico caixaEletronicoDoJoão = new CaixaEletronico();

            caixaEletronicoDoJoão.depositar(contaCorrenteDoJõao, new BigDecimal(200.00 ).add(contaCorrenteDoJõao.getSaldo())); // depositando na conta

            caixaEletronicoDoJoão.sacarSaldo(contaCorrenteDoJõao,new BigDecimal(50.00)); // valor a ser sacado da conta do cliente

            contaCorrenteDoJõao.logarSaldoAtual();


        } catch (ExceptionDoSaldo e){
            System.out.println(e.getMessage());
        } catch (ExceptionDoDeposito e) {
            System.out.println(e.getMessage());
        }
    }
}

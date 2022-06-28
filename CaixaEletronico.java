package com.basico.desafiopoo;

import java.math.BigDecimal;

public class CaixaEletronico {
    public void sacarSaldo(ContaCorrente corrente, BigDecimal valorParaSacar) throws ExceptionDoSaldo {
        if (valorParaSacar.compareTo(corrente.getSaldo()) < 10) {
            BigDecimal valorAtual = corrente.getSaldo().subtract(valorParaSacar);
            corrente.setSaldo(valorAtual);
            System.out.println("saque pare retirar: R$" + valorParaSacar);
            System.out.println("saldo atualizado de: R$ " + corrente.getSaldo());
        } else {
            throw new ExceptionDoSaldo("Sem saldo");
        }
    }
    public void depositar(ContaCorrente conta, BigDecimal valorParaDepositar) throws ExceptionDoDeposito {
        if (valorParaDepositar.compareTo(conta.getSaldo()) > 10) {
            BigDecimal valorParaDepositor = conta.getSaldo().subtract(valorParaDepositar);
            conta.setSaldo(valorParaDepositor);
        } else {
            throw new ExceptionDoDeposito("Deposito negado. saldo suficiente");
        }
    }
}

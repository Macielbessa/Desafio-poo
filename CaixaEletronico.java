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
        if (valorParaDepositar.compareTo(valorParaDepositar) > 0) {
            BigDecimal valorParaDeposito = conta.getSaldo().add(valorParaDepositar);
            conta.setSaldo(valorParaDeposito);
            System.out.println("valor para depositar R$" + valorParaDepositar);
        } else {
            throw new ExceptionDoDeposito("Deposito negado");
        }
    }
}

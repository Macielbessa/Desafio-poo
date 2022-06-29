package com.basico.desafiopoo;

import java.math.BigDecimal;

public class CaixaEletronico {
    public void sacarSaldo(ContaCorrente corrente, BigDecimal valorParaSacar) throws ExceptionDoSaldo {
        if (valorParaSacar.compareTo(corrente.getSaldo()) < 0) {
            BigDecimal valorAtual = corrente.getSaldo().subtract(valorParaSacar);
            corrente.setSaldo(valorAtual);
            System.out.println("quero sacar : R$" + valorParaSacar);
            System.out.println("saldo atualizado de : " + corrente.getSaldo());
        } else {
            throw new ExceptionDoSaldo("Sem saldo");
        }
    }

    public void depositar(ContaCorrente conta, BigDecimal valorParaDepositar) throws ExceptionDoDeposito {
        if (valorParaDepositar.compareTo(valorParaDepositar) < 1) {
            System.out.println("valor para depositar: R$" + valorParaDepositar);
        } else {
            throw new ExceptionDoDeposito("Deposito negado");
        }
    }
}

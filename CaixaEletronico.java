package com.basico.desafiopoo;

import java.math.BigDecimal;

public class CaixaEletronico {
    public void sacarSaldo(ContaCorrente corrente, BigDecimal valorParaSacar) throws ExceptionDoSaldo {
        if (valorParaSacar.compareTo(corrente.getSaldo()) < 0) {
            BigDecimal valorAtual = corrente.getSaldo().subtract(valorParaSacar);
            corrente.setSaldo(valorAtual);
            System.out.println("quero sacar : R$" + valorParaSacar);
            System.out.println("saldo atualizado de : R$ " + corrente.getSaldo());
        } else {
            throw new ExceptionDoSaldo("Sem saldo");
        }
    }


    public void deposito (ContaCorrente conta, BigDecimal valorParaDepositar) throws ExceptionDoDeposito {
        if (valorParaDepositar.compareTo(new BigDecimal("1000")) < 1){
            BigDecimal valorAtualizado = conta.getSaldo().add(valorParaDepositar);
            conta.setSaldo(valorAtualizado);
            System.out.println(valorParaDepositar);
        } else {
            throw new ExceptionDoDeposito("Deposito negado");
        }
    }
}

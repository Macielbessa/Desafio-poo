package com.basico.desafiopoo;

import java.math.BigDecimal;

public class CaixaEletronico {
    public void sacarSaldo(ContaCorrente corrente, BigDecimal valorParaSacar) throws Exception{

            if (valorParaSacar.compareTo(corrente.getSaldo()) > 0) {
                BigDecimal valorAtual = corrente.getSaldo().subtract(valorParaSacar);
                corrente.setSaldo(valorAtual);
                System.out.println("saque pare retirar: R$" + valorParaSacar);
                System.out.println("saldo atualizado de: R$ " + corrente.getSaldo());
            } else {
                throw new Exception("Sem saldo");
            }
       }
}

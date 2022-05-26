package com.basico.desafiopoo;

import java.math.BigDecimal;

public class CaixaEletronico {
    public void sacarSaldo(ContaCorrente corrente, BigDecimal valorParaSacar){
              BigDecimal valorAtual = corrente.getSaldo().subtract(valorParaSacar);
              corrente.setSaldo(valorAtual);



    }
}

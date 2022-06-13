package com.basico.desafiopoo;

import java.math.BigDecimal;

public class ContaCorrente {
    private String cliente;
    private BigDecimal saldo;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getSaldo() {
        return this.saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void logarSaldoAtual(){
        System.out.println(this.saldo);
    }
}

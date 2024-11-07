package org.example;
public class Candidato {
    private int idade;
    private int anosEmprego;
    private boolean creditoNegativo;
    private boolean autonomo;
    private double renda;

    public Candidato(int idade, int anosEmprego, boolean creditoNegativo, boolean autonomo, double renda) {
        this.idade = idade;
        this.anosEmprego = anosEmprego;
        this.creditoNegativo = creditoNegativo;
        this.autonomo = autonomo;
        this.renda = renda;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAnosEmprego() {
        return anosEmprego;
    }

    public void setAnosEmprego(int anosEmprego) {
        this.anosEmprego = anosEmprego;
    }

    public boolean isCreditoNegativo() {
        return creditoNegativo;
    }

    public void setCreditoNegativo(boolean creditoNegativo) {
        this.creditoNegativo = creditoNegativo;
    }

    public boolean isAutonomo() {
        return autonomo;
    }

    public void setAutonomo(boolean autonomo) {
        this.autonomo = autonomo;
    }

    public double getRenda() {

        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public String verificarElegibilidade() {
        if (this.idade < 18) {
            return "Empréstimo negado: idade insuficiente.";
        }
        if (this.creditoNegativo) {
            return "Empréstimo negado: histórico de crédito negativo.";
        }
        if (this.autonomo) {
            if (this.renda < 50000) {
                return "Empréstimo negado: renda insuficiente para autônomos.";
            }
        } else {
            if (this.anosEmprego < 2) {
                return "Empréstimo negado: emprego instável.";
            }
        }
        return "Empréstimo aprovado.";
    }

}
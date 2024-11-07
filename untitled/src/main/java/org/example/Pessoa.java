package org.example;
public class Pessoa {
    private boolean sexo;
    private double altura;
    private double peso;

    public Pessoa(boolean sexo, double altura, double peso) {
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }
    public boolean isSexo() { return sexo; }
    public void setSexo(boolean sexo) { this.sexo = sexo; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public double getPeso() { return peso;}
    public void setPeso(double peso) { this.peso = peso; }

    public String calcularImc(){
        double imc = getPeso()/java.lang.Math.pow(getAltura(),2);
        if(isSexo()){
            if(imc < 19.1){
                return "Abaixo do Peso";
            } else if(imc < 25.8){
                return "Peso normal";
            } else if(imc <27.3){
                return "Marginalmente acima do peso";
            } else if(imc <32.3){
                return "Acima do peso ideal";
            } else {
                return "Obeso";
            }
        } else {
            if(imc < 20.7){
                return "Abaixo do Peso";
            } else if(imc < 26.4){
                return "Peso normal";
            } else if(imc < 27.8){
                return "Marginalmente acima do peso";
            } else if(imc < 31.1){
                return "Acima do peso ideal";
            } else {
                return "Obeso";
            }
        }
    }
}

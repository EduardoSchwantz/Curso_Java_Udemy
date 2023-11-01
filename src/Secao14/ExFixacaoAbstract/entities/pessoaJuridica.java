package Secao14.ExFixacaoAbstract.entities;

public class pessoaJuridica extends Pessoa {
    private Double numFuncionarios;

    public pessoaJuridica() {
        super();
    }

    public pessoaJuridica(String nome, Double rendaAnual, Double numFuncionarios) {
        super(nome, rendaAnual);
        this.numFuncionarios = numFuncionarios;
    }

    public Double getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(Double numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    @Override
    public Double imposto() {
        if(getNumFuncionarios() >= 10){
            return super.getRendaAnual() * 0.14;
        }
        else
            return super.getRendaAnual() * 0.16;

    }

    @Override
    public String toString() {
        return super.getNome() + ": $ " + String.format("%.2f", imposto());
    }
}

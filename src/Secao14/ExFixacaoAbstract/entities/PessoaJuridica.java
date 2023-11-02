package Secao14.ExFixacaoAbstract.entities;

public class PessoaJuridica extends Pessoa {
    private Integer numFuncionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numFuncionarios) {
        super(nome, rendaAnual);
        this.numFuncionarios = numFuncionarios;
    }

    public Integer getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(Integer numFuncionarios) {
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

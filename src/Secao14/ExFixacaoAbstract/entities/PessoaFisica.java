package Secao14.ExFixacaoAbstract.entities;

public class PessoaFisica extends Pessoa {
    private Double gastoSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public Double imposto() {
        if (super.getRendaAnual() <= 20000.00) {
            return (super.getRendaAnual() * 0.15) - (getGastoSaude() * 0.5);
        } else
            return (super.getRendaAnual() * 0.25) - (getGastoSaude() * 0.5);
    }

    @Override
    public String toString() {
        return super.getNome() + ": $ " + String.format("%.2f", imposto());
    }
}

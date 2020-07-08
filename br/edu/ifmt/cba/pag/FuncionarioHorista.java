package br.edu.ifmt.cba.pag;

/**
 * Classe do Funionario Horista
 * @author Eduardo Gonçalves
 */
public class FuncionarioHorista extends Funcionario {
    private double valorHora;
    private double quantidadeHora;

    public FuncionarioHorista(double valorHora, double quantidadeHora, String cpf, String nome, int identificacao, double salario) {
        super(cpf, nome, identificacao, salario);
        setTipoFuncionario("Funcionario Horista");
        this.valorHora = valorHora;
        this.quantidadeHora = quantidadeHora;
    }   
    
    public FuncionarioHorista() {
    }

    public double getValorHora() {
        return valorHora;
    }
    @Override
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getQuantidadeHora() {
        return quantidadeHora;
    }
    
    @Override
    public void setQuantidadeHora(double quantidadeHora) {
        this.quantidadeHora = quantidadeHora;
    }

    @Override
    public double getSalario() {
        return super.getSalario() +(this.valorHora * this.quantidadeHora); 
    }
    
    @Override
    public String toString() {
        return "Funcionario Horista{" + "Nome = " + super.getNome()+ ", Cpf =" + super.getCpf() + ", Identificacao = " + super.getIdentificacao() + ", Salario = " + getSalario() + '}';
    }
    
    
    
    
}

package br.edu.ifmt.cba.pag;

/**
 * Classe do Funcionario Supervisor
 * @author Eduardo Gonçalves da Silva
 */

public class FuncionarioSupervisor extends Funcionario{
    private double adicionalSalario;

    public FuncionarioSupervisor(double adicionalSalario, String cpf, String nome, int identificação, double salario) {
        super(cpf, nome, identificação, salario);
        setTipoFuncionario("Funcionario Supervisor");
        this.adicionalSalario = adicionalSalario;
    }
    
    public FuncionarioSupervisor() {
    }

    public double getAdicionalSalario() {
        return adicionalSalario;
    }
    
    @Override
    public void setAdicionalSalario(double adicionalSalario) {
        this.adicionalSalario = adicionalSalario;
    }
    
    
    @Override
    public double getSalario() {
        return super.getSalario() + adicionalSalario;
    }
    
    @Override
    public String toString() {
        return "Funcionario Supervisor{" + " Nome = " + super.getNome() +", Cpf = " + super.getCpf() + ", Identificacao = " + super.getIdentificacao() + ", Salario = " + getSalario() + '}';
    }
}

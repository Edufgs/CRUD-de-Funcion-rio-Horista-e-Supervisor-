package br.edu.ifmt.cba.pag;

/**
 * Classe do Funcionario Supervisor
 * @author Eduardo Gonçalves da Silva
 */

public class FuncionarioSupervisor extends Funcionario{
    private double adicionalSalario;

    public FuncionarioSupervisor(double adicionalSalario, String cpf, String nome, int identificacao, double salario) {
        super(cpf, nome, identificacao, salario);
        this.adicionalSalario = adicionalSalario;
    }
    
    public FuncionarioSupervisor() {
  
    }    
    
    public double getAdicionalSalario() {
        return adicionalSalario;
    }
    
    public void setAdicionalSalario(double adicionalSalario) {
        this.adicionalSalario = adicionalSalario;
    }
    
    public double getSalarioBase(){
        return super.getSalario();
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

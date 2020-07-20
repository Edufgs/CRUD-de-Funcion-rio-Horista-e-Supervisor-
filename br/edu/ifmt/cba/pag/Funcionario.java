package br.edu.ifmt.cba.pag;

/**
 * Classe do funcionario base
 * @author Eduardo Gonçalves
 */

public class Funcionario {
    private String cpf;
    private String nome;
    private int identificacao;
    private double salario;

    public Funcionario(String cpf, String nome, int identificacao, double salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.identificacao = identificacao;
        this.salario = salario;
    }

    public Funcionario() {
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }   
}

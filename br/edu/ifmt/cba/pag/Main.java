package br.edu.ifmt.cba.pag;
import br.edu.ifmt.cba.pag.util.Teclado;
import br.edu.ifmt.cba.pag.Funcionario;

/**
 * Classe principal com menu
 * @author Eduardo GOnçalves da Silva
 */
public class Main {
    private static int nF = 10; //numero de Funcionarios
    private static Funcionario funcionario[] = new Funcionario[nF];
    
    
    public static void main(String[]args){
        menu();
     
    }
    
    public static void menu(){
        System.out.println("================ Menu ================");
        System.out.println("============ 1 = Cadastrar ===========");
        System.out.println("============ 2 = Excluir   ===========");
        System.out.println("============ 3 = Obter     ===========");
        System.out.println("============ 4 = Alterar   ===========");
        System.out.println("============ 5 = Sair      ===========");
        System.out.println("======================================");
        int op = Teclado.leInt("Digite a Opção:");
               
        switch(op){
            case 1:
                cadastrar();
                break;
                
            case 2:
                excluir();
                menu();
                break;
                        
             case 3:
                for(int i = 0; i < nF; i++){
                    if(funcionario[i] != null){
                        System.out.println(funcionario[i]);
                    }
                }
                menu();
                break;
                
            case 4:
                alterar();
                menu();
                break;
                
            case 5:
                System.exit(0);
                break;
                
            default:
                System.out.println("Opção Invalida!!!");
                menu();
        } 
    }
    
    public static void cadastrar(){
        System.out.println("======== Tipo de Funcionarios ========");
        System.out.println("==== 1 = Funcionario Horista      ====");
        System.out.println("==== 2 = Funcionario Supervisor   ====");
        System.out.println("==== 3 = Voltar                   ====");
        System.out.println("======================================");
        int op = Teclado.leInt("Digite a Opção:");
        
        if(op == 1){
                String nome = Teclado.leString("Digite o nome: ");
                String cpf = Teclado.leString("Digite o CPF: ");
                int identificacao = Teclado.leInt("Digite o numero de dentificação: ");
                double salario = Teclado.leDouble("Digite o salario: ");
                double valorHora = Teclado.leDouble("Digite o valor da hora: ");
                double hora = Teclado.leDouble("Digite a quantidade de hora: ");
                
                for(int i = 0; i<nF; i++){
                    if(funcionario[i] == null){
                        funcionario[i] = new FuncionarioHorista(valorHora, hora, cpf, nome, identificacao, salario);
                        //System.out.println("Cadastrado com sucesso!!!");
                        menu();
                    }                       
                }
                System.out.println("Memoria de funcionarios cheia!!!!");
                menu();
                
        }else if(op == 2){
                String nome = Teclado.leString("Digite o nome: ");
                String cpf = Teclado.leString("Digite o CPF: ");
                int identificacao = Teclado.leInt("Digite o numero de dentificação: ");
                double salario = Teclado.leDouble("Digite o salario: ");
                double adicionalSalario = Teclado.leDouble("Digite o salario adicional: ");
                               
                for(int i = 0; i<nF; i++){
                    if(funcionario[i] == null){
                        funcionario[i] = new FuncionarioSupervisor(adicionalSalario, cpf, nome, identificacao, salario);
                        System.out.println("Cadastrado com sucesso!!!");
                        menu();
                    }
                }
                System.out.println("Memoria de funcionarios cheia!!!!");
                menu();
                
        }else if(op == 3){
           menu();
        }else{
           System.out.println("Opção Invalida!!!");
           cadastrar();
        }
    }
    
    public static void excluir(){
        funcionario[pesquisa()] = null;
        System.out.println("Excluido com sucesso!!!");
        menu();
    }

    public static int pesquisa(){
        System.out.println("=========== Pesquisar por: ===========");
        System.out.println("==== 1 = Nome                     ====");
        System.out.println("==== 2 = CPF                      ====");
        System.out.println("==== 3 = Identificação            ====");
        System.out.println("==== 4 = Voltar                   ====");
        System.out.println("======================================");
        int op = Teclado.leInt("Digite a Opção:");
        
        switch(op){
            case 1:
                String nome = Teclado.leString("Digite o nome:");
                for(int i = 0; i<nF; i++){
                    if(funcionario[i] != null && funcionario[i].getNome().equals(nome)){
                        return i;
                       
                    }else if(i == (nF - 1)){
                        System.out.println("Nada foi encontrado!!!!");
                        menu();
                    }           
                }
                break;
            case 2:
                String cpf = Teclado.leString("Digite o CPF:");
                for(int i = 0; i<nF; i++){
                    if(funcionario[i] != null && funcionario[i].getCpf().equals(cpf)){
                        return i;
                    }else if(i == (nF - 1)){
                        System.out.println("Nada foi encontrado!!!!");
                        menu();
                    }
                }    
                break;
 
            case 3:
                int identificacao = Teclado.leInt("Digite a identificação:");
                for(int i = 0; i<nF; i++){
                    if(funcionario[i] != null && funcionario[i].getIdentificacao() == identificacao){
                        return i;
                    }else if(i == nF - 1){
                            System.out.println("Nada foi encontrado!!!!");
                            menu();
                    }
                }    
                break;
            case 4:
                menu();
                break;
                
            default:
            System.out.println("Opção Invalida!!!");
            pesquisa();
        }
        return 0;
    }
    
    public static void alterar(){
        int i = pesquisa();
        System.out.println(funcionario[i]);
        System.out.println("=========== Alterar o que: ===========");
        System.out.println("==== 1 = Nome                     ====");
        System.out.println("==== 2 = CPF                      ====");
        System.out.println("==== 3 = Identificação            ====");
        System.out.println("==== 4 = Salario total            ====");
        System.out.println("==== 5 = Voltar                   ====");
        System.out.println("======================================");
        int op = Teclado.leInt("Digite a Opção:");
        
        switch(op){
            case 1:
                String nome = Teclado.leString("Digite o nome:");
                funcionario[i].setNome(nome);
                System.out.println("Alterado com sucesso!!!");
                System.out.println(funcionario[i]);
                menu();
                break;
                
            case 2:
                String cpf = Teclado.leString("Digite o CPF:");
                funcionario[i].setCpf(cpf);
                System.out.println("Alterado com sucesso!!!");
                System.out.println(funcionario[i]);
                menu();
                break;
 
            case 3:
                int identificacao = Teclado.leInt("Digite o numero de identificação");
                funcionario[i].setIdentificacao(identificacao);
                System.out.println("Alterado com sucesso!!!");
                System.out.println(funcionario[i]);
                menu();
                break;
                
            case 4:
                if("Funcionario Horista".equals(funcionario[i].getTipoFuncionario())){
                    double salario = Teclado.leDouble("Digite o salario:");
                    double valorHora = Teclado.leDouble("Digite o valor da hora: ");
                    double hora = Teclado.leDouble("Digite a quantidade de hora: ");
                    funcionario[i] = new FuncionarioHorista(valorHora, hora, funcionario[i].getCpf(), funcionario[i].getNome(), funcionario[i].getIdentificacao(), salario);   
                }else{
                    double salario = Teclado.leDouble("Digite o salario:");
                    double adicionalSalario = Teclado.leDouble("Digite o salario adicional: ");
                    funcionario[i] = new FuncionarioSupervisor(adicionalSalario, funcionario[i].getCpf(), funcionario[i].getNome(),funcionario[i].getIdentificacao(), salario);
                }
                System.out.println("Alterado com sucesso!!!");
                System.out.println(funcionario[i]);
                menu();
                break;
                        
            case 5:
                menu();
                break;
            default:
            System.out.println("Opção Invalida!!!");
            alterar();
        }
    }   
}




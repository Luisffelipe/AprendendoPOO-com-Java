
public abstract class Funcionario {
    private String nome;
    private int cpf;
    private Endereco end;
    private static final double salario = 1212;
    private double valeTransporte = 300;
    private double valeRefeição = 250;



    //metodos Getters
    public String getNome(){
        return this.nome;
    }
    public int getCpf(){
        return this.cpf;
    }
    public Endereco getEndereco(){
        return this.end;
    }
    public double getValeTransporte(){
        return this.valeTransporte;
    }
    public double getValeRefeição(){
        return this.valeRefeição;
    }
    public double getSalario(){
        return salario;
    }

    //metodos Setters  
    public void setValeTransporte(double valeTransporte){
        this.valeTransporte = valeTransporte;
    }
    public void setValeRefeição(double valeRefeição){
        this.valeRefeição = valeRefeição;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    public void setEndereco(Endereco end){
        this.end = end;
    }
    //imprimir dados
    public String imprimirDados(){
        return "Nome: "+nome+"\nCPF: "+cpf+"\nEndereço:\n"+end.imprimirDados();
    }

    //calcular salario
    public abstract double calcularSalario();
    
}

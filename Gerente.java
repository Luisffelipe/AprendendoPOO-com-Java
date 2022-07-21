public class Gerente extends Funcionario{
    private final double bonusCargo = 3000;
    private final String cargo = "Gerente";
    public Gerente(){};

    public Gerente(String nome, int cpf, Endereco end, double valeRefeição, double valeTransporte){
        super.setNome(nome);
        super.setCpf(cpf);
        super.setEndereco(end);
        super.setValeRefeição(valeRefeição);
        super.setValeTransporte(valeTransporte);
    }

    public double calcularSalario(){
        return super.getValeRefeição() + super.getValeTransporte() + super.getSalario() + this.bonusCargo;
    }
    public String imprimir(){
        return "Cargo: "+this.cargo+super.imprimirDados();
    }
}

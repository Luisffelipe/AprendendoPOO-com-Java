public class Cozinheiro extends Funcionario implements TrabalhoNaCozinha{
    private int id_praça;
    private String especializaçao;
    private final String cargo = "Cozinheiro";
    private final double bonusCargo = 2000;

    //metodos de acesso
    public Cozinheiro(){}

    public Cozinheiro(String nome, int cpf, Endereco end, int id_praça, String especializaçao, double valeRefeição, double valeTransporte){
        super.setNome(nome);
        super.setCpf(cpf);
        super.setEndereco(end);
        super.setValeRefeição(valeRefeição);
        super.setValeTransporte(valeTransporte);
        this.id_praça = id_praça;
        this.especializaçao = especializaçao;
    }

    //metodos Getters e Setters
    public void setId_praça(int id_praça){
        this.id_praça = id_praça;
    }
    public void setEspecialização(String especialização){
        this.especializaçao = especialização;
    }
    public int getId_praça(){
        return this.id_praça;
    }
    public String getEspecialização(){
        return this.especializaçao;
    }
    //imprimir dados
    public String imprimir(){
        return "Cargo: "+this.cargo+"\n"+super.imprimirDados() + "ID da praça: "+id_praça+"\nEspecialização: "+especializaçao+"\n"+"Salário Total: "+this.calcularSalario()+"\nCurso Obrigatório: "+this.cursoObrigatorio;
    }
    //calcular salario
    public double calcularSalario(){
        return super.getValeRefeição() + super.getValeTransporte() + super.getSalario() + this.bonusCargo;
    }
    //anotar o pedido
    public String emitirCartaoConvite(){
        return "\nOlá, tudo bem? Me chamo"+super.getNome()+", e estou lhe convidando a fazer-nos uma visitia,"+
        "no restaurante mais renomado da cidade, o Warming-Up, Localiza-se na Avenida Paulista"+
        "de frente ao Shopping Center 3, para obter um desconto de 20% em qualquer compra e ainda"+
        "me ajudar, entregue esse cartão a qualquer funcionário"+
        "do restaurante, tenha um ótimo dia e obrigado pela atenção!";
    }
}

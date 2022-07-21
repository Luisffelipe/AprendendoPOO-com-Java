public class Garcom extends Funcionario implements TrabalhoNaCozinha{
    private final double bonusCargo = 1000;
    private final String cargo = "Garçom";

    public Garcom(){};

    public Garcom(String nome, int cpf, Endereco end, double valeRefeição, double valeTransporte){
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
        return "Cargo: "+this.cargo+"\n"+super.imprimirDados()+"\nCurso Obrigatório: "+this.cursoObrigatorio+"\n";
    }

    public String emitirCartaoConvite(){
        return "\nOlá, tudo bem? Me chamo"+super.getNome()+", e estou lhe convidando a fazer-nos uma visitia,"+
        "no restaurante mais renomado da cidade, o Warming-Up, Localiza-se na Avenida Paulista"+
        "de frente ao Shopping Center 3, para obter um desconto de 20% em qualquer compra e ainda"+
        "me ajudar, entregue esse cartão a qualquer funcionário"+
        "do restaurante, tenha um ótimo dia e obrigado pela atenção!";
    }
}

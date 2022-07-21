
public class Prato {
    private String nome;
    private String ingredientes;
    private double valor;

    public Prato(String nome, String ingredientes, double valor){
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.valor = valor;
    }
    public Prato(){}

    public String getNome(){
        return nome;
    }

    public String getIngredientes(){
        return ingredientes;
    }

    public double getValor(){
        return valor;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIngredientes(String ingredientes){
        this.ingredientes = ingredientes;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
}

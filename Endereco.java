public class Endereco {
    private String cidade;
    private String rua;
    private int numero_casa;

    public Endereco(){}

    public Endereco(String cidade, String rua, int numero_casa){
        this.cidade = cidade;
        this.rua = rua;
        this.numero_casa = numero_casa;
    }

    //metodos setters
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public void setRua(String rua){
        this.rua = rua;
    }
    public void setNumero_casa(int numero_casa){
        this.numero_casa = numero_casa;
    }
    //metodos getters
    public String getCidade(){
        return this.cidade;
    }
    public String getRua(){
        return this.rua;
    }
    public int getNumero_casa(){
        return this.numero_casa;
    }
    //imprimir dados
    public String imprimirDados(){
        return "Cidade "+this.cidade+"\nRua: "+this.rua+"\nNº da Casa: "+this.numero_casa+"\n";
    }

}

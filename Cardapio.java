public class Cardapio{
    private String nome_cardapio = "WarmingUp";
    private Prato pratos[] = new Prato[999];
    private int indice_pratos=0;
    

    public Cardapio(String nome_cardapio){
        this.nome_cardapio = nome_cardapio;
    }
    public Cardapio(){}

    public void adicionarPrato(String nome, String ingredientes, double valor){
        pratos[indice_pratos] = new Prato(nome, ingredientes, valor);
        indice_pratos++;
    }
    public String getNome_cardapio(){
        return nome_cardapio;
    }
    public int getQuantidade_Pratos(){
        return indice_pratos;
    }
    public Prato getPrato(int indice){
        return pratos[indice];
    }
 

}
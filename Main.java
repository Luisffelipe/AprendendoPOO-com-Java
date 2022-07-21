import java.util.Scanner;

// MAIN ----------------
public class Main{
    public static void main(String[] agrs){

        //SCANNER-------------------------
        Scanner entrada;
        entrada = new Scanner(System.in); 
        //OBJETOS--------------------------
        Cardapio cardapio = new Cardapio();
        Cozinheiro[] cozinheiros = new Cozinheiro[999];
        Garcom[] garcons = new Garcom[999];
        Endereco enderecos[] = new Endereco[999];
        Gerente gerentes[] = new Gerente[999];
        //VARIAVEIS------------------------
        int menuPrincipal;
        boolean menu=true;
        int aux;
        int indice_cozinheiros = 0;
        int indice_garcons = 0;
        int indice_gerentes = 0;
        int indice_enderecos = 0;
        

//------------------------------------- MENU INICIAL --------------------------------------------//
    while(menu==true){
        System.out.println(cardapio.getNome_cardapio()+" ("+cardapio.getQuantidade_Pratos()+" Pratos)\nEscolha uma opção abaixo através do terminal!\n1- Adionar um prato\n2- Administrar o cardapio\n3- Cadastrar um funcionário\n4- Administrar os funcionários\n5- Sair do menu");
        menuPrincipal = entrada.nextInt();
        switch(menuPrincipal){
            //Adicionar prato ao cardapio---------------
            case 1:
                do{   
                    System.out.println("Informe o nome do prato: ");
                    String nome_prato = entrada.next();
                    System.out.println("Ingredientes: ");
                    String ingredientes_prato = entrada.next();
                    System.out.println("Valor: ");
                    double valor_prato = entrada.nextInt();
                    cardapio.adicionarPrato(nome_prato, ingredientes_prato, valor_prato);
                    System.out.println("\nPrato cadastrado!\n");
                    System.out.println("1 para adicionar outro item;\n2 para voltar ao menu");
                    aux = entrada.nextInt();
                }while(aux==1);
                    
                break;

            //Administrar o cardapio-------------------------
            case 2:
                do{
                    int indice_pratos = cardapio.getQuantidade_Pratos();
                    Prato prato;
                    for(int i=0;i<indice_pratos;i++){
                        prato = cardapio.getPrato(i);
                        System.out.println(prato.getNome()+"\n"+prato.getIngredientes()+"\n"+prato.getValor()+"\n");
                    }
                    System.out.println("Pressione 1 para voltar ao menu!");
                    aux = entrada.nextInt();
                }while(aux!=1);
 
                break;
            //Cadastro de funcionários------------------
            case 3:
                    int auxx;
                    System.out.println("Informe o tipo de funcionário a ser cadastrado:\n1 - Cozinheiro:\n2 - Garçom: \n3 - Gerente: ");
                    auxx = entrada.nextInt();
                    
                    switch(auxx){
                        case 1:
                            cozinheiros[indice_cozinheiros] = new Cozinheiro();
                            System.out.println("Informe os dados do funcionário:\nNome: ");
                            cozinheiros[indice_cozinheiros].setNome(entrada.next());
                            System.out.println("CPF: ");
                            cozinheiros[indice_cozinheiros].setCpf(entrada.nextInt());
                            enderecos[indice_enderecos] = new Endereco();
                            System.out.println("Cidade: ");
                            enderecos[indice_enderecos].setCidade(entrada.next());
                            System.out.println("Rua: ");
                            enderecos[indice_enderecos].setRua(entrada.next());
                            System.out.println("Número da casa: ");
                            enderecos[indice_enderecos].setNumero_casa(entrada.nextInt());
                            cozinheiros[indice_cozinheiros].setEndereco(enderecos[indice_enderecos]);
                            System.out.println("ID da praça: ");
                            cozinheiros[indice_cozinheiros].setId_praça(entrada.nextInt());
                            System.out.println("Especialização: ");
                            cozinheiros[indice_cozinheiros].setEspecialização(entrada.next());
                            System.out.println("Vale-Transporte: ");
                            cozinheiros[indice_cozinheiros].setValeTransporte(entrada.nextDouble());
                            System.out.println("Vale-Refeição: ");
                            cozinheiros[indice_cozinheiros].setValeRefeição(entrada.nextDouble());
                            indice_cozinheiros++;
                            indice_enderecos++;
                            System.out.println("\nCadastro concluido com sucesso!");
                            break;
                        case 2:
                            garcons[indice_garcons] = new Garcom();
                            System.out.println("Informe os dados do funcionário:\nNome: ");
                            garcons[indice_garcons].setNome(entrada.next());
                            System.out.println("CPF: ");
                            garcons[indice_garcons].setCpf(entrada.nextInt());
                            enderecos[indice_enderecos] = new Endereco();
                            System.out.println("Cidade: ");
                            enderecos[indice_enderecos].setCidade(entrada.next());
                            System.out.println("Rua: ");
                            enderecos[indice_enderecos].setRua(entrada.next());
                            System.out.println("Número da casa: ");
                            enderecos[indice_enderecos].setNumero_casa(entrada.nextInt());
                            garcons[indice_garcons].setEndereco(enderecos[indice_enderecos]);
                            System.out.println("Vale-Transporte: ");
                            garcons[indice_garcons].setValeTransporte(entrada.nextDouble());
                            System.out.println("Vale-Refeição: ");
                            garcons[indice_garcons].setValeRefeição(entrada.nextDouble());
                            indice_garcons++;
                            indice_enderecos++;
                            System.out.println("\nCadastro concluido com sucesso!");
                            break;
                           
                        case 3:
                            gerentes[indice_gerentes] = new Gerente();
                            System.out.println("Informe os dados do funcionário:\nNome: ");
                            gerentes[indice_gerentes].setNome(entrada.next());
                            System.out.println("CPF: ");
                            gerentes[indice_gerentes].setCpf(entrada.nextInt());
                            enderecos[indice_enderecos] = new Endereco();
                            System.out.println("Cidade: ");
                            enderecos[indice_enderecos].setCidade(entrada.next());
                            System.out.println("Rua: ");
                            enderecos[indice_enderecos].setRua(entrada.next());
                            System.out.println("Número da casa: ");
                            enderecos[indice_enderecos].setNumero_casa(entrada.nextInt());
                            gerentes[indice_gerentes].setEndereco(enderecos[indice_enderecos]);
                            System.out.println("Vale-Transporte: ");
                            gerentes[indice_gerentes].setValeTransporte(entrada.nextDouble());
                            System.out.println("Vale-Refeição: ");
                            gerentes[indice_gerentes].setValeRefeição(entrada.nextDouble());
                            indice_gerentes++;
                            indice_enderecos++;
                            System.out.println("\nCadastro concluido com sucesso!");
                            break;
                    }
            break;
            //administrar funcionários -----------------------------------------------
            case 4:
                for (Cozinheiro cozinheiro : cozinheiros) {
                    if(cozinheiro != null){
                        System.out.print(cozinheiro.imprimir());
                    }
                }
                for (Garcom garcon : garcons) {
                    if(garcon != null){
                        System.out.print(garcon.imprimir());
                    }
                }
                for (Gerente gerente : gerentes) {
                    if(gerente != null){
                        System.out.print(gerente.imprimir());
                    }
                }
                break;

            //Fechar o programa------------------
            case 5:
                menu=false;

                break;

//-------------------------------- END MENU ------------------------------------------------//

        }
    }
        entrada.close();
    } 
}
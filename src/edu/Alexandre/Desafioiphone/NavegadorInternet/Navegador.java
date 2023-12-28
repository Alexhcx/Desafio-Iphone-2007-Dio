package edu.Alexandre.Desafioiphone.NavegadorInternet;

public class Navegador implements NavegadorInternet{
    public void exibirPagina(){
        digitarEndereço();
          System.out.println("Exibindo página...");
    }
    public void adicionarNovaAba(){
        System.out.println("adicionando nova aba...");
    }
    public void atualizarPagina(){
        System.out.println("atualizando página...");
    }
    private void digitarEndereço(){
        System.out.println("Digitando endereço da página...");
    }
}

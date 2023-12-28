package edu.Alexandre.Desafioiphone.Iphone;

import edu.Alexandre.Desafioiphone.AparelhoTelefonico.AparelhoTelefonico;
import edu.Alexandre.Desafioiphone.NavegadorInternet.NavegadorInternet;
import edu.Alexandre.Desafioiphone.ReprodutorMusical.ReprodutorMusical;

public class SistemaIphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    public void tocar() {
        System.out.println("Tocando música no Iphone...");
    }

    public void pausar() {
        System.out.println("Pausando música no Iphone...");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando Música no Iphone...");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página no Iphone...");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Iphone...");
    }

    public void atualizarPagina() {
          System.out.println("Atualizando página no Iphone...");
    }

    public void ligar() {
        System.out.println("Fazendo ligação do Iphone...");
    }

    public void atender() {
        System.out.println("Atendendo ligação no Iphone...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no Iphone...");
    }
    
}

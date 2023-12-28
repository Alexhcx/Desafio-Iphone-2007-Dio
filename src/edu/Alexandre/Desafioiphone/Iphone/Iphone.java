package edu.Alexandre.Desafioiphone.Iphone;

import edu.Alexandre.Desafioiphone.AparelhoTelefonico.AparelhoTelefonico;
import edu.Alexandre.Desafioiphone.NavegadorInternet.NavegadorInternet;
import edu.Alexandre.Desafioiphone.ReprodutorMusical.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args){
        SistemaIphone sistema = new SistemaIphone();
        
        AparelhoTelefonico telefone = sistema;
        NavegadorInternet navegacao = sistema;
        ReprodutorMusical reproducaoMusica = sistema;

        System.out.println("Aplicativo Telefone:");
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();

        System.out.println("Aplicativo Navegador:");
        navegacao.adicionarNovaAba();
        navegacao.exibirPagina();
        navegacao.atualizarPagina();

        System.out.println("Aplicativo Reprodutor de música:");
        reproducaoMusica.selecionarMusica();
        reproducaoMusica.tocar();
        reproducaoMusica.pausar();
    }
}

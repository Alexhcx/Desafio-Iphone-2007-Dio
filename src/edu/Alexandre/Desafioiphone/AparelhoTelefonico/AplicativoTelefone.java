package edu.Alexandre.Desafioiphone.AparelhoTelefonico;

public class AplicativoTelefone implements AparelhoTelefonico{

    public void ligar(){
        digitarNumeroTelefone();
        System.out.println("Fazendo Ligação...");
    }
    public void atender(){
        System.out.println("Recebendo Ligação, atendendo...");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando o correio de voz...");
    }
    private void digitarNumeroTelefone(){
        System.out.println("Digitando o numero de telefone...");
    }
}

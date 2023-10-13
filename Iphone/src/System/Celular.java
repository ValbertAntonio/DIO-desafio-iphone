package System;

import System.utilitários.*;

public class Celular {
    public static void main(String[] args) {
    
        // Ao entrar no iphone o usuário colocará uma música para ouvir
        RepodutorMusical Ipod = new RepodutorMusical();

        Ipod.selecionarMusica(1);
        Ipod.tocar();
        Ipod.pausar();

        System.out.println();
        // Ele pausa a música pois alguem o liga
        
        AparelhoTelefônico telefone = new AparelhoTelefônico();

        telefone.atender();

        // ele atende mas desligam então ele retorna

        telefone.ligar();

        // ele liga mas não atendem, então ele descide adicionar um correio de voz

        telefone.iniciarCorreioVoz();

        System.out.println();

        // o usuário descide abrir o navegador de internet

        NavegadorDeInternet navegador = new NavegadorDeInternet();

        navegador.exibirPagina();

        navegador.adicionarNovaAba();

        navegador.atualizarPagina();

    }
}

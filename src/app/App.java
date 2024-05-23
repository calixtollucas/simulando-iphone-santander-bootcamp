package app;

import model.Iphone;

import java.util.Scanner;

public class App {

    private static final Iphone iphone = new Iphone();
    static Scanner in = new Scanner(System.in);
    private static String musica;
    private static String url;
    private static String numero;

    public static void main(String[] args) {

        int opcao;

        while(true){
            System.out.println("Iphone");
            System.out.println("------------------------------");
            System.out.println("Opções: ");
            System.out.println("1 - Reprodutor de música");
            System.out.println("2 - Telefone");
            System.out.println("3 - Navegador");
            System.out.println("4 - sair");
            opcao = Integer.parseInt(in.next());

            if(opcao == 1) App.painelReprodutor();
            if(opcao == 2) App.painelTelefone();
            if(opcao == 3) App.painelInternet();
            if(opcao == 4) break;
        }
    }

    public static void painelReprodutor(){

        int opcao;


        while(true){
            System.out.println("Painel do reprodutor de musica");
            System.out.println("------------------------------");
            System.out.println("1 - Escolher musica");
            System.out.println("2 - Reproduzir Música");
            System.out.println("3 - Pausar música");
            System.out.println("4 - voltar ao menu principal");
            opcao = Integer.parseInt(in.next());
            if(opcao == 1){
                System.out.println("Insira o nome da música");
                App.musica = in.next();
                iphone.selecionarMusica(musica);
            }
            if(opcao == 2) iphone.tocar();
            if(opcao == 3) iphone.pausar();
            if(opcao == 4) break;
        }
    }

    public static void painelTelefone(){

        int opcao;


        while(true){
            System.out.println("Painel do Telefone");
            System.out.println("------------------------------");
            System.out.println("1 - Ligar para alguém");
            System.out.println("2 - Atender");
            System.out.println("3 - Iniciar Correio de Voz");
            System.out.println("4 - voltar ao menu principal");
            opcao = Integer.parseInt(in.next());
            if(opcao == 1){
                System.out.println("Insira o número");
                App.numero = in.next();
                iphone.ligar(numero);
            }
            if(opcao == 2) iphone.atender();
            if(opcao == 3) iphone.iniciarCorreioVoz();
            if(opcao == 4) break;
        }

    }

    public static void painelInternet(){

        int opcao;

        while(true){
            System.out.println("Painel do Navegador");
            System.out.println("------------------------------");
            System.out.println("1 - Acessar site");
            System.out.println("2 - Adicionar Nova Aba");
            System.out.println("3 - Atualizar Página");
            System.out.println("4 - voltar ao menu principal");
            opcao = Integer.parseInt(in.next());
            if(opcao == 1){
                System.out.println("Insira a url");
                App.url = in.next();
                iphone.exibirPagina(url);
            }
            if(opcao == 2) iphone.adicionarNovaAba();
            if(opcao == 3) iphone.atualizarPagina();
            if(opcao == 4) break;
        }

    }
}

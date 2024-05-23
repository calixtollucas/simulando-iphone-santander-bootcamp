package model;

import model.interfaces.AparelhoTelefonico;
import model.interfaces.NavegadorInternet;
import model.interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número "+numero);
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessando página "+url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada com sucesso");
    }

    @Override
    public void selecionarMusica(String musica) {

        System.out.println("Música "+musica+" selecionada");

    }

    @Override
    public void pausar() {
        System.out.println("Pausado!");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }
}

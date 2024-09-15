package Telefone;
import Aparelho.Iphone;
import Funcionalidades.Chamadas.funcaoTelefone;
import Funcionalidades.Internet.funcaoInternet;
import Funcionalidades.Musica.funcaoMusical;
public class telefone {
    public  static void main(String[] args) {
        Iphone em = new Iphone();
      
        funcaoTelefone ligar = em;
        funcaoTelefone atender = em;
        funcaoTelefone iniciarCorreioVoz = em;
        funcaoInternet ExibirPagina = em;
        funcaoInternet AdiconarNovaAba = em;
        funcaoInternet AtualizarPagina = em;
        funcaoMusical tocar = em;
        funcaoMusical pausar = em;
        funcaoMusical selecionarMusica = em;
        ligar.ligar();
        atender.atender();
        iniciarCorreioVoz.iniciarCorreioVoz();
        ExibirPagina.ExibirPagina();
        AdiconarNovaAba.AdiconarNovaAba();
        AtualizarPagina.AtualizarPagina ();
        tocar.tocar();
        pausar.pausar();
        selecionarMusica.selecionarMusica();
    }
}
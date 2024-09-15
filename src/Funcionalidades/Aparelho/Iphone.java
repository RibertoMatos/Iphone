package Aparelho;

import Funcionalidades.Chamadas.funcaoTelefone;
import Funcionalidades.Internet.funcaoInternet;
import Funcionalidades.Musica.funcaoMusical;

public class Iphone implements funcaoTelefone, funcaoInternet, funcaoMusical {
        // Implementação dos métodos da interface funcaoTelefone
        @Override
        public void ligar() {
            System.out.println("Telefone");
            System.out.println("Ligando...");
        }
        @Override
        public void atender() {
            System.out.println("Atendendo...");
        }
    
        @Override
        public void iniciarCorreioVoz() {
            System.out.println("Iniciando Correio de Voz...");
        }
    
        // Implementação dos métodos da interface funcaoMusical
        @Override
        public void tocar() {
            System.out.println("Musica");
            System.out.println("Tocando música...");
        }
        @Override
        public void pausar() {
            System.out.println("Pausando música...");
        }
    
        @Override
        public void selecionarMusica() {
            System.out.println("Selecionando música...");
        }
        public void ExibirPagina() {
            System.out.println("Internet");
            System.out.println("Exibindo nova pagina");
         }   
        public void AdiconarNovaAba() {
            System.out.println("Adicionando nova aba");
        }
        public void AtualizarPagina() {
            System.out.println("Atualizando nova pagina");
        }
    }

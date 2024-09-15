## Projeto POO

Criação de diagrama UML

classDiagram
    package Funcionalidades --> package Aparelho
    package Funcionalidades <-- Chamadas
    package Funcionalidades <-- Internet
    package Funcionalidades <-- Musica
    package Aparelho <-- Iphone
    package Funcionalidades : package Aparelho
    package Funcionalidades : package Musica
    package Funcionalidades : package Internet
    package Funcionalidades : package Chamadas
    package Aparelho : classe Iphone
    package Telefone : telefone
    package Telefone --> Iphone
    Chamadas --> funcaoTelefone
    Internet --> funcaoInternet
    Musica --> funcaoMusical
    Chamadas : interface funcaoTelefone
    Internet : interface funcaoInternet
    Musica : interface funcaoMusical
   
    funcaoTelefone : +String numero telefonico
    funcaoMusical : +String musica
    funcaoInternet: +String url
    

   
    class Iphone {
        + ligar(): void 
        + atender(): void 
        + iniciarCorreioVoz(): void 
        + tocar(): void 
        + pausar(): void 
        + selecionarMusica(): void 
        + ExibirPagina(): void 
        + AdiconarNovaAba(): void 
        + AtualizarPagina(): void 
    }
    class funcaoTelefone {
        + ligar(): void 
        + atender(): void 
        + iniciarCorreioVoz(): void
    }
     class funcaoInternet {
         + ExibirPagina(): void 
        + AdiconarNovaAba(): void 
        + AtualizarPagina(): void 
    }
     class funcaoMusical {
        + tocar(): void 
        + pausar(): void 
        + selecionarMusica(): void 
    }

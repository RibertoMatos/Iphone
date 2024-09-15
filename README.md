## Projeto POO

Criação de diagrama UML

[Diagrama UML] (https://www.mermaidchart.com/app/projects/1bf13c83-a3ca-4dee-af07-8d778038c9ec/diagrams/f0bd25b2-db96-457d-95ed-44adc6c4c9e3/version/v0.1/edit)


### Diagrama UML

![image](https://github.com/user-attachments/assets/414e6b01-c278-4b2c-bd8c-06e80be36332)




### Codigo do diagrama UML


```mermaid
 class Diagram

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
```


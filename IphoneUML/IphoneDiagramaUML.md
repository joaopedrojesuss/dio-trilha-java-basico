```mermaid
classDiagram
    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()              
        +iniciarCorreioVoz() 
    }

    class NavegadorInternet {
        +exibirPagina(String url)      
        +adicionarNovaAba()             
        +atualizarPagina()
    }

    class ReprodutorMusical {
        +tocar()          
        +pausar()         
        +selecionarMusica(String musica)
    }

    class Iphone {
    }

    Iphone --> AparelhoTelefonico
    Iphone --> NavegadorInternet
    Iphone --> ReprodutorMusical
```
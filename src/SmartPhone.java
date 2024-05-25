public class SmartPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{
    
    // Métodos de Aparelho Telefônico
    public void ligar(){
        System.out.println("Ligando para o número selecionado");
    }
    public void atender(){
        System.out.println("Atendendo ao chamado");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando o correio de voz");
    };

    // Métodos de Reprodutor Musical
    public void tocar(){
        System.out.println("Tocando a música");
    };
    public void pausar(){
        System.out.println("Pausando a música");
    }
    public void selecionarMusica(){
        System.out.println("Selecionando a música");
    }
    
    // Métodos de Navegador de Internet
    public void exibirPagina(){
        System.out.println("Exibindo a página");
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando a página");
    }


}

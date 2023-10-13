package System.utilitários;


public class RepodutorMusical {
    
    public void tocar(){
        System.out.println("A música está sendo tocada...");
    }

    public void pausar(){
        System.out.println("A música foi pausada.");
    }
    
    public void selecionarMusica(int numero){ 

        switch (numero) {
            case 1:
                System.out.println("(Luan santana as melhores 2014) foi selecionada.");
                break;

            case 2:
                System.out.println("(Summertimes eletro music 2010) foi selecionada.");
                break;

            case 3:
                System.out.println("(As melhores Charlie Brown Jr.) foi selecionada.");
                break;

            default:
                System.out.println("Digite um número válido de uma das músicas da playlist, música aleatória selecionada.");
                break;
        }
    }

}

package unidade_1;

public class Main {



    public static void main(String[] args){
        //instaciamos um objeto chamado "minhaGuitarra" que será do tipo "Guitarra"
        //Os valores passados são usados pelo construtor da classe para criar
        //o objeto
        Guitarra minhaGuitarra = new Guitarra("01020304", "fender", "telecaster", "eletrica", "mogno", 1500);

        //Testamos os dados da classe, imprimindo a saída simples no terminal
        System.out.println(minhaGuitarra.getNumeroSerie());
        System.out.println(minhaGuitarra.getMadeira());
        System.out.println(minhaGuitarra.getPreco());
        System.out.println(minhaGuitarra.getTipo());
    }

}
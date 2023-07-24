import animais.Cachorro;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();

        cachorro1.nome = "Snoop";
        cachorro1.cor = "Azul";
        cachorro1.altura = 25;
        cachorro1.peso = 10.5;
        cachorro1.tamanhoDoRabo = 5;

        System.out.println(cachorro1);

        cachorro1.latir();
        System.out.println("O cachorro pegou a " + cachorro1.pegar());

        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir"));
        System.out.println("O cachorro está " + cachorro1.interagir("nada"));
    }
}
import animais.Cachorro;
import animais.Gato;
import animais.Passaro;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Rex", "branco", 10, 10.5, 2, "carinho");

        Gato gato1 = new Gato("Felix", "Preto", 4.5);

        Passaro passaro1 = new Passaro("Frajola", "Azul", 4);

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();

//        System.out.println(cachorro1.getNumeroDeCachorros());
//
//        Cachorro cachorro2 = new Cachorro("Snoop", "branco", 10, 10.5, 2, "carinho");
//
//        System.out.println(cachorro2.getNumeroDeCachorros());
//        System.out.println(cachorro1.getNumeroDeCachorros());

//        System.out.println(cachorro1.toString());
//        System.out.println(cachorro2.toString());
//
//        cachorro2 = cachorro1;
//
//        System.out.println("------------------");
//        System.out.println(cachorro1.toString());
//        System.out.println(cachorro2.toString());
    }
}
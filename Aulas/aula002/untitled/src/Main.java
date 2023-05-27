import animais.cachorro;
import lojas.petshop;

public class Main {
    public static void main(String[] args) {

        cachorro cachorro1 = new cachorro(10.5,"Rex", "branco", 10, 5, "feliz" );
        cachorro cachorro2 = new cachorro(10.5,"Puppy", "marrom", 8, 4, "triste" );
        petshop woofshop = new petshop();

//        cachorro1.setNome( "Puppy");
//        cachorro1.setCor("Marrom");
//        cachorro1.setAltura(25);
//        cachorro1.peso (5.5);
//        cachorro1.setTamanhoDoRabo(5);
        woofshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());
    }

}
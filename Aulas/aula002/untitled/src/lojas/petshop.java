package lojas;
import animais.Animal;
import animais.gato;

public class petshop {

    public void darBanho(Animal animal) {
        animal.setEstadoDeEspirito("Limpo");
    }
    public void tosar(gato gato) {
        gato.setEstadoDeEspirito("tosado");
    }
    public void deixarNoHotel(Animal animal) {
        animal.setEstadoDeEspirito("com saudades");
    }
}

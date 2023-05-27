package animais;

public class passaro extends Animal {

    static int numeroDePassaros;


    public passaro(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDePassaros++;
    }

    @Override
    public void soar(){
        System.out.println("PIU PIU");

    }

}

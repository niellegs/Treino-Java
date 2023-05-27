package animais;

public class gato extends Animal {

    static int numeroDeGatos;


    public gato(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDeGatos++;
    }

    //metodos

@Override
public void soar(){
    System.out.println("MEOW");

}

    @Override
    public String toString() {
        return "gato{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

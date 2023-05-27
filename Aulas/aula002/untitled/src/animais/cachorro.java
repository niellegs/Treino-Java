package animais;

public class cachorro extends Animal {
    static int canil;
    // atributos

    private int tamanhoDoRabo;


    // construtores

    public cachorro(double peso, String nome, String cor, int altura, int tamanhoDoRabo, String estadoDeEspirito) {
        this.peso = peso;
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;

        canil++;
    }

//    public cachorro() {
//    }

    cachorro(String nome, String cor, int altura, int tamanhoDoRabo, double peso, String estadoDeEspirito) {

    }

    //metodos


    public static int getCanil() {
        return canil;
    }

    public static void setCanil(int canil) {
        cachorro.canil = canil;
    }



    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String pegar() {
        return "Bolinha";
    }

    ;

    public String interagir(String acao) {

        switch (acao) {
            case "carinho":
                this.estadoDeEspirito = "feliz";
                break;
            case "vai dormir":
                this.estadoDeEspirito = "bravo";
                break;
            case "pisar na patinha":
                this.estadoDeEspirito = "triste";
                break;
            default:
                this.estadoDeEspirito = "neutro";
        }


//        if (acao.equals("carinho")) {
//            this.estadoDeEspirito = "feliz";
//        } else if (acao.equals("vai dormir")) {
//            this.estadoDeEspirito = "bravo";
//        } else{
//        this.estadoDeEspirito="neutro";
//        }

        return estadoDeEspirito;
    }

    @Override
    public String toString() {
        return "cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }
    @Override
    public void soar(){
        System.out.println("AU AU");

    }
}


package animais;

public class Cachorro {
    //atributos
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;

    private String estadoDeEspirito;

    public String getNome(){
        return this.nome;
    }

    //construtores

    //construtor padrão
    public Cachorro(){

    }

    //construtor adicionado
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;
    }

    //metodos
    public void setNome(String nome){
        this.nome = nome;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
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



    public void comer(){}

    public void latir(){
        System.out.println("Au Au");
    }
    public String pegar(){
        return "Bolinha";
    }

    public String interagir(String acao){

        //switch tbm serve para enum

        switch (acao){
            case "carinho": this.estadoDeEspirito = "feliz"; break;
            case "vai dormir": this.estadoDeEspirito = "bravo"; break;
            case "pisar na patinha": this.estadoDeEspirito = "triste"; break;
            default: this.estadoDeEspirito = "neutro"; break;
        }

        return this.estadoDeEspirito;

//        if(acao.equals("carinho")){
//            this.estadoDeEspirito = "feliz";
//        }else if(acao.equals("vai dormir")){
//            this.estadoDeEspirito = "bravo";
//        }else if(acao.equals("pisar na patinha")){
//            this.estadoDeEspirito = "triste";
//        } else {
//            this.estadoDeEspirito = "neutro";
//        }
//        return estadoDeEspirito;
    }
}

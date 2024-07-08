public class Corredor extends Atleta{
    private double peso;
    private Competicao competicao;
    
    public Corredor(String nome, int idade, double peso, Competicao competicao) {
        super(nome, idade);
        this.peso = peso;
        this.competicao = competicao;
    }

    public Competicao imprimeCompeticao(){
        return competicao;
    }

    public String imprimeInfo() {
        return super.imprimeInfo()+"\n"+"Peso: "+peso+"\n"+"Competição: "+competicao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Competicao getCompeticao() {
        return competicao;
    }

    public void setCompeticao(Competicao competicao) {
        this.competicao = competicao;
    }

    
}

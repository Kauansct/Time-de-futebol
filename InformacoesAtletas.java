public class InformacoesAtletas {
    
    public void imprimeExclusivosAtleta(Atleta a){
        if (a instanceof Nadador){
            System.out.println("É um nadador, e sua categoria é"+((Nadador)a).getCategoria());
        }
        else{
            System.out.println("É um corredor, e o peso deste corredor é"+((Corredor)a).getPeso());
        }
    }

    public void imprimeInfoAtleta(Atleta a){
        if (a instanceof Nadador){
            ((Nadador)a).imprimeInfo();
        }
        else{
            ((Corredor)a).imprimeInfo();
        }
    }
}

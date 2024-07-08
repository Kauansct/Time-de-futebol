public class Teste {
    public static void main(String[] args) {
        Competicao competicao = new Competicao("Correr cansa", new Data(19,5, 2011));

        System.out.println(competicao.getNome());
        competicao.imprimeData();

        Nadador nadador = new Nadador("Cielo", 23, "Borboleta");

        nadador.imprimeInfo();

        Corredor corredor = new Corredor("Pedro", 91, 68, competicao);

        corredor.getCompeticao().getData().setMes(2);
        corredor.getCompeticao().imprimeData();

        Corredor corredor2 = new Corredor("Augosto", 100, 70, new Competicao("São Silvestre", new Data(1, 1, 2012)));

        corredor2.imprimeInfo();

        Atleta atleta;

        int opcao = Teclado.leInt("Digite 1 para criar um Nadador ou 2 para um Corredor: ");
        if (opcao == 1){
            String nome = Teclado.leString("Digite o nome deste Nadador: ");
            int idade = Teclado.leInt("Digite a idade deste Nadador: ");
            String categoria = Teclado.leString("Digite a categoria deste Nadador: ");
            atleta = new Nadador(nome, idade, categoria);
        }
        else if (opcao == 2){
            String nome = Teclado.leString("Digite o nome deste Corredor: ");
            int idade = Teclado.leInt("Digite a idade deste Corredor: ");
            double peso = Teclado.leDouble("Digite o peso deste Corredor: ");
            String nomeComp = Teclado.leString("Digite o nome da competição deste Corredor: ");
            int dia = Teclado.leInt("Digite a dia da competição deste Corredor: ");
            int mes = Teclado.leInt("Digite a mês da competição deste Corredor: ");
            int ano = Teclado.leInt("Digite a ano da competição deste Corredor: ");
            atleta = new Corredor(nome, idade, peso, new Competicao(nomeComp, new Data(dia, mes, ano)));
        }
        else{
            System.out.println("Não existe opção "+opcao+"\n"+"Digite novamente...");
            opcao = Teclado.leInt("Digite 1 para criar um Nadador ou 2 para um Corredor: ");
        }

        InformacoesAtletas atletas;

        atletas.imprimeExclusivosAtleta(atleta);

        atletas.imprimeInfoAtleta(atleta);

        if (atleta instanceof Nadador){
            ((Nadador)atleta).setCategoria("Livre");
        }
        else{
            ((Corredor)atleta).setPeso(89);
        }
    }
}

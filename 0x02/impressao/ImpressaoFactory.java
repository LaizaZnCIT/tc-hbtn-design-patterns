public class ImpressaoFactory {

    public static Impressao createImpressao(TamanhoImpressao tamanhoImpressao, int paginasTotais, int paginasColoridas, boolean ehFrenteVerso){
        return new Impressao(paginasTotais, paginasColoridas, ehFrenteVerso, tamanhoImpressao);
    }
}

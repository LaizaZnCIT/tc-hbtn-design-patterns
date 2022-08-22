public class Impressao {
    private int paginasTotais;
    private int paginasColoridas;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;
    private TamanhoImpressao tamanhoImpressao;

    public Impressao(int paginasTotais, int paginasColoridas, boolean ehFrenteVerso, TamanhoImpressao tamanhoImpressao) {
        this.paginasTotais = paginasTotais;
        this.paginasColoridas = paginasColoridas;
        this.ehFrenteVerso = ehFrenteVerso;
        this.tamanhoImpressao = tamanhoImpressao;
    }

    public TamanhoImpressao getTamanhoImpressao() {
        return tamanhoImpressao;
    }

    public void setTamanhoImpressao(TamanhoImpressao tamanhoImpressao) {
        this.tamanhoImpressao = tamanhoImpressao;
    }

    public int getPaginasTotais() {
        return paginasTotais;
    }

    public void setPaginasTotais(int paginasTotais) {
        this.paginasTotais = paginasTotais;
    }

    public int getPaginasColoridas() {
        return paginasColoridas;
    }

    public void setPaginasColoridas(int paginasColoridas) {
        this.paginasColoridas = paginasColoridas;
    }

    public boolean isEhFrenteVerso() {
        return ehFrenteVerso;
    }

    public void setEhFrenteVerso(boolean ehFrenteVerso) {
        this.ehFrenteVerso = ehFrenteVerso;
    }

    public double getValorColoridasFrenteVerso() {
        return valorColoridasFrenteVerso;
    }

    public void setValorColoridasFrenteVerso(double valorColoridasFrenteVerso) {
        this.valorColoridasFrenteVerso = valorColoridasFrenteVerso;
    }

    public double getValorPretoBrancoFrenteVerso() {
        return valorPretoBrancoFrenteVerso;
    }

    public void setValorPretoBrancoFrenteVerso(double valorPretoBrancoFrenteVerso) {
        this.valorPretoBrancoFrenteVerso = valorPretoBrancoFrenteVerso;
    }

    public double getValorColoridasFrenteApenas() {
        return valorColoridasFrenteApenas;
    }

    public void setValorColoridasFrenteApenas(double valorColoridasFrenteApenas) {
        this.valorColoridasFrenteApenas = valorColoridasFrenteApenas;
    }

    public double getValorPretoBrancoFrenteApenas() {
        return valorPretoBrancoFrenteApenas;
    }

    public void setValorPretoBrancoFrenteApenas(double valorPretoBrancoFrenteApenas) {
        this.valorPretoBrancoFrenteApenas = valorPretoBrancoFrenteApenas;
    }

    public double calcularTotal(){
        double total = 0.0;
        if(getTamanhoImpressao() == TamanhoImpressao.A2 && !ehFrenteVerso ) {
            total = getPaginasColoridas() * 0.32 + (getPaginasTotais() - getPaginasColoridas()) * 0.22;
        } else if (getTamanhoImpressao() == TamanhoImpressao.A2 && ehFrenteVerso) {
            total = getPaginasColoridas() * 0.28 +  (getPaginasTotais() - getPaginasColoridas()) * 0.18;
        } else if (getTamanhoImpressao() == TamanhoImpressao.A3 && !ehFrenteVerso) {
            total = getPaginasColoridas() * 0.30 + (getPaginasTotais() - getPaginasColoridas()) * 0.20;
        } else if (getTamanhoImpressao() == TamanhoImpressao.A3 && ehFrenteVerso) {
            total = getPaginasColoridas() * 0.25 + (getPaginasTotais() - getPaginasColoridas()) * 0.15;
        } else if (getTamanhoImpressao() == TamanhoImpressao.A4 && !ehFrenteVerso) {
            total = getPaginasColoridas() * 0.25 + (getPaginasTotais() - getPaginasColoridas()) * 0.15;
        } else if (getTamanhoImpressao() == TamanhoImpressao.A4 && ehFrenteVerso) {
            total = getPaginasColoridas() * 0.20 + (getPaginasTotais() - getPaginasColoridas()) * 0.10;
        }
        return total;
    }

    @Override
    public String toString() {
        java.util.Locale locale = new java.util.Locale("pt", "BR");
        String frenteOuVerso = "";
        if (ehFrenteVerso){
            frenteOuVerso = "frente e verso";
        } else {
            frenteOuVerso = "frente apenas";
        }
        return String.format(locale, "total de paginas: %d, total coloridas: %d, total preto e branco: %d, %s. total: R$ %.2f", getPaginasTotais(), getPaginasColoridas(), getPaginasTotais() - getPaginasColoridas(), frenteOuVerso, calcularTotal());
    }
}

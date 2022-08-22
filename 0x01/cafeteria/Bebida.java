import java.util.List;

public abstract class Bebida {
    public abstract List<String> obterIngredientes();
    public abstract double obterPreco();

    @Override
    public String toString(){
        java.util.Locale locale = new java.util.Locale("pt", "BR");
        return String.format(locale, "Preco: %.2f - Ingredientes: %s", obterPreco(), obterIngredientes());
    }
}

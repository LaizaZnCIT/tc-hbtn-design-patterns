import java.util.HashSet;
import java.util.stream.Collectors;

public class Pedido {
    private HashSet<ItemPedido> itensDentroCaixa;
    private HashSet<ItemPedido> itensForaCaixa;

    public Pedido() {
        itensForaCaixa = new HashSet<>();
        itensDentroCaixa = new HashSet<>();
    }

    public HashSet<ItemPedido> getItensDentroCaixa() {
        return itensDentroCaixa;
    }

    public void setItensDentroCaixa(HashSet<ItemPedido> itensDentroCaixa) {
        this.itensDentroCaixa = itensDentroCaixa;
    }

    public HashSet<ItemPedido> getItensForaCaixa() {
        return itensForaCaixa;
    }

    public void setItensForaCaixa(HashSet<ItemPedido> itensForaCaixa) {
        this.itensForaCaixa = itensForaCaixa;
    }

    public void adicionarItemDentroCaixa(ItemPedido item){
        itensDentroCaixa.add(item);
    }

    public void adicionarItemForaCaixa(ItemPedido item){
        itensForaCaixa.add(item);
    }

    @Override
    public String toString(){
        String itensFora = "\tFora da Caixa:\n";

        for (ItemPedido item : itensForaCaixa) {
            itensFora += String.format("\t\t- %s %s\n", item.getTipo(), item.getNome());
        }

        String itensDentro = "\tDentro da Caixa:\n";

        for (ItemPedido item : itensDentroCaixa) {
            itensDentro += String.format("\t\t- %s %s\n", item.getTipo(), item.getNome());
        }

        return itensFora + itensDentro;


    }
}

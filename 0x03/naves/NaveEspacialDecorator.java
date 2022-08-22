public class NaveEspacialDecorator extends NaveEspacial {
    private NaveEspacial naveDecorada;

    public NaveEspacialDecorator(NaveEspacial naveDecorada) {
        super(naveDecorada.getSaude(), naveDecorada.getAtaque());
    }
    @Override
    public int getSaude(){
        return super.getSaude();
    }
    @Override
    public int getAtaque(){
        return super.getAtaque();
    }
}

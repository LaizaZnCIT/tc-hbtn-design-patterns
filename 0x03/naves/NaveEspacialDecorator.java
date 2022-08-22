public class NaveEspacialDecorator extends NaveEspacial {
    private NaveEspacial naveEspacial;

    public NaveEspacialDecorator(NaveEspacial naveEspacial) {
        super(naveEspacial.getSaude(), naveEspacial.getAtaque());
    }

    public int getSaude(){
        return super.getSaude();
    }

    public int getAtaque(){
        return super.getAtaque();
    }
}

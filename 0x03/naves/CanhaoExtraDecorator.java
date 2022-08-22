public class CanhaoExtraDecorator extends NaveEspacialDecorator {
    public CanhaoExtraDecorator(NaveEspacial naveEspacial) {
        super(naveEspacial);
    }

    @Override
    public int getSaude() {
        return super.getSaude();
    }

    @Override
    public int getAtaque() {
        return super.getAtaque() + 75;
    }
}

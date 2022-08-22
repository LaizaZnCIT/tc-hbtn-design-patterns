public class ArmaduraDecorator extends NaveEspacialDecorator {
    public ArmaduraDecorator(NaveEspacial naveEspacial) {
        super(naveEspacial);
    }

    @Override
    public int getSaude() {
        return super.getSaude() + 150;
    }

    @Override
    public int getAtaque() {
        return super.getAtaque();
    }
}

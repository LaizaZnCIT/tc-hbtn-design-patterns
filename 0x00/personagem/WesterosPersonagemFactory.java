public class WesterosPersonagemFactory extends PersonagemFactory {

    @Override
    public Personagem createPersonagem(TipoPersonagem tipo, String nome) {
        Personagem personagem = null;
        if(tipo == TipoPersonagem.MAGO){
            personagem = new Mago(nome, 8, 3, 3, 3, 4);
        }
        if(tipo == TipoPersonagem.LADRAO){
            personagem = new Ladrao(nome,  1, 8, 7, 7, 10);
        }
        if(tipo == TipoPersonagem.GUERREIRO){
            personagem = new Guerreiro(nome,  0, 9, 7, 10, 7);
        }

        return personagem;
    }
}

public class TerraMediaPersonagemFactory extends PersonagemFactory {

    @Override
    public Personagem createPersonagem(TipoPersonagem tipo, String nome) {
        Personagem personagem = null;
        if(tipo == TipoPersonagem.MAGO){
            personagem = new Mago(nome, 10, 2, 5, 3, 4);
        }
        if(tipo == TipoPersonagem.LADRAO){
            personagem = new Ladrao(nome, 2, 6, 8, 5, 10);
        }
        if(tipo == TipoPersonagem.GUERREIRO){
            personagem = new Guerreiro(nome,  1, 8, 5, 10, 6);
        }

        return personagem;
    }
}

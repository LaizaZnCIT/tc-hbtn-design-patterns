public class AudioPlayer implements MediaPlayer {
    @Override
    public void reproduzir(String nomeArquivo, TipoMedia tipoMedia) {
        if(tipoMedia == TipoMedia.MP3){
            System.out.printf("Reproduzindo MP3: %s", nomeArquivo);
        }else{
            String adapter = String.valueOf(tipoMedia);
            System.out.printf("Reproduzindo %s: %s", adapter, nomeArquivo);
        }
    }
}

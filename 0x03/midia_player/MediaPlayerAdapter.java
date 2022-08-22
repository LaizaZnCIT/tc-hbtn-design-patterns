public class MediaPlayerAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(TipoMedia tipoMedia) {

        if(!tipoMedia.equals(TipoMedia.MP3)){
            advancedMediaPlayer = new VideoMediaPlayer();
        }
    }

    @Override
    public void reproduzir(String nomeArquivo, TipoMedia tipoMedia) {

    }
}

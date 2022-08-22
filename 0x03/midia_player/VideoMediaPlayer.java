public class VideoMediaPlayer implements AdvancedMediaPlayer {
    @Override
    public void reproduzirVlc(String arquivoVLC) {
        System.out.printf("Reproduzindo VLC: %s", arquivoVLC);
    }

    @Override
    public void reproduzirMp4(String videoMP4) {
        System.out.printf("Reproduzindo MP4: %s", videoMP4);
    }
}

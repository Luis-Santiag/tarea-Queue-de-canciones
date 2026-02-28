package umg.edu.gt.handler;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        PlaylistManager manager = new PlaylistManager();

       
        manager.addSong(new Song("Song A", "Artist A", 7, 1));
        manager.addSong(new Song("Song B", "Artist B", 10, 2));
        manager.addSong(new Song("Song C", "Artist C", 5, 1));
        manager.addSong(new Song("Song D", "Artist D", 12, 2));

        manager.start();
    }
}
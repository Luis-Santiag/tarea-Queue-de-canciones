package umg.edu.gt.handler;

import umg.edu.gt.queue.MyQueue;

public class PlaylistManager {

	private MyQueue<Song> history = new MyQueue<>();
	private int totalSongsPlayed = 0;
	private int totalTimePlayed = 0;
   
    private MyQueue<Song> highPriorityQueue = new MyQueue<>();

   
    private MyQueue<Song> normalQueue = new MyQueue<>();


    public void addSong(Song song) {

        if (song.getPriority() == 1) {
            highPriorityQueue.enqueue(song);
        } else {
            normalQueue.enqueue(song);
        }
    }


    public void start() throws InterruptedException {

        System.out.println("[LOG] Starting playlist...");

        while (!highPriorityQueue.isEmpty() || !normalQueue.isEmpty()) {

            Song current;

     
            if (!highPriorityQueue.isEmpty()) {
                current = highPriorityQueue.dequeue();
            } else {
                current = normalQueue.dequeue();
            }

            playSong(current);
        }


        
        System.out.println("[LOG] Playlist finished.");
        System.out.println("[LOG] Total songs played: " + totalSongsPlayed);
        System.out.println("[LOG] Total time played: " + totalTimePlayed + " seconds");
    }


    private void playSong(Song song) throws InterruptedException {

        System.out.println("[LOG] Now playing: " + song);

        for (int i = 1; i <= song.getDuration(); i++) {

            Thread.sleep(1000);

            totalTimePlayed++;

            printProgressBar(i, song.getDuration(), song.getTitle());
        }

        history.enqueue(song);
        totalSongsPlayed++;

        System.out.println("[LOG] Finished: " + song.getTitle());
    }
    
    private void printProgressBar(int current, int total, String title) {

        int progress = (current * 10) / total;

        StringBuilder bar = new StringBuilder("[");
        for (int i = 0; i < 10; i++) {
            if (i < progress) {
                bar.append("#");
            } else {
                bar.append("-");
            }
        }
        bar.append("]");

        System.out.println(
            "[LOG] Playing: " +
            title + " " +
            bar +
            " " + current + "s / " + total + "s"
        );
    }
}
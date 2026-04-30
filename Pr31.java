import java.util.*;

public class Pr29 {
    public static void main(String[] args) {

        LinkedList<String> playlist = new LinkedList<>();

        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");
        playlist.add("Song E");

        System.out.println("Playlist: " + playlist);

        String firstSong = playlist.removeFirst();
        System.out.println("\nPlaying: " + firstSong);
        System.out.println("Playlist after playing first song: " + playlist);

        String lastSong = playlist.removeLast();
        System.out.println("\nSkipped: " + lastSong);
        System.out.println("Playlist after skipping last song: " + playlist);
    }
}


package com.boatofthree;

import com.boatofthree.entity.Song;

import java.util.ArrayList;
import java.util.List;


public class AudioQueue {

    private static List<Song> queue = new ArrayList<>();

    public static void add(Song song){
        queue.add(song);
    }

    public static void addFirst(Song song){
        queue.add(0, song);
    }

    public static Song getFirst(){
        Song song = queue.get(0);
        queue.remove(0);

        return song;
    }

    public static List<Song> getAll(){
        return queue;
    }

    public static boolean isEmpty() {
        return queue.isEmpty();
    }
}

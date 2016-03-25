package com.boatofthree.controller;

import com.boatofthree.AudioQueue;
import com.boatofthree.entity.Song;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/queue")
public class QueueController {

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Song> getAll(){
        return AudioQueue.getAll();
    }

    @RequestMapping(value = "/next", method = RequestMethod.GET)
    public String getNext(){
        if (AudioQueue.isEmpty()){
            return "Random";
        }
        Song song = AudioQueue.getFirst();
        return song.getTitle();
    }

    @RequestMapping(value = "/put/{song}")
    public void addSong(@PathVariable long song){
        AudioQueue.add(new Song(song, "Author " + song, "Song " + song, 200));
    }

    @RequestMapping(value = "/put/forward/{song}")
    public void addForwardSong(@PathVariable long song){
        AudioQueue.addFirst(new Song(song, "Author " + song, "Song " + song, 200));
    }
}

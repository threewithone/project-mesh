package com.boatofthree.controller;

import com.boatofthree.entity.Song;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest/song")
public class SongController {

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Song> findAll(){
        return getMock();
    }

    @RequestMapping(value = "/author/{author}", method = RequestMethod.GET)
    public List<Song> findByAuthor(@PathVariable String author){
        return getMock();
    }

    public List<Song> getMock() {
        ArrayList<Song> list = new ArrayList<>(3);

        list.add(new Song(1, "Author 1", "Single 1", 165));
        list.add(new Song(2, "Author 1", "Single 2", 205));
        list.add(new Song(3, "Author 2", "Single 3", 180));

        return list;
    }
}

package com.music.controller;

import com.music.repository.AlbumsRepository;
import com.music.repository.ArtistsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedList;

@RestController
@RequestMapping("/albums")
public class AlbumsController {

    @Autowired
    private AlbumsRepository albumsRepository;

    @GetMapping("/getAlbumsByArtistIds")
    public ResponseEntity<String> getAlbumsByArtistIds() {

        String result = "result";

        System.out.println(albumsRepository.getAlbumsByArtistIds(41, 50));

        return new ResponseEntity<String>(result, HttpStatus.OK);
    }

    @GetMapping("/getArtistsAlbumsCount")
    public ResponseEntity<String> getArtistsAlbumsCount() {

        String result = "result";

        System.out.println(albumsRepository.getArtistsAlbumsCount());

        return new ResponseEntity<String>(result, HttpStatus.OK);
    }

    @GetMapping("/findByArtistArtistId")
    public ResponseEntity<String> findByArtistArtistId() {

        String result = "result";

        System.out.println(albumsRepository.findByArtistArtistId(16));

        return new ResponseEntity<String>(result, HttpStatus.OK);

    }

    @GetMapping("/countByArtistArtistIdEquals")
    public ResponseEntity<String> countByArtistArtistIdEquals() {

        String result = "result";

        Integer albumsCount = albumsRepository.countByArtistArtistIdEquals(16);

        return new ResponseEntity<>(String.valueOf(albumsCount), HttpStatus.OK);
    }

    @GetMapping("/findAllAlbums")
    public ResponseEntity<String> findAllAlbums() {

        String result = "result";

        ArrayList<String> albums = new ArrayList<>(albumsRepository.findAllAlbums());
        albums.forEach(System.out::println);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}

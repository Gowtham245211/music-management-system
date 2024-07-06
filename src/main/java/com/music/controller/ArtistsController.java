package com.music.controller;

import com.music.repository.ArtistsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtistsController {

    @Autowired
    private ArtistsRepository artistsRepository;
}

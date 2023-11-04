package com.company.app.controller;

import com.company.app.model.Album;
import com.company.app.util.AlbumRequestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/placeholder")
public class AlbumController {

    @Autowired
    private AlbumRequestClient albumClient;

    @GetMapping("/albums")
    public List<Album> getAlbums(){
        return albumClient.getAlbums();
    }
}

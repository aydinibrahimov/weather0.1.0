package com.company.app.util;

import com.company.app.model.Album;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@FeignClient(url="http://jsonplaceholder.typicode.com", name="album-service")
public interface AlbumRequestClient {
    @GetMapping("/albums")
    public List<Album> getAlbums();
}

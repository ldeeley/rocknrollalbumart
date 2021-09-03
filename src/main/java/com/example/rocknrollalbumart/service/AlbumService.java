package com.example.rocknrollalbumart.service;

import com.example.rocknrollalbumart.model.Album;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AlbumService {

    private List<Album> albums = Arrays.asList(
            new Album(1, "Dark Side of the Moon","https://i.scdn.co/image/ab67616d0000b273f05e5ac32fdd79d100315a20" ),
            new Album(2, "Exile on Main Street","https://i.scdn.co/image/ab67616d0000b273ba42bfcfeed19018b1f8cab8")
    );

    public List<Album> getAllAlbums(){
        return this.albums;
    }

    public Album getAlbum(Integer id){
        return albums.get(id);
    }


}

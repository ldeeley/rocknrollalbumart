package com.example.rocknrollalbumart.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Album Model")
public class Album {

    @ApiModelProperty(notes="ID of the Album", name="id",required = true,value = "int")
    private int id;
    @ApiModelProperty(notes="Title of the Album", name="title",required = true,value = "String")
    private String title;
    @ApiModelProperty(notes="Link to Album Artwork",name="albumArt",required = true,value = "String")
    private String albumArt;

    public Album(int id, String title, String albumArt) {
        this.id = id;
        this.title = title;
        this.albumArt = albumArt;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlbumArt() {
        return albumArt;
    }

    public void setAlbumArt(String albumArt) {
        this.albumArt = albumArt;
    }
}

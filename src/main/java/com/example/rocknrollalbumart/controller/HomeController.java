package com.example.rocknrollalbumart.controller;

import com.example.rocknrollalbumart.model.Album;
import com.example.rocknrollalbumart.model.ErrorResponse;
import com.example.rocknrollalbumart.service.AlbumService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@ApiOperation(value = "/api/v1",tags = "Album REST Controller")
@RestController
@RequestMapping("/api/v1")
public class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private AlbumService albumService;

    @Value("${my.greeting : default value}")
    private String greetingMessage;

    @ApiOperation(value = "get single Album details", response = Album.class)
    @GetMapping("/{id}")
    public Album getAlbum(@PathVariable Integer id){
        logger.trace("getAlbum method in HomeController called");
        return albumService.getAllAlbums().get(id);
    }

    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "SUCCESS", response = Album.class),
            @ApiResponse(code = 401,message = "UNAUTHORIZED", response = ErrorResponse.class),
            @ApiResponse(code = 403,message = "FORBIDDEN", response = ErrorResponse.class),
            @ApiResponse(code = 404,message = "NOT FOUND", response = ErrorResponse.class)
    })
    @ApiOperation(value = "get all Album details", response = Iterable.class)
    @GetMapping("/")
    public List<Album> getAlbums(){
        logger.trace("getAlbums method in HomeController called");
        return albumService.getAllAlbums();
    }

    @RequestMapping("/greeting")
    public String greeting(){
        return greetingMessage;
    }

}

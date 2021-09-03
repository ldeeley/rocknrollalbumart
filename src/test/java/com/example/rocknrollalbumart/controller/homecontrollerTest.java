package com.example.rocknrollalbumart.controller;

import com.example.rocknrollalbumart.model.Album;
import com.example.rocknrollalbumart.service.AlbumService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@WebMvcTest(HomeController.class)
class homecontrollerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AlbumService albumService;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void shouldCreateMockMvc(){
        assertNotNull(mockMvc);
    }

    @Test
    void getAlbum() throws Exception {
        when(albumService.getAllAlbums())
                .thenReturn(List.of(new Album(1,"Dark Side of the Moon",""),
                        new Album(2,"Exile on Main Street","")));
        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/api/v1/"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.length()").value(2))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].title").value("Dark Side of the Moon"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].title").value("Exile on Main Street"));
    }

    @Test
    void getAlbums() {
    }
}
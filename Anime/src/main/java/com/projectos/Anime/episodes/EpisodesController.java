package com.projectos.Anime.episodes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping(path = "api/v1/episodes")
public class EpisodesController {

    private final EpisodesService episodesService;

    @Autowired
    public EpisodesController(EpisodesService userService){
        this.episodesService = userService;
    }

    @GetMapping
    public List<Episodes> getEpisodes(){
        return episodesService.getEpisodes();
    }

    @PostMapping
    public void registerNewEpisode(@RequestBody Episodes episodes){
        episodesService.addNewEpisodes(episodes);
    }

    @DeleteMapping(path = "{episodesId}")
    public void deleteEpisode(@PathVariable("episodesId") Integer episodesId){episodesService.deleteEpisodes(episodesId);
    }

}

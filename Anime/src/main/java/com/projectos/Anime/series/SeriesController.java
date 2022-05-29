package com.projectos.Anime.series;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = "api/v1/series")
public class SeriesController {
    private final SeriesService seriesService;

    @Autowired
    public SeriesController(SeriesService seriesService){
        this.seriesService = seriesService;
    }

    @GetMapping
    public List<Series> getSeries(){
        return seriesService.getSeries();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(path ="{seriesId}")
    public Collection<Optional<Series>> getSeriesOne(@PathVariable("seriesId") Long seriesId){
       return seriesService.getSeriesOne(seriesId);
    }



    @PostMapping
    public void registerNewSeries(@RequestBody Series series){
        seriesService.addNewSeries(series);
    }

   /* @DeleteMapping(path = "{seriesId}")
    public void deleteSeries(@PathVariable("seriesId") Long seriesId){
        seriesService.deleteSeries(seriesId);
    }*/
}

package com.projectos.Anime.series;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class SeriesService {
    private final SeriesRepository seriesRepository;

    @Autowired
    public SeriesService(SeriesRepository seriesRepository) {
        this.seriesRepository = seriesRepository;
    }

    public List<Series> getSeries() {
        return seriesRepository.findAll();
    }


    public Collection<Optional<Series>> getSeriesOne(Long seriesId) {
        Collection<Optional<Series>> series = new ArrayList<>();
        Optional<Series> series1 = seriesRepository.findById(seriesId);
        boolean exists = seriesRepository.existsById(seriesId);
        if(!exists){
            throw new IllegalStateException("student whit id " + seriesId + "doesnt exist");
        }
        else {
            series.add(series1);
        }
        return  series;
    }


    public void addNewSeries(Series series) {
        seriesRepository.save(series);
    }

    public void deleteSeries(Long seriesId) {
        boolean exists = seriesRepository.existsById(seriesId);
        if(!exists){
            throw new IllegalStateException("student whit id " + seriesId + "doesnt exist");
        }
        seriesRepository.deleteById(seriesId);
    }
}

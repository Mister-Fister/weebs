package com.projectos.Anime.episodes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EpisodesService {

    private final EpisodesRepository episodesRepository;

    @Autowired
    public EpisodesService(EpisodesRepository userRepository) {
        this.episodesRepository = userRepository;
    }

    public List<Episodes> getEpisodes() {
        return episodesRepository.findAll();
    }

    public void addNewEpisodes(Episodes episodes)  {
        Optional<Episodes> episodesOptional = episodesRepository.findEpisodeByEpisodeNumber(episodes.getEpisode_number());
        if(episodesOptional.isPresent()){
            throw new IllegalStateException("number taken");
        }
        episodesRepository.save(episodes);
    }

    public void deleteEpisodes(Integer episodesId) {
        boolean exists = episodesRepository.existsById(episodesId);
        if(!exists){
            throw new IllegalStateException("episode whit id " + episodesId + "doesnt exist");
        }
        episodesRepository.deleteById(episodesId);
    }
}
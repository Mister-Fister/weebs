package com.projectos.Anime.episodes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EpisodesRepository extends JpaRepository<Episodes, Integer> {

    @Query("SELECT e FROM Episodes e WHERE e.episode_number = ?1")
    Optional<Episodes> findEpisodeByEpisodeNumber(String episode_number);

}
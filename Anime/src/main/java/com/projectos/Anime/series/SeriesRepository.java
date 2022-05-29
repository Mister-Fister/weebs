package com.projectos.Anime.series;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SeriesRepository extends JpaRepository<Series, Long> {
    @Query("SELECT s FROM Series s WHERE s.series_title = ?1")
    Optional<Series> findSeriesByTitle(String title);
}

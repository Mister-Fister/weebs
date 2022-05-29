package com.projectos.Anime.episodes;


import javax.persistence.*;
import java.awt.*;

@Entity
@Table
public class Episodes {
    @Id
    @SequenceGenerator(
            name = "episode_sequence",
            sequenceName = "episode_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "episode_sequence"
    )
    private int episode_id;
    //private Image episode_image;
    private String episode_anime_title;
    private String episode_number;
    private String episode_title;

    public Episodes() {
        this.episode_id = episode_id;
        //this.episode_image = episode_image;
        this.episode_anime_title = episode_anime_title;
        this.episode_number = episode_number;
        this.episode_title = episode_title;
    }

    //, Image episode_image
    public Episodes(int episode_id, String episode_anime_title, String episode_number, String episode_title) {
        this.episode_id = episode_id;
        //this.episode_image = episode_image;
        this.episode_anime_title = episode_anime_title;
        this.episode_number = episode_number;
        this.episode_title = episode_title;
    }



    public Episodes(String episode_anime_title, String episode_number, String episode_title) {
        this.episode_anime_title = episode_anime_title;
        this.episode_number = episode_number;
        this.episode_title = episode_title;
    }

    public int getEpisode_id() {
        return episode_id;
    }

    public void setEpisode_id(int episode_id) {
        this.episode_id = episode_id;
    }

    /*public Image getEpisode_image() {
        return episode_image;
    }

    public void setEpisode_image(Image episode_image) {
        this.episode_image = episode_image;
    }*/

    public String getEpisode_anime_title() {
        return episode_anime_title;
    }

    public void setEpisode_anime_title(String episode_anime_title) {
        this.episode_anime_title = episode_anime_title;
    }

    public String getEpisode_number() {
        return episode_number;
    }

    public void setEpisode_number(String episode_number) {
        this.episode_number = episode_number;
    }

    public String getEpisode_title() {
        return episode_title;
    }

    public void setEpisode_title(String episode_title) {
        this.episode_title = episode_title;
    }

    @Override
    public String toString() {
        return "Episodes{" +
                "episode_id=" + episode_id +
                ", episode_anime_title='" + episode_anime_title + '\'' +
                ", episode_number='" + episode_number + '\'' +
                ", episode_title='" + episode_title + '\'' +
                '}';
    }

    //   ", episode_image=" + episode_image +
}

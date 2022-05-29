package com.projectos.Anime.series;

import javax.persistence.*;

@Entity
@Table
public class Series {
        @Id
        @SequenceGenerator(
                name = "series_sequence",
                sequenceName = "series_sequence",
                allocationSize = 1
        )
        @GeneratedValue(
                strategy = GenerationType.SEQUENCE,
                generator = "series_sequence"
        )
        private Long series_id;
        private String series_title;
        private String series_image;
        private int series_ep_number;
        private int series_ep_number_full;
        private String series_description;

    private String series_url;

    public Series() {
        this.series_id = series_id;
        this.series_title = series_title;
        this.series_image = series_image;
        this.series_ep_number = series_ep_number;
        this.series_ep_number_full = series_ep_number_full;
        this.series_description = series_description;
        this.series_url = series_url;
    }
    public Series(Long series_id, String series_title, String series_image, int series_ep_number, int series_ep_number_full, String series_description, String series_url) {
        this.series_id = series_id;
        this.series_title = series_title;
        this.series_image = series_image;
        this.series_ep_number = series_ep_number;
        this.series_ep_number_full = series_ep_number_full;
        this.series_description = series_description;
        this.series_url = series_url;
    }
    public Series(String series_title, String series_image, int series_ep_number, int series_ep_number_full, String series_description, String series_url) {
        this.series_title = series_title;
        this.series_image = series_image;
        this.series_ep_number = series_ep_number;
        this.series_ep_number_full = series_ep_number_full;
        this.series_description = series_description;
        this.series_url = series_url;
    }

    public Long getSeries_id() {
        return series_id;
    }

    public void setSeries_id(Long series_id) {
        this.series_id = series_id;
    }

    public String getSeries_title() {
        return series_title;
    }

    public void setSeries_title(String series_title) {
        this.series_title = series_title;
    }

    public String getSeries_image() {
        return series_image;
    }

    public void setSeries_image(String series_image) {
        this.series_image = series_image;
    }

    public int getSeries_ep_number() {
        return series_ep_number;
    }

    public void setSeries_ep_number(int series_ep_number) {
        this.series_ep_number = series_ep_number;
    }

    public int getSeries_ep_number_full() {
        return series_ep_number_full;
    }

    public void setSeries_ep_number_full(int series_ep_number_full) {
        this.series_ep_number_full = series_ep_number_full;
    }

    public String getSeries_description() {
        return series_description;
    }

    public void setSeries_description(String series_description) {
        this.series_description = series_description;
    }


    public String getSeries_url() {
        return series_url;
    }

    public void setSeries_url(String series_url) {
        this.series_url = series_url;
    }


        @Override
        public String toString() {
            return "Series{" +
                    "series_id=" + series_id +
                    ", series_title='" + series_title + '\'' +
                    ", series_image='" + series_image + '\'' +
                    ", series_ep_number='" + series_ep_number +
                    ", series_ep_number_full='" + series_ep_number_full +
                    ", series_description='" + series_description + '\'' +
                    ", series_url='" + series_url + '\'' +
                    '}';
        }
    }


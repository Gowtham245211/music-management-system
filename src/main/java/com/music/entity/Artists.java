package com.music.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "artists")
public class Artists {

    public Artists() {

    }

    public Artists(String artistName) {
        this.artistName = artistName;
    }

    @Id
    @SequenceGenerator(name = "artist_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "artist_seq")
    private Integer artistId;

    @Column(name = "artist_name")
    private String artistName;

    @Override
    public String toString() {
        return "Artists{" +
                "artistId=" + artistId +
                ", artistName='" + artistName + '\'' +
                '}';
    }
}

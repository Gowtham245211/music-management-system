package com.music.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "albums")
public class Albums {

    @Id
    @SequenceGenerator(name="album_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "album_seq")
    private Integer albumId;

    @Column(name = "album_name")
    private String albumName;

    @ManyToOne()
    @JoinColumn(
            name = "artist_id",
            referencedColumnName = "artistId"
    )
    private Artists artist;

    @Override
    public String toString() {
        return albumId + albumName + artist;
    }
}

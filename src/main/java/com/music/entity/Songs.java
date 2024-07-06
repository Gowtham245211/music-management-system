package com.music.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "songs")
public class Songs {

    @Id
    @SequenceGenerator(name = "songs_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "songs_seq")
    private Long songId;

    @Column(name = "track_number")
    private String trackNumber;

    @Column(name = "song_title")
    private String songTitle;

    @ManyToOne()
    @JoinColumn(
            name = "album_id",
            referencedColumnName = "albumId"
    )
    private Albums album;
}

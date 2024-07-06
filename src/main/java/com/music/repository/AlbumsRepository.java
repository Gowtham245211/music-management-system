package com.music.repository;

import com.music.entity.Albums;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlbumsRepository extends JpaRepository<Albums, Integer> {

    @Query(
            value = "select concat(art.artistName,' - ', alb.albumName) from Artists art " +
            "join " +
            "Albums alb on art.artistId = alb.artist.artistId where alb.artist.artistId between ?1 and ?2"
    )
    List<String> getAlbumsByArtistIds(int startId, int endId);

    @Query(
            value = "select concat(art.artistName,' - ', count(alb)) from Artists art " +
                    "join " +
                    "Albums alb on art.artistId = alb.artist.artistId group by art.artistId"
    )
    List<String> getArtistsAlbumsCount();

    List<Albums> findByAlbumNameIgnoreCase(String album);
    List<Albums> findByAlbumNameLike(String album);
    List<Albums> findByAlbumNameContaining(String album);
    List<Albums> findByAlbumNameStartingWith(String album);
    List<Albums> findByAlbumNameEndingWith(String album);

    List<Albums> findByArtistArtistId(int artistId);
    List<Albums> findAllByArtistArtistIdGreaterThanOrderByAlbumNameDesc(int artistId);

    Integer countByArtistArtistIdEquals(int artistId);

    @Query(
            value = "select alb.albumId, alb.albumName from Albums alb"
    )
    List<String> findAllAlbums();
}

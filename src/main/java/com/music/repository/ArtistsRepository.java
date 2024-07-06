package com.music.repository;

import com.music.entity.Artists;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistsRepository extends JpaRepository<Artists, Integer> {


}

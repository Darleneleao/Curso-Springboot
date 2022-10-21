package academy.devdojo.springBoot2.repository;

import academy.devdojo.springBoot2.domain.Anime;

import java.util.List;

public interface AnimeRepository {
    List<Anime> listAll();
}

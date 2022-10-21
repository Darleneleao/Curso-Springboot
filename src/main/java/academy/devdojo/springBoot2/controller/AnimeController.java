package academy.devdojo.springBoot2.controller;

import academy.devdojo.springBoot2.domain.Anime;
import academy.devdojo.springBoot2.service.AnimeService;
import academy.devdojo.springBoot2.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("anime")
@Log4j2
@AllArgsConstructor
public class AnimeController{
    private final DateUtil dateUtil;
    private final AnimeService animeService;

    @GetMapping
    public ResponseEntity<List<Anime>> list(){
        log.info(dateUtil.formatLocalDataTimeToDatabaseStyle(LocalDateTime.now()));
        return ResponseEntity.ok(animeService.listAll()) ;
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Anime> findByeId(@PathVariable long id){
        return ResponseEntity.ok(animeService.findById(id)) ;
    }


}

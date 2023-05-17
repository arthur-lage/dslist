package com.arthur.dslist.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arthur.dslist.dto.GameListDTO;
import com.arthur.dslist.dto.GameMinDTO;
import com.arthur.dslist.services.GameListService;
import com.arthur.dslist.services.GameService;

@RestController
@RequestMapping("/api/lists")
public class GameListController {
  private final GameListService gameListService;
  private final GameService gameService;

  public GameListController(GameListService gameListService, GameService gameService) {
    this.gameListService = gameListService;
    this.gameService = gameService;
  }

  @GetMapping
  public List<GameListDTO> findAll() {
    return this.gameListService.findAll();
  }

  @GetMapping("/{listId}/games")
  public List<GameMinDTO> findByList(@PathVariable Long listId) {
    return this.gameService.findByList(listId);
  }
}

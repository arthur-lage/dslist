package com.arthur.dslist.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arthur.dslist.dto.GameListDTO;
import com.arthur.dslist.services.GameListService;

@RestController
@RequestMapping("/api/lists")
public class GameListController {
  private final GameListService gameListService;

  public GameListController(GameListService gameListService) {
    this.gameListService = gameListService;
  }

  @GetMapping
  public List<GameListDTO> findAll() {
    return this.gameListService.findAll();
  }

  @GetMapping("/{id}")
  public GameListDTO findById(@PathVariable Long id) {
    return this.gameListService.findById(id);
  }
}

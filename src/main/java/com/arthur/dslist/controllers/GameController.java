package com.arthur.dslist.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arthur.dslist.dto.GameMinDTO;
import com.arthur.dslist.services.GameService;

@RestController
@RequestMapping("/api/games")
@CrossOrigin(origins = "*")
public class GameController {
  private final GameService gameService;

  public GameController(GameService gameService) {
    this.gameService = gameService;
  }

  @GetMapping
  public List<GameMinDTO> findAll() {
    return this.gameService.findAll();
  }
}

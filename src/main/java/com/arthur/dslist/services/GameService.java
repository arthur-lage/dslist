package com.arthur.dslist.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.arthur.dslist.dto.GameMinDTO;
import com.arthur.dslist.repositories.GameRepository;

@Service
public class GameService {
  private GameRepository gameRepository;

  public GameService(GameRepository gameRepository) {
    this.gameRepository = gameRepository;
  }

  public List<GameMinDTO> findAll() {
    return this.gameRepository.findAll().stream().map(GameMinDTO::new).toList();
  }
}

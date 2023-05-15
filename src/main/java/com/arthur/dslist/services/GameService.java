package com.arthur.dslist.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arthur.dslist.dto.GameDTO;
import com.arthur.dslist.dto.GameMinDTO;
import com.arthur.dslist.repositories.GameRepository;

@Service
public class GameService {
  private GameRepository gameRepository;

  public GameService(GameRepository gameRepository) {
    this.gameRepository = gameRepository;
  }

  @Transactional(readOnly = true)
  public List<GameMinDTO> findAll() {
    return this.gameRepository.findAll().stream().map(GameMinDTO::new).toList();
  }

  @Transactional(readOnly = true)
  public GameDTO findById(Long id) {
    var game = this.gameRepository.findById(id).orElseThrow(RuntimeException::new);
    return new GameDTO(game);
  }
}

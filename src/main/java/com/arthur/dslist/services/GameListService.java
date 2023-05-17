package com.arthur.dslist.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arthur.dslist.dto.GameListDTO;
import com.arthur.dslist.repositories.GameListRepository;

@Service
public class GameListService {
  private final GameListRepository gameListRepository;

  public GameListService(GameListRepository gameListRepository) {
    this.gameListRepository = gameListRepository;
  }

  @Transactional(readOnly = true)
  public List<GameListDTO> findAll() {
    return this.gameListRepository.findAll().stream().map(GameListDTO::new).toList();
  }
}

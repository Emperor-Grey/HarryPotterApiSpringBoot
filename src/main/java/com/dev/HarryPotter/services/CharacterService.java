package com.dev.HarryPotter.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.HarryPotter.models.Character;
import com.dev.HarryPotter.repository.CharacterRepository;

/**
 * CharacterService
 */

@Service
public class CharacterService {

  private CharacterRepository cRepository;

  @Autowired
  public CharacterService(CharacterRepository cRepository) {
    this.cRepository = cRepository;
  }

  public List<Character> getAllCharacter() {
    return cRepository.findAll();
  }

  public Optional<Character> getCharacterById(Integer id) {
    return cRepository.findById(id);
  }

  public Character createCharacter(Character character) {
    return cRepository.save(character);
  }

  public Character updateCharacter(Integer id, Character character) {
    Character c = cRepository.findById(id).orElseThrow();
    c.setName(character.getName());
    c.setRole(character.getRole());
    c.setActor_name(character.getActor_name());

    return cRepository.save(c);
  }

  public void deleteCharacter(Integer id) {
    cRepository.deleteById(id);
  }
}

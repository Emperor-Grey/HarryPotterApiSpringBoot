package com.dev.HarryPotter.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.HarryPotter.models.Character;
import com.dev.HarryPotter.services.CharacterService;

/**
 * characterController
 */

@RestController
@RequestMapping("/api/characters")
public class characterController {

  private CharacterService cService;

  @Autowired
  public characterController(CharacterService cService) {
    this.cService = cService;
  }

  @GetMapping
  public List<Character> getAllCharacters() {
    return cService.getAllCharacter();
  }

  @GetMapping("/{id}")
  public Optional<Character> getCharacterById(@PathVariable Integer id) {
    return cService.getCharacterById(id);
  }

  @PostMapping
  public Character createCharacter(@RequestBody Character character) {
    return cService.createCharacter(character);
  }

  @PutMapping("/{id}")
  public Character updateCharacter(@PathVariable Integer id, @RequestBody Character character) {
    return cService.updateCharacter(id, character);
  }

  @DeleteMapping("/{id}")
  public void deleteCharacter(@PathVariable Integer id) {
    cService.deleteCharacter(id);
  }
}

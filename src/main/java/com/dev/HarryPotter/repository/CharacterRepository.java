package com.dev.HarryPotter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HarryPotter.models.Character;

/**
 * CharacterRepository
 */

@Repository
public interface CharacterRepository extends JpaRepository<Character, Integer> {
}

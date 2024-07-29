package com.dev.HarryPotter.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Character
 */

@Entity
@Table(name = "characters")
public class Character {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "name")
  private String name;

  @Column(name = "role")
  private String role;

  @Column(name = "actor_name")
  private String actor_name;

  public Character() {
  }

  public Character(String name, String role, String actor_name) {
    this.name = name;
    this.role = role;
    this.actor_name = actor_name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getActor_name() {
    return actor_name;
  }

  public void setActor_name(String actor_name) {
    this.actor_name = actor_name;
  }

}

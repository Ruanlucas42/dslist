package com.ruanlucas.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruanlucas.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}

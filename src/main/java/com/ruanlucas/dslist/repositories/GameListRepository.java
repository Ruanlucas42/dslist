package com.ruanlucas.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruanlucas.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}

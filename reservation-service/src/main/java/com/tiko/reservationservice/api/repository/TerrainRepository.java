package com.tiko.reservationservice.api.repository;

import com.tiko.reservationservice.api.entity.Terrain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerrainRepository extends JpaRepository<Terrain, Long> {
}

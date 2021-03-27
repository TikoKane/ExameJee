package com.tiko.reservationservice.api.service;

import com.tiko.reservationservice.api.entity.Terrain;
import com.tiko.reservationservice.api.repository.TerrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TerrainService {
    @Autowired
    private TerrainRepository terrainRepository;

    public List<Terrain> getAllTerrains(){
        return  terrainRepository.findAll();
    }
    public Terrain saveTerrain (Terrain terrain){
        return terrainRepository.save(terrain);
    }

    public Optional<Terrain> getTerrainById(Long id){
        return terrainRepository.findById(id);
    }
}

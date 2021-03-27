package com.tiko.reservationservice.api.controller;

import com.tiko.reservationservice.api.entity.Terrain;
import com.tiko.reservationservice.api.service.TerrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/terrain")
public class TerrainController {

    @Autowired
    private TerrainService terrainService;

    @GetMapping(value ="/all")
    public List<Terrain> findAll(){
        return terrainService.getAllTerrains();
    }

    @PostMapping(value = "/add")
    public Terrain save(@RequestBody Terrain t){
        return terrainService.saveTerrain(t);
    }
}

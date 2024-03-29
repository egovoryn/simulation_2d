package com.egovoryn.actions;

import com.egovoryn.Cell;
import com.egovoryn.WorldMap;
import com.egovoryn.dynamics.Herbivore;

public class HerbivoreSpawnAction extends SpawnAction<Herbivore> {
    @Override
    protected Herbivore spawnEntity(Cell c) {
        return new Herbivore();
    }

    public HerbivoreSpawnAction(WorldMap map) {
        float chanceSpawn = 0.07f;
        super.countTypeOnMap = (int) (map.getSizeMap() * chanceSpawn);
    }
}

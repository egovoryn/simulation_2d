package com.egovoryn.actions;

import com.egovoryn.Cell;
import com.egovoryn.WorldMap;
import com.egovoryn.dynamics.Predator;

public class PredatorSpawnAction extends SpawnAction<Predator> {
    @Override
    protected Predator spawnEntity(Cell c) {
        return new Predator();
    }

    public PredatorSpawnAction(WorldMap map) {
        float chanceSpawn = super.chancesSpawn[0];
        super.countTypeOnMap = (int) (map.getSizeMap() * chanceSpawn);
    }
}

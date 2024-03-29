package com.egovoryn.dynamics;

import com.egovoryn.Cell;
import com.egovoryn.PathFinderAStar;
import com.egovoryn.WorldMap;

public class Predator extends Creature {
    private static final int DAMAGE_DEALT = 2;
    @Override
    public void makeMove(Cell start, WorldMap map) {
        for (Cell neighbor : PathFinderAStar.findNeighbors(start)) {
            if (map.getTypeCell(neighbor) == Herbivore.class) {
                Herbivore herbivore = map.getEntityFromCell(neighbor);
                if (herbivore.healthPoints <= 0) {
                    map.clearCell(neighbor);
                } else {
                    herbivore.healthPoints -= DAMAGE_DEALT;
                }
                satiety++;
                return;
            }
        }
        satiety--;
        super.makeMove(start, map);
    }
}

package com.example.awesomefat.linkedlist;

/**
 * Created by awesomefat on 2/23/16.
 */
public class TOHCore
{
    static TowerFragment tower1 = null;
    static TowerFragment tower2 = null;
    static TowerFragment tower3 = null;
    static boolean buttonPressed = false;

    static void toggleTowerButtons(TowerFragment sourceTower) {
        TowerFragment[] towerCollection = {tower1, tower2, tower3};
        sourceTower.setButtonText("SOURCE");
        for (TowerFragment tower : towerCollection) {
            if (tower != sourceTower) {
                tower.setButtonText("PUSH");
            }
            if (tower == sourceTower)
            {
                boolean buttonPressed = true; //the button was pressed
                tower1.pop();
                tower2.push(tower1);
            }

        }
    }

}

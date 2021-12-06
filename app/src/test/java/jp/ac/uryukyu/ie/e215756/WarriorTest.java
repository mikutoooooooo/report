package jp.ac.uryukyu.ie.e215756;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class WarriorTest {
    @Test
    void attackWithWeponSkillTest() {
        int defaultWarriorAttack = 100;
        Warrior demoWarrior = new Warrior("デモ戦士", 1000, defaultWarriorAttack);
        Enemy demoEnemy = new Enemy("デモスライム", 500, 50);
        

        for (int i = 0; i < 3; i++) {
            int beforeHp = demoEnemy.hitPoint;
            demoWarrior.attackWithWeponSkill(demoEnemy);
            demoEnemy.attack(demoWarrior);
            assertEquals((int)(defaultWarriorAttack * 1.5), beforeHp - demoEnemy.hitPoint);
        }
    }
}
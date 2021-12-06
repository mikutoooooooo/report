import jp.ac.uryukyu.ie.e215756.*;

public class Main {
    public static void main(String[] args){
        Warrior hero = new Warrior("戦士", 10, 5);
        Enemy enemy = new Enemy("スライム", 6, 3);

        System.out.printf("%s vs. %s\n", hero.getName(), enemy.getName());

        int turn = 0;
        while( hero.isdead() == false && enemy.isdead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            hero.attackWithWeponSkill(enemy);
            enemy.attack(hero);
        }
        System.out.println("戦闘終了");
    }
}
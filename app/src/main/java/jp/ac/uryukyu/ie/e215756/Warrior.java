package jp.ac.uryukyu.ie.e215756;

public class Warrior extends Hero{

    public Warrior (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
        
        
    }
    public void attackWithWeponSkill(LivingThings opponent) {
        int damage = (int)(attack * 1.5);
        if (dead == true){
            damage = 0;
        }
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！", name, opponent.getName(), damage);
        opponent.wounded(damage);

        
    }
    
}

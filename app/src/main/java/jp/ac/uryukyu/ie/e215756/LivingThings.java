package jp.ac.uryukyu.ie.e215756;

public class LivingThings {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    
     

    public LivingThings (String name, int hitPoint, int attack) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }

    public boolean isdead(){
        return this.dead;
    }

    public String getName(){
        return this.name;
    }


    
    public void attack(LivingThings opponent){
        
        int damage = (int)(Math.random() * attack);
        if (dead == true){
            damage = 0;
        }
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        opponent.wounded(damage);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }


    
}

package zyugyou1;

public class Main {
    public static void main (String[] args){
        Hero hero = new Hero();
        hero.name = "ミナト";
        hero.hp = 100;
        System.out.println("勇者" + hero.name + "を生み出しました！");

        Matango matango1 = new Matango();
        matango1.hp = 50;
        matango1.suffix = 'A';

        Matango matango2 = new Matango();
        matango2.hp = 48;
        matango2.suffix = 'B';

        hero.slip();
        matango1.run();
        matango2.run();
        hero.run();
    }
}

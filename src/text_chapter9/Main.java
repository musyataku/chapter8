package text_chapter9;

public class Main {
    public static void main(String[] args){
        /*Sword s = new Sword();
        s.name = "炎の剣";
        s.damage = 10;
        Hero h = new Hero();
        h.name = "ミナト";
        h.hp = 100;
        h.sword = s;
        System.out.println("現在の武器は" + h.sword.name);*/

        Hero h1 = new Hero("ミナト");
        //h1.name = "ミナト";
        //h1.hp = 100;
        Hero h2 = new Hero("アサカ");//それぞれでnewしているからh1,h2でそれぞれ別のメモリ領域を確保しているから別の領域を参照させることができる
        //h2.name = "アサカ";
        //h2.hp = 100;
        Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp = 50;
        w.heal(h1);
        w.heal(h2);
        w.heal(h2);
    }
}

package text_chapter9;

public class Hero {
    String name;
    int hp;
    Sword sword;
    public void attack(){
        System.out.println(this.name + "は攻撃した！");
        System.out.println("敵に5ポイントのダメージをあたえた！");
    }
    public Hero(String name){
        this.hp = 100;//hpフィールドを100で初期化。つまりnewされた時の初期値が100になった
        this.name = name;
    }
    public Hero(){
        this.hp = 100;
        this.name = "ダミー";
    }
}


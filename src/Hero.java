public class Hero {

    String name;//名字
    float hp;//血量
    float armor;//护甲
    int moveSpeed;//移速
    int attack;//输出
    float bloodreturn;//回血
    int kills;//击杀数
    int assist;//助攻数
    int money;//金币
    int lastFew;//补刀数
    float attckSpeed;//攻速
    String killSay;//击杀语音
    String bekillSay;//被杀语音


    public void keng() {//坑队友
        System.out.println("坑队友");
    }
    public void addSpeed(int speed){
        //在原来的基础上增加移动速度
        moveSpeed = moveSpeed + speed;
    }

    public float getArmor(){
        return armor;
    }
    public void legendary(){
        //无参数无返回类型
        System.out.println("超神了！");
    }

    public float getHp(){
        //有参数有返回类型float
        return hp;
    }

    public void recovery(float Blood){
        //有参数float，无返回类型,Blood表示回复血量
        hp += Blood;
    }


}

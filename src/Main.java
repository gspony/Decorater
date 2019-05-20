/**
 * @Classname Main
 * @Description 装饰模式代码演示
 * @Author 马维俊
 * @Version V1.0.0
 * @Date 2019/3/4 10:03
 */
public class Main {
    public static void main(String[]args){
        Person person = new Person("小菜");

        System.out.println("第一种装扮：");

        Sneakers pqx = new Sneakers();
        Bigtrouser kk = new Bigtrouser();
        Tshirts dtx = new Tshirts();
        pqx.decorate(person);
        kk.decorate(pqx);
        dtx.decorate(kk);
        dtx.show();

        System.out.println("第二种装扮：");

        LeatherShoes px = new LeatherShoes();
        Tie ld = new Tie();
        Suit xz = new Suit();

        px.decorate(person);
        ld.decorate(px);
        xz.decorate(ld);
        xz.show();
        System.out.println("第三种装扮：");

        Sweater sw = new Sweater();
        Overalls ov = new Overalls();
        Canvas ca = new Canvas();

        sw.decorate(person);
        ov.decorate(sw);
        ca.decorate(ov);
        ca.show();

        


    }


}

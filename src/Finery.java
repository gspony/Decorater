/**
 * @Classname Finery
 * @Description 服装装饰类
 * @Author 马维俊
 * @Version V1.0.0
 * @Date 2019/3/4 10:19
 */
public class Finery extends Person {
    protected Person	component;

    public void decorate(Person component)
    {

        this.component = component;
    }

    public void show()
    {
        if (null != component)
        {
            component.show();
        }
    }
}

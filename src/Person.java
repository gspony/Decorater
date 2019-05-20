/**
 * @Classname Person
 * @Description TODO
 * @Author 马维俊
 * @Version V1.0.0
 * @Date 2019/3/4 10:15
 */
public class Person {
    private String name;
    public  Person(){

    }
    public Person(String name){
       this.name =  name;
    }
    public void show()
    {
        System.out.println("装扮的" + name);
    }
}

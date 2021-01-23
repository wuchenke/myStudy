package lambda.bean;

/**
 * @author 64370
 * @Description
 * @Date 2021/1/17
 */
public class Person {

    private String userName;

    private Integer age;

    public Person() {
    }

    public Person(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}

package collect;

import lombok.Data;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author 64370
 * @Description
 * @Date 2021/1/23
 */
public class Simple {
    public static void main(String[] args) {
        //Stream 处理 List 与 Map 转换
        /*List<People> peopleList = new ArrayList<>(
                Arrays.asList(new People("harry","25"), new People("shire", null)));

        Map<String,People> userNameAndPeopleMap = peopleList.stream().collect(Collectors.toMap(People::getUserName,
                Function.identity(), (v1, v2)->v2));
        System.out.println(userNameAndPeopleMap.toString());

        userNameAndPeopleMap.values().add(new People());
        userNameAndPeopleMap.keySet();
        userNameAndPeopleMap.entrySet().add(null);



        Map<String,String> userNameAndAgeMap = peopleList.stream().collect(Collectors.toMap(People::getUserName, People::getAge,(v1, v2) -> v2));
        System.out.println(userNameAndAgeMap.toString());*/

        /*Collections.singletonList("1").add("o");
        List list = Collections.emptyList();
        List list1 = Collections.EMPTY_LIST;
        list.add("o");*/

        //List subList 方法
        /*List<String> list = new ArrayList<>(Arrays.asList("1","2","3","4"));
        List<String> subList = list.subList(0,2);
        subList.add("555");
        System.out.println(list.toString());
        System.out.println(subList.toString());*/

        List<String> list2 = new ArrayList<>(Arrays.asList("1","2"));
        String[] atrArr = list2.toArray(new String[0]);
        System.out.println(Arrays.toString(atrArr));

        list2.addAll(list2);


    }
}

@Data
class People{
    private String userName;
    private String age;

    public People() {
    }

    public People(String userName, String age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "userName='" + userName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

package chapter11.hashcode;

import java.util.Arrays;
import java.util.List;

public class HashCode {
    public void test(){
        //test1 객체의 값만 같은 경우에는 같은 hashcode를 반환할까?
        Temp temp11 = new Temp(1, 2);
        Temp temp12 = new Temp(1, 2);

        if(temp11.hashCode() == temp12.hashCode()){
            System.out.println("1 equlals!!");
        }
        else{
            System.out.println("1 not!!");
        }
        //일반적인 obejct 타입의 경우 hashcode는 address를 기준으로 hashvalue를 만든다.

        //test2 그럼 collection framework는?
        List<Integer> list = Arrays.asList(1,2,3,45);
        List<Integer> list2 = Arrays.asList(1,2,3,45);
        if(list.hashCode() == list2.hashCode()){
            System.out.println("list equlals!!");
        }
        else{
            System.out.println("list not equals!!");
        }
        //list와 같은 collection framework는 내부에 있는 값 및 순서를 기준으로 hashcode 생성
        //재정의 해 주어야 할 필요는 없다.


        //test3 다른 객체를 포함하는 객체의 hashcode는 어떨까?
        Temp2 temp21 = new Temp2(1, 3 ,list);
        Temp2 temp22 = new Temp2(1, 3, list2);
        if(temp21.hashCode() == temp22.hashCode()){
            System.out.println("2 equlals!!");
        }
        else{
            System.out.println("2 not!!");
        }
        //hashcode를 재정의 해주었음에도 불구하고
        //기본적으로 내부에서 포함하는 객체의 hashcode의 값이 같을 경우에만 같다고 나타난다.
    }
}


class Temp{
    int num1;
    int num2;
    public Temp(){}
    public Temp(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public int hashCode() {
        int c = 31;
        int result = 31;
        result = c * result + Integer.hashCode(num1);
        result = c * result + Integer.hashCode(num2);
        return result;
    }
}

class Temp2{
    int num1;
    int num2;
    List<Integer> list;

    public Temp2(){}
    public Temp2(int num1, int num2, List list){
        this.num1 = num1;
        this.num2 = num2;
        this.list = list;
    }

    @Override
    public int hashCode() {
        int c = 31;
        int result = 31;
        result = c * result + Integer.hashCode(num1);
        result = c * result + Integer.hashCode(num2);
        result = c * result + list.hashCode();
        return result;
    }
}

package com.example.modifier;

class Singleton{
    private static Singleton one;
    private Singleton(){

    }
    public static Singleton getInstance(){
        //return new Singleton(); //private이라도 같은 클래스 안에서는 접근가능하므로 리턴시켜준다
        if(one == null){ //one참조변수에 값이 없으면 생성
            one = new Singleton();
        }
        return one;
    }
}

public class SingletonMain {
    public static void main(String[] args) {
        //Singleton singleton = new Singleton(); //private으로 선언되었기 때문에 에러발생
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1 == s3);
    }
}

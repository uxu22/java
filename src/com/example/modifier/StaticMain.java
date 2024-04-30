package com.example.modifier;

// 1) 멤버변수를 static으로 선언하면 여러 객체가 공유하는 변수입니다.
// 객체 생성하지 않고 클래스이름.static 변수

class Count {
    int a = 0;
    static int b = 0;

}

public class StaticMain {
    public static void main(String[] args) {
        Count c1 = new Count();
        c1.a++;
        c1.b++;

        System.out.println("c1.a = " + c1.a);
        System.out.println("c1.b = " + c1.b);

        Count c2 = new Count();
        c2.a++;
        c2.b++;
        Count.b++; // 클래스 이름.static 변수명

        System.out.println("c2.a = " + c2.a);
        System.out.println("c2.b = " + c2.b);
    //method()가 static으로 선언된 경우 Math.random()
    // 빈번하게 호출될 때 객체생성 없이 사용가능

        Math.random(); //random()은 매개변수가 없는 경우

        //String 을 int 변환

        int c = Integer.parseInt("123");
        System.out.println(c+100);
        // Util 클래스에 있는 static method() => getcuttentDate()
        System.out.println(Util.getCurrentDate("yyyyMMdd"));

    }
}

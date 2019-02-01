package cn.aixwz.test;

public class Test {
    public static void main(String[] args) {
        System.out.println("方法执行前");

        for (int i = 0; i < 10; i++) {
            System.out.println("第"+i+"次！");
        }

        System.out.println("结束！");
    }
}

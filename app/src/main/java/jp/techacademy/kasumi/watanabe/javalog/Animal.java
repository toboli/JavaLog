package jp.techacademy.kasumi.watanabe.javalog;

/**
 * Created by kasu on 2017/05/27.
 */

abstract class Animal {
    // クラス変数
    static String to_jp = "人";
    String name ="";
    int age = 0;


    // コンストラクタ
   public Animal(String name, int age) {
        this.name = name;
       this.age = age;
    }


    abstract public void say();

}

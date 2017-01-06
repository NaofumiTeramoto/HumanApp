package jp.techacademy.naofumi.teramoto.humanapp;

/**
 * Created by tera on 2017/01/06.
 */
abstract class Animal {
    // メンバ変数
    String name;  // 名前
    String hobby; //趣味
    int age;    // 年齢

    abstract public void say();
}

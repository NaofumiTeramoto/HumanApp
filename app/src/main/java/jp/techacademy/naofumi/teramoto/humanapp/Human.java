package jp.techacademy.naofumi.teramoto.humanapp;

/**
 * Created by tera on 2017/01/06.
 */
import android.util.Log;

class Human extends Animal implements Thinkable {

    // コンストラクタ
    public Human(String name, String hobby, int age) {
        this.name = name;
        this.hobby = hobby;
        this.age = age;
    }

    public void say() {
        Log.d("javatest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。");
    }

    @Override
    public void think() {
        Log.d("javatest", "私は" + this.hobby + "について考える。");
    }
}

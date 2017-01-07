package jp.techacademy.naofumi.teramoto.humanapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Human human = new Human("Naofumi", "旅",45);

        human.say();
        human.think();

        Human human2 = new Human("イチロー", "野球",43);

        human2.say();
        human2.think();
    }
}

package com.garkin.laban3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button btnNextToThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Получаем обьект Intent из прошлого активити
        Intent intent = getIntent();
        //Получаем введенное имя с прошлого Активити
        String name = intent.getStringExtra("name");

        //Находим эти кнопки в XML файле с компонентами -  /main/res/layout/activity_main.xml и синхронизируемся
        textView = (TextView) findViewById(R.id.textViewForName);
        btnNextToThree = (Button) findViewById(R.id.btnUser);

        //Присваиваем Кнопке и Лейблу "Строка" + name
        textView.setText("Привет " + name);
        btnNextToThree.setText("На третью страницу," + name );
        btnNextToThree.setOnClickListener(this);
    }

    //Переходим на третье Активити
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
}

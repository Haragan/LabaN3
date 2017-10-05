package com.garkin.laban3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Activity(активити) - это формочка как в C#, в которой мы работаем с компонентами
    //Объявляем кнопку и поля для ввода
    Button btnNext;
    EditText editTextName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Загружаем компоненты из XML - файла
        setContentView(R.layout.activity_main);

        //Находим эти кнопки в XML файле с компонентами -  /main/res/layout/activity_main.xml и синхронизируемся
        editTextName = (EditText) findViewById(R.id.editTextName);
        btnNext = (Button) findViewById(R.id.btnNext);

        //Прикручиваем кнопке метод onClick(View view) вот этого интерфейса implements View.OnClickListener
        //Это означает что когда на кнопку нажмут она сработает, если это не сделать она не сработает
        btnNext.setOnClickListener(this);
    }

    //Вызываем второе активити
    @Override
    public void onClick(View view) {
        //Создание объекта Intent
        Intent intent = new Intent(this, SecondActivity.class);
        //Добавление информации в объект Intent,
        // для получения этой информации в другом Activity (SecondActivity.class)
        intent.putExtra("name", editTextName.getText().toString());
        //Сам переход
        startActivity(intent);
    }
}

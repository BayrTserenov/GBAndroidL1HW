/*

    Создать проект со следующими пользовательскими элементами: TextView, EditText, Button, Switch,
    CheckBox, ToggleButton. Для работы использовать LinearLayout. Использовать различные шрифты,
    цвета, размеры, прочие атрибуты.
    Создать ещё один макет (если не получается, то проект) с несколькими EditText, где использовать
     атрибут inputType: text, textPersonName, phone, number, textPassword, textEmailAddress
     и другие значения.
    Добавить в проект элемент CalendarView.
    *Разобраться, что такое параметр ems.

*Дополнительное задание
* Разобраться, что такое параметр ems.
 */


package com.example.gbandroidl1hw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.buttonGoTo2screen);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this, SecondActivity.class);
               startActivity(intent);

            }
        });
    }
}
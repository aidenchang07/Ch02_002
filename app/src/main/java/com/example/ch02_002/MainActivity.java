package com.example.ch02_002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);

        /**
         * 數字按鍵宣告
         */
        Button button_zero = findViewById(R.id.button_zero);
        Button button_one = findViewById(R.id.button_one);
        Button button_two = findViewById(R.id.button_two);
        Button button_three = findViewById(R.id.button_three);
        Button button_four = findViewById(R.id.button_four);
        Button button_five = findViewById(R.id.button_five);
        Button button_six = findViewById(R.id.button_six);
        Button button_seven = findViewById(R.id.button_seven);
        Button button_eight = findViewById(R.id.button_eight);
        Button button_nine = findViewById(R.id.button_nine);

        /**
         * 加減乘除&刪除&等號&清除&小數點宣告
         */
        Button button_add = findViewById(R.id.button_add);
        Button button_minus = findViewById(R.id.button_minus);
        Button button_times = findViewById(R.id.button_times);
        Button button_division = findViewById(R.id.button_division);
        Button button_delete = findViewById(R.id.button_delete);
        Button button_clear = findViewById(R.id.button_clear);
        Button button_equals = findViewById(R.id.button_equals);
        Button button_point = findViewById(R.id.button_point);

        /**
         * 數字按鍵監聽器
         */
        button_zero.setOnClickListener(this);
        button_one.setOnClickListener(this);
        button_two.setOnClickListener(this);
        button_three.setOnClickListener(this);
        button_four.setOnClickListener(this);
        button_five.setOnClickListener(this);
        button_six.setOnClickListener(this);
        button_seven.setOnClickListener(this);
        button_eight.setOnClickListener(this);
        button_nine.setOnClickListener(this);

        /**
         * 加減乘除&刪除&等號&清除&小數點監聽器
         */
        button_add.setOnClickListener(this);
        button_minus.setOnClickListener(this);
        button_times.setOnClickListener(this);
        button_division.setOnClickListener(this);
        button_delete.setOnClickListener(this);
        button_clear.setOnClickListener(this);
        button_equals.setOnClickListener(this);
        button_point.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch (id){
            case R.id.button_zero:
                Log.i("Button","button_zero");
                break;
            case R.id.button_one:
                Log.i("Button","button_one");
                break;
            case R.id.button_two:
                Log.i("Button","button_two");
                break;
            case R.id.button_three:
                Log.i("Button","button_three");
                break;
            case R.id.button_four:
                Log.i("Button","button_four");
                break;
            case R.id.button_five:
                Log.i("Button","button_five");
                break;
            case R.id.button_six:
                Log.i("Button","button_six");
                break;
            case R.id.button_seven:
                Log.i("Button","button_seven");
                break;
            case R.id.button_eight:
                Log.i("Button","button_eight");
                break;
            case R.id.button_nine:
                Log.i("Button","button_nine");
                break;

            case R.id.button_add:
                Log.i("Button","button_add");
                break;
            case R.id.button_minus:
                Log.i("Button","button_minus");
                break;
            case R.id.button_times:
                Log.i("Button","button_times");
                break;
            case R.id.button_division:
                Log.i("Button","button_division");
                break;
            case R.id.button_delete:
                Log.i("Button","button_delete");
                break;
            case R.id.button_clear:
                Log.i("Button","button_clear");
                break;
            case R.id.button_equals:
                Log.i("Button","button_equals");
                break;
            case R.id.button_point:
                Log.i("Button","button_point");
                break;
        }

    }
}

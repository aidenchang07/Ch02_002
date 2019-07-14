package com.example.ch02_002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 加: 1
     * 減: 2
     * 乘: 3
     * 除: 4
     */
    int statement = 0;
    int resultFlag = 0;
    double previousNum = 0;
    double lastNum = 0;
    StringBuilder stringBuilder = new StringBuilder();

    private TextView arithmeticTextView,
            resultTextView;

    private Button button_zero,
            button_one,
            button_two,
            button_three,
            button_four,
            button_five,
            button_six,
            button_seven,
            button_eight,
            button_nine;

    private Button button_add,
            button_minus,
            button_times,
            button_division,
            button_delete,
            button_clear,
            button_equals,
            button_point;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getView();
        setEvent();

    }

    public void getView(){
        /**
         * 數字按鍵宣告
         */
        button_zero = findViewById(R.id.button_zero);
        button_one = findViewById(R.id.button_one);
        button_two = findViewById(R.id.button_two);
        button_three = findViewById(R.id.button_three);
        button_four = findViewById(R.id.button_four);
        button_five = findViewById(R.id.button_five);
        button_six = findViewById(R.id.button_six);
        button_seven = findViewById(R.id.button_seven);
        button_eight = findViewById(R.id.button_eight);
        button_nine = findViewById(R.id.button_nine);

        /**
         * 加減乘除&刪除&等號&清除&小數點宣告
         */
        button_add = findViewById(R.id.button_add);
        button_minus = findViewById(R.id.button_minus);
        button_times = findViewById(R.id.button_times);
        button_division = findViewById(R.id.button_division);
        button_delete = findViewById(R.id.button_delete);
        button_clear = findViewById(R.id.button_clear);
        button_equals = findViewById(R.id.button_equals);
        button_point = findViewById(R.id.button_point);

        arithmeticTextView = findViewById(R.id.arithmeticTextView);
        resultTextView = findViewById(R.id.resultTextView);
    }

    public void setEvent() {
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
    protected void onStart() {
        super.onStart();
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch (id){
            case R.id.button_zero:
                if (resultFlag == 0) {
                    stringBuilder.append(getResources().getText(R.string.zero));
                    arithmeticTextView.setText(stringBuilder);
                } else if (resultFlag == 1) {
                    //沒事
                } else {
                    Toast.makeText(this, "button_zero例外狀況(resultFlag)", Toast.LENGTH_SHORT).show();
                }
                Log.i("Button","button_zero");
                break;
            case R.id.button_one:
                if (resultFlag == 0) {
                    stringBuilder.append(getResources().getText(R.string.one));
                    arithmeticTextView.setText(stringBuilder);
                } else if (resultFlag == 1) {
                    //沒事
                } else {
                    Toast.makeText(this, "button_one例外狀況(resultFlag)", Toast.LENGTH_SHORT).show();
                }
                Log.i("Button","button_one");
                break;
            case R.id.button_two:
                if (resultFlag == 0) {
                    stringBuilder.append(getResources().getText(R.string.two));
                    arithmeticTextView.setText(stringBuilder);
                } else if (resultFlag == 1) {
                    //沒事
                } else {
                    Toast.makeText(this, "button_two例外狀況(resultFlag)", Toast.LENGTH_SHORT).show();
                }
                Log.i("Button","button_two");
                break;
            case R.id.button_three:
                if (resultFlag == 0) {
                    stringBuilder.append(getResources().getText(R.string.three));
                    arithmeticTextView.setText(stringBuilder);
                } else if (resultFlag == 1) {
                    //沒事
                } else {
                    Toast.makeText(this, "button_three例外狀況(resultFlag)", Toast.LENGTH_SHORT).show();
                }
                Log.i("Button","button_three");
                break;
            case R.id.button_four:
                if (resultFlag == 0) {
                    stringBuilder.append(getResources().getText(R.string.four));
                    arithmeticTextView.setText(stringBuilder);
                } else if (resultFlag == 1) {
                    //沒事
                } else {
                    Toast.makeText(this, "button_four例外狀況(resultFlag)", Toast.LENGTH_SHORT).show();
                }
                Log.i("Button","button_four");
                break;
            case R.id.button_five:
                if (resultFlag == 0) {
                    stringBuilder.append(getResources().getText(R.string.five));
                    arithmeticTextView.setText(stringBuilder);
                } else if (resultFlag == 1) {
                    //沒事
                } else {
                    Toast.makeText(this, "button_five例外狀況(resultFlag)", Toast.LENGTH_SHORT).show();
                }
                Log.i("Button","button_five");
                break;
            case R.id.button_six:
                if (resultFlag == 0) {
                    stringBuilder.append(getResources().getText(R.string.six));
                    arithmeticTextView.setText(stringBuilder);
                } else if (resultFlag == 1) {
                    //沒事
                } else {
                    Toast.makeText(this, "button_six例外狀況(resultFlag)", Toast.LENGTH_SHORT).show();
                }
                Log.i("Button","button_six");
                break;
            case R.id.button_seven:
                if (resultFlag == 0) {
                    stringBuilder.append(getResources().getText(R.string.seven));
                    arithmeticTextView.setText(stringBuilder);
                } else if (resultFlag == 1) {
                    //沒事
                } else {
                    Toast.makeText(this, "button_seven例外狀況(resultFlag)", Toast.LENGTH_SHORT).show();
                }
                Log.i("Button","button_seven");
                break;
            case R.id.button_eight:
                if (resultFlag == 0) {
                    stringBuilder.append(getResources().getText(R.string.eight));
                    arithmeticTextView.setText(stringBuilder);
                } else if (resultFlag == 1) {
                    //沒事
                } else {
                    Toast.makeText(this, "button_eight例外狀況(resultFlag)", Toast.LENGTH_SHORT).show();
                }
                Log.i("Button","button_eight");
                break;
            case R.id.button_nine:
                if (resultFlag == 0) {
                    stringBuilder.append(getResources().getText(R.string.nine));
                    arithmeticTextView.setText(stringBuilder);
                } else if (resultFlag == 1) {
                    //沒事
                } else {
                    Toast.makeText(this, "button_nine例外狀況(resultFlag)", Toast.LENGTH_SHORT).show();
                }
                Log.i("Button","button_nine");
                break;


            case R.id.button_add:
                if (resultFlag == 0) {
                    if (stringBuilder.length() > 0 && statement == 0) {
                        previousNum = Double.parseDouble(stringBuilder.toString());
                        arithmeticTextView.setText(R.string.empty);
                        stringBuilder = new StringBuilder();
                        statement = 1;
                    } else if (stringBuilder.length() == 0 || statement > 0) {
                        //沒事
                    } else {
                        Toast.makeText(this, "例外狀況", Toast.LENGTH_SHORT).show();
                    }
                } else if (resultFlag == 1) {
                    //沒事
                } else {
                    Toast.makeText(this, "button_add例外狀況(resultFlag)", Toast.LENGTH_SHORT).show();
                }
                //測試輸入的數值是否已存入previousNum
                //Toast.makeText(this, String.valueOf(previousNum), Toast.LENGTH_SHORT).show();
                Log.i("Button","button_add");
                break;
            case R.id.button_minus:
                if (resultFlag == 0) {
                    if (stringBuilder.length() > 0 && statement == 0) {
                        previousNum = Double.parseDouble(arithmeticTextView.getText().toString());
                        arithmeticTextView.setText(R.string.empty);
                        stringBuilder = new StringBuilder();
                        statement = 2;
                    } else if (stringBuilder.length() == 0 || statement > 0) {
                        //沒事
                    } else {
                        Toast.makeText(this, "例外狀況", Toast.LENGTH_SHORT).show();
                    }
                } else if (resultFlag == 1) {
                    //沒事
                } else {
                    Toast.makeText(this, "button_minus例外狀況(resultFlag)", Toast.LENGTH_SHORT).show();
                }
                Log.i("Button","button_minus");
                break;
            case R.id.button_times:
                if (resultFlag == 0) {
                    if (stringBuilder.length() > 0 && statement == 0) {
                        previousNum = Double.parseDouble(arithmeticTextView.getText().toString());
                        arithmeticTextView.setText(R.string.empty);
                        stringBuilder = new StringBuilder();
                        statement = 3;
                    } else if (stringBuilder.length() == 0 || statement > 0) {
                        //沒事
                    } else {
                        Toast.makeText(this, "例外狀況", Toast.LENGTH_SHORT).show();
                    }
                } else if (resultFlag == 1) {
                    //沒事
                } else {
                    Toast.makeText(this, "button_times例外狀況(resultFlag)", Toast.LENGTH_SHORT).show();
                }
                Log.i("Button","button_times");
                break;
            case R.id.button_division:
                if (resultFlag == 0) {
                    if (stringBuilder.length() > 0 && statement == 0) {
                        previousNum = Double.parseDouble(arithmeticTextView.getText().toString());
                        arithmeticTextView.setText(R.string.empty);
                        stringBuilder = new StringBuilder();
                        statement = 4;
                    } else if (stringBuilder.length() == 0 || statement > 0) {
                        //沒事
                    } else {
                        Toast.makeText(this, "button_division例外狀況(previousNum && statement)", Toast.LENGTH_SHORT).show();
                    }
                } else if (resultFlag == 1) {
                    //沒事
                } else {
                    Toast.makeText(this, "button_division例外狀況(resultFlag)", Toast.LENGTH_SHORT).show();
                }
                Log.i("Button","button_division");
                break;
            case R.id.button_delete:
                if (resultFlag == 0) {
                    if (statement == 0) {
                        if (stringBuilder.length() >= 1) {
                            /**
                             * 長度超過1繼續刪除
                             */
                            stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
                            arithmeticTextView.setText(stringBuilder);
                        } else if (stringBuilder.length() == 0) {
                            /**
                             * 長度等於0就再次設定長度為0
                             */
                            stringBuilder.setLength(0);
                            arithmeticTextView.setText(stringBuilder);
                        } else {
                            Toast.makeText(this, "button_delete例外狀況(stringBuilder.length)", Toast.LENGTH_SHORT).show();
                        }
                    } else if (statement > 0) {
                        //沒事
                    } else {
                        Toast.makeText(this, "button_delete例外狀況(statement)", Toast.LENGTH_SHORT).show();
                    }
                } else if (resultFlag == 1) {
                    Toast.makeText(this, "請使用CLR清除", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "button_delete例外狀況(resultFlag)", Toast.LENGTH_SHORT).show();
                }
                Log.i("Button","button_delete");
                break;
            case R.id.button_clear:
                arithmeticTextView.setText(R.string.empty);
                resultTextView.setText(R.string.empty);
                statement = 0;
                resultFlag = 0;
                previousNum = 0;
                lastNum = 0;
                stringBuilder = new StringBuilder();
                Log.i("Button","button_clear");
                break;
            case R.id.button_equals:
                if (resultFlag == 0) {
                    if (statement == 0) {
                        //沒事
                    } else if (statement > 0) {
                        lastNum = Double.parseDouble(stringBuilder.toString());
                        stringBuilder = new StringBuilder();
                        resultFlag = 1;
                        if (statement == 1) {
                            /**
                             * 加法
                             */
                            stringBuilder.append(previousNum + lastNum);
                        } else if (statement == 2) {
                            /**
                             * 減法
                             */
                            stringBuilder.append(previousNum - lastNum);
                        } else if (statement == 3) {
                            /**
                             * 乘法
                             */
                            stringBuilder.append(previousNum * lastNum);
                        } else if (statement == 4) {
                            /**
                             * 除法
                             */
                            stringBuilder.append(previousNum / lastNum);
                        } else {
                            Toast.makeText(this, "button_equals例外狀況(加減乘除)", Toast.LENGTH_SHORT).show();
                        }
                        statement = 0;
                        resultTextView.setText(stringBuilder);
                    } else {
                        Toast.makeText(this, "button_equals例外狀況(statement)", Toast.LENGTH_SHORT).show();
                    }
                } else if (resultFlag == 1) {
                    //沒事
                } else {
                    Toast.makeText(this, "button_equals例外狀況(resultFlag)", Toast.LENGTH_SHORT).show();
                }
                Log.i("Button","button_equals");
                break;
            case R.id.button_point:
                if (resultFlag == 0) {
                    stringBuilder.append(getResources().getText(R.string.point));
                    arithmeticTextView.setText(stringBuilder);
                } else if (resultFlag == 1) {
                    //沒事
                } else {
                    Toast.makeText(this, "button_point例外狀況(resultFlag)", Toast.LENGTH_SHORT).show();
                }
                Log.i("Button","button_point");
                break;
        }
    }
}

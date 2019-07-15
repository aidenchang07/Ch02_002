package com.example.ch02_002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 尚未有計算符號: statement=0
     * 加: statement=1
     * 減: statement=2
     * 乘: statement=3
     * 除: statement=4
     */
    int statement = 0;

    /**
     * 尚未算出結果: resultFlag=0
     * 已算出結果: resultFlag=1
     */
    int resultFlag = 0;

    /**
     * 尚未點擊小數點: pointFlag=0
     * 已點擊小數點: pointFlag=1
     */
    int pointFlag = 0;

    //保存左邊的數
    BigDecimal previousBD;

    //保存右邊的數
    BigDecimal lastBD;

    //保存計算後的數
    BigDecimal resultBD;

    //小數點精確位數
    int scale = 20;

    //字串暫存器
    StringBuilder stringBuilder = new StringBuilder();
    StringBuilder stringBuilderTV = new StringBuilder();

    //TextView宣告
    private TextView arithmeticTextView,
            resultTextView;

    //Button宣告
    private Button button_zero,
            button_one,
            button_two,
            button_three,
            button_four,
            button_five,
            button_six,
            button_seven,
            button_eight,
            button_nine,
            button_add,
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

        //使用func宣告，比較簡潔清楚
        getView();
        setEvent();

    }

    //getView宣告都放在一起
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
        button_minus = findViewById(R.id.button_subtract);
        button_times = findViewById(R.id.button_multiply);
        button_division = findViewById(R.id.button_divide);
        button_delete = findViewById(R.id.button_delete);
        button_clear = findViewById(R.id.button_clear);
        button_equals = findViewById(R.id.button_equals);
        button_point = findViewById(R.id.button_point);

        arithmeticTextView = findViewById(R.id.arithmeticTextView);
        resultTextView = findViewById(R.id.resultTextView);
    }

    //setEvent事件都放在一起
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
    public void onClick(View view) {
        //取得所有按鍵的ID
        int id = view.getId();

        switch (id){
            case R.id.button_zero:
                /**
                 * 如果還未計算出結果(resultFlag==0)，才可以使用按鍵;
                 * 如果已計算出結果(resultFlag==1)，不做任何事情;
                 */
                if (resultFlag == 0) {
                    stringBuilder.append(getResources().getText(R.string.zero));
                    stringBuilderTV.append(getResources().getText(R.string.zero));
                    arithmeticTextView.setText(stringBuilderTV);
                }
                Log.i("Button","button_zero");
                break;
            case R.id.button_one:
                /**
                 * 如果還未計算出結果(resultFlag==0)，才可以使用按鍵;
                 * 如果已計算出結果(resultFlag==1)，不做任何事情;
                 */
                if (resultFlag == 0) {
                    stringBuilder.append(getResources().getText(R.string.one));
                    stringBuilderTV.append(getResources().getText(R.string.one));
                    arithmeticTextView.setText(stringBuilderTV);
                }
                Log.i("Button","button_one");
                break;
            case R.id.button_two:
                /**
                 * 如果還未計算出結果(resultFlag==0)，才可以使用按鍵;
                 * 如果已計算出結果(resultFlag==1)，不做任何事情;
                 */
                if (resultFlag == 0) {
                    stringBuilder.append(getResources().getText(R.string.two));
                    stringBuilderTV.append(getResources().getText(R.string.two));
                    arithmeticTextView.setText(stringBuilderTV);
                }
                Log.i("Button","button_two");
                break;
            case R.id.button_three:
                /**
                 * 如果還未計算出結果(resultFlag==0)，才可以使用按鍵;
                 * 如果已計算出結果(resultFlag==1)，不做任何事情;
                 */
                if (resultFlag == 0) {
                    stringBuilder.append(getResources().getText(R.string.three));
                    stringBuilderTV.append(getResources().getText(R.string.three));
                    arithmeticTextView.setText(stringBuilderTV);
                }
                Log.i("Button","button_three");
                break;
            case R.id.button_four:
                /**
                 * 如果還未計算出結果(resultFlag==0)，才可以使用按鍵;
                 * 如果已計算出結果(resultFlag==1)，不做任何事情;
                 */
                if (resultFlag == 0) {
                    stringBuilder.append(getResources().getText(R.string.four));
                    stringBuilderTV.append(getResources().getText(R.string.four));
                    arithmeticTextView.setText(stringBuilderTV);
                }
                Log.i("Button","button_four");
                break;
            case R.id.button_five:
                /**
                 * 如果還未計算出結果(resultFlag==0)，才可以使用按鍵;
                 * 如果已計算出結果(resultFlag==1)，不做任何事情;
                 */
                if (resultFlag == 0) {
                    stringBuilder.append(getResources().getText(R.string.five));
                    stringBuilderTV.append(getResources().getText(R.string.five));
                    arithmeticTextView.setText(stringBuilderTV);
                }
                Log.i("Button","button_five");
                break;
            case R.id.button_six:
                /**
                 * 如果還未計算出結果(resultFlag==0)，才可以使用按鍵;
                 * 如果已計算出結果(resultFlag==1)，不做任何事情;
                 */
                if (resultFlag == 0) {
                    stringBuilder.append(getResources().getText(R.string.six));
                    stringBuilderTV.append(getResources().getText(R.string.six));
                    arithmeticTextView.setText(stringBuilderTV);
                }
                Log.i("Button","button_six");
                break;
            case R.id.button_seven:
                /**
                 * 如果還未計算出結果(resultFlag==0)，才可以使用按鍵;
                 * 如果已計算出結果(resultFlag==1)，不做任何事情;
                 */
                if (resultFlag == 0) {
                    stringBuilder.append(getResources().getText(R.string.seven));
                    stringBuilderTV.append(getResources().getText(R.string.seven));
                    arithmeticTextView.setText(stringBuilderTV);
                }
                Log.i("Button","button_seven");
                break;
            case R.id.button_eight:
                /**
                 * 如果還未計算出結果(resultFlag==0)，才可以使用按鍵;
                 * 如果已計算出結果(resultFlag==1)，不做任何事情;
                 */
                if (resultFlag == 0) {
                    stringBuilder.append(getResources().getText(R.string.eight));
                    stringBuilderTV.append(getResources().getText(R.string.eight));
                    arithmeticTextView.setText(stringBuilderTV);
                }
                Log.i("Button","button_eight");
                break;
            case R.id.button_nine:
                /**
                 * 如果還未計算出結果(resultFlag==0)，才可以使用按鍵;
                 * 如果已計算出結果(resultFlag==1)，不做任何事情;
                 */
                if (resultFlag == 0) {
                    stringBuilder.append(getResources().getText(R.string.nine));
                    stringBuilderTV.append(getResources().getText(R.string.nine));
                    arithmeticTextView.setText(stringBuilderTV);
                }
                Log.i("Button","button_nine");
                break;

                //-----------------------------------------------------------------

            case R.id.button_add:
                /**
                 * 如果還未計算出結果(resultFlag==0)，才可以使用按鍵;
                 * 如果已計算出結果(resultFlag==1)，則禁止使用任何按鍵;
                 */
                if (resultFlag == 0) {
                    /**
                     * 如果還未輸入運算符號(statement == 0)，即可新增運算符號;
                     * 如果已設定運算符號且非加號(statement > 0 && statement != 1)，即可更改運算符號;
                     */
                    if (statement == 0) {
                        //有輸入才能使用運算符號
                        if (stringBuilder.length() > 0) {
                            //設定為加法
                            statement = 1;
                            //開啟使用小數點
                            pointFlag = 0;
                            try {
                                previousBD = new BigDecimal(stringBuilder.toString());
                            } catch (Exception e) {
                                //任何例外都將數字設為0
                                previousBD = new BigDecimal(BigDecimal.ZERO.toString());
                            }
                            stringBuilderTV = stringBuilder;
                            stringBuilderTV.append(getResources().getText(R.string.add));
                            arithmeticTextView.setText(stringBuilderTV);
                            //清空左邊的數
                            stringBuilder = new StringBuilder();
                        }
                    } else if (statement > 0 && statement != 1) {
                        //還未輸入下一個數字前，可更改運算符號
                        if (stringBuilder.length() == 0) {
                            statement = 1;
                            //刪除最後一位字元(運算符號)
                            stringBuilderTV.delete(stringBuilderTV.length() - 1, stringBuilderTV.length());
                            stringBuilderTV.append(getResources().getText(R.string.add));
                            arithmeticTextView.setText(stringBuilderTV);
                        }
                    }
                }
                Log.i("Button","button_add");
                break;
            case R.id.button_subtract:
                /**
                 * 如果還未計算出結果(resultFlag==0)，才可以使用按鍵;
                 * 如果已計算出結果(resultFlag==1)，則禁止使用任何按鍵;
                 */
                if (resultFlag == 0) {
                    /**
                     * 如果還未輸入運算符號(statement == 0)，即可新增運算符號;
                     * 如果已設定運算符號且非減號(statement > 0 && statement != 2)，即可更改運算符號;
                     */
                    if (statement == 0) {
                        if (stringBuilder.length() > 0) {
                            //設定為減法
                            statement = 2;
                            //開啟使用小數點
                            pointFlag = 0;
                            try {
                                previousBD = new BigDecimal(stringBuilder.toString());
                            } catch (Exception e) {
                                //任何例外都將數字設為0
                                previousBD = new BigDecimal(BigDecimal.ZERO.toString());
                            }
                            stringBuilderTV = stringBuilder;
                            stringBuilderTV.append(getResources().getText(R.string.subtract));
                            arithmeticTextView.setText(stringBuilderTV);
                            stringBuilder = new StringBuilder();
                        }
                    } else if (statement > 0 && statement != 2) {
                        //還未輸入下一個數字前，可更改運算符號
                        if (stringBuilder.length() == 0) {
                            statement = 2;
                            //刪除最後一位字元(運算符號)
                            stringBuilderTV.delete(stringBuilderTV.length() - 1, stringBuilderTV.length());
                            stringBuilderTV.append(getResources().getText(R.string.subtract));
                            arithmeticTextView.setText(stringBuilderTV);
                        }
                    }
                }
                Log.i("Button","button_minus");
                break;
            case R.id.button_multiply:
                /**
                 * 如果還未計算出結果(resultFlag==0)，才可以使用按鍵;
                 * 如果已計算出結果(resultFlag==1)，則禁止使用任何按鍵;
                 */
                if (resultFlag == 0) {
                    /**
                     * 如果還未輸入運算符號(statement == 0)，即可新增運算符號;
                     * 如果已設定運算符號且非乘號(statement > 0 && statement != 3)，即可更改運算符號;
                     */
                    if (statement == 0) {
                        if (stringBuilder.length() > 0) {
                            //設定為乘法
                            statement = 3;
                            //開啟使用小數點
                            pointFlag = 0;
                            try {
                                previousBD = new BigDecimal(stringBuilder.toString());
                            } catch (Exception e) {
                                //任何例外都將數字設為0
                                previousBD = new BigDecimal(BigDecimal.ZERO.toString());
                            }
                            stringBuilderTV = stringBuilder;
                            stringBuilderTV.append(getResources().getText(R.string.multiply));
                            arithmeticTextView.setText(stringBuilderTV);
                            stringBuilder = new StringBuilder();
                        }
                    } else if (statement > 0 && statement != 3) {
                        //還未輸入下一個數字前，可更改運算符號
                        if (stringBuilder.length() == 0) {
                            statement = 3;
                            //刪除最後一位字元(運算符號)
                            stringBuilderTV.delete(stringBuilderTV.length() - 1, stringBuilderTV.length());
                            stringBuilderTV.append(getResources().getText(R.string.multiply));
                            arithmeticTextView.setText(stringBuilderTV);
                        }
                    }
                }
                Log.i("Button","button_times");
                break;
            case R.id.button_divide:
                /**
                 * 如果還未計算出結果(resultFlag==0)，才可以使用按鍵;
                 * 如果已計算出結果(resultFlag==1)，則禁止使用任何按鍵;
                 */
                if (resultFlag == 0) {
                    /**
                     * 如果還未輸入運算符號(statement == 0)，即可新增運算符號;
                     * 如果已設定運算符號且非除號(statement > 0 && statement != 4)，即可更改運算符號;
                     */
                    if (statement == 0) {
                        if (stringBuilder.length() > 0) {
                            //設定為除法
                            statement = 4;
                            //開啟使用小數點
                            pointFlag = 0;
                            try {
                                previousBD = new BigDecimal(stringBuilder.toString());
                            } catch (Exception e) {
                                //任何例外都將數字設為0
                                previousBD = new BigDecimal(BigDecimal.ZERO.toString());
                            }
                            stringBuilderTV = stringBuilder;
                            stringBuilderTV.append(getResources().getText(R.string.divide));
                            arithmeticTextView.setText(stringBuilderTV);
                            stringBuilder = new StringBuilder();
                        }
                    } else if (statement > 0 && statement != 4) {
                        //還未輸入下一個數字前，可更改運算符號
                        if (stringBuilder.length() == 0) {
                            statement = 4;
                            //刪除最後一位字元(運算符號)
                            stringBuilderTV.delete(stringBuilderTV.length() - 1, stringBuilderTV.length());
                            stringBuilderTV.append(getResources().getText(R.string.divide));
                            arithmeticTextView.setText(stringBuilderTV);
                        }
                    }
                }
                Log.i("Button","button_division");
                break;
            case R.id.button_delete:
                /**
                 * 如果還未計算出結果(resultFlag==0)，才可以使用按鍵;
                 * 如果已計算出結果(resultFlag==1)，則提示使用CLR清除資料;
                 */
                if (resultFlag == 0) {
                    if (stringBuilder.length() > 0) {
                        if (stringBuilder.substring(stringBuilder.length() - 1, stringBuilder.length()).equals(getResources().getText(R.string.point))) {
                            //開啟使用小數點
                            pointFlag = 0;
                        }
                        //刪除最後一位字元(數字)
                        stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
                        stringBuilderTV.delete(stringBuilderTV.length() - 1, stringBuilderTV.length());
                        arithmeticTextView.setText(stringBuilderTV);
                    }
                } else if (resultFlag == 1) {
                    Toast.makeText(this, R.string.DEL_CLR, Toast.LENGTH_SHORT).show();
                }
                Log.i("Button","button_delete");
                break;
            case R.id.button_clear:
                statement = 0;
                resultFlag = 0;
                pointFlag = 0;
                previousBD = new BigDecimal(BigDecimal.ZERO.toString());
                lastBD = new BigDecimal(BigDecimal.ZERO.toString());
                resultBD = new BigDecimal(BigDecimal.ZERO.toString());
                arithmeticTextView.setText(R.string.empty);
                resultTextView.setText(R.string.empty);
                stringBuilder = new StringBuilder();
                stringBuilderTV = new StringBuilder();
                Log.i("Button","button_clear");
                break;
            case R.id.button_equals:
                /**
                 * 如果還未計算出結果(resultFlag==0)，才可以使用按鍵;
                 * 如果已計算出結果(resultFlag==1)，則禁止使用任何按鍵;
                 */
                if (resultFlag == 0) {
                    //開啟禁止使用任何按鍵
                    resultFlag = 1;
                    try {
                        lastBD = new BigDecimal(stringBuilder.toString());
                    } catch (Exception e) {
                        //任何例外都將數字設為0
                        lastBD = new BigDecimal(getResources().getText(R.string.zero).toString());
                    }
                    /**
                     * 請使用compareTo!!!
                     * equals(), 有比較scale位數
                     * new BigDecimal("0").equals(BigDecimal.ZERO) // true
                     * new BigDecimal("0.00").equals(BigDecimal.ZERO) // false!
                     *
                     * compareTo(), 沒比較scale位數
                     * new BigDecimal("0").compareTo(BigDecimal.ZERO) == 0 // true
                     * new BigDecimal("0.00").compareTo(BigDecimal.ZERO) == 0 // true
                     */
                    if (statement == 4 && lastBD.compareTo(BigDecimal.ZERO) == 0) {
                        ////顯示結果(除數不得為零)
                        resultTextView.setText(R.string.not_zero);
                    } else {
                        if (statement == 1) {
                            //加法
                            resultBD = previousBD.add(lastBD);
                        } else if (statement == 2) {
                            //減法
                            resultBD = previousBD.subtract(lastBD);
                        } else if (statement == 3) {
                            //乘法
                            resultBD = previousBD.multiply(lastBD);
                        } else if (statement == 4) {
                            //除法
                            //ROUND_HALF_UP四捨五入
                            resultBD = previousBD.divide(lastBD, scale, BigDecimal.ROUND_HALF_UP);
                        } else {
                            //無任何運算式
                            resultBD = lastBD;
                        }
                        /**
                         * 顯示結果;
                         * stripTrailingZeros: 去尾數0
                         * toPlainString: 轉String
                         */
                        resultTextView.setText(resultBD.stripTrailingZeros().toPlainString());
                    }
                }
                Log.i("Button","button_equals");
                break;
            case R.id.button_point:
                /**
                 * 如果還未計算出結果(resultFlag==0)，才可以使用按鍵;
                 * 如果已計算出結果(resultFlag==1)，則禁止使用任何按鍵;
                 */
                if (resultFlag == 0 ) {
                    if (pointFlag == 0) {
                        //停止使用小數點
                        pointFlag = 1;
                        stringBuilder.append(getResources().getText(R.string.point));
                        stringBuilderTV.append(getResources().getText(R.string.point));
                        arithmeticTextView.setText(stringBuilderTV);
                    }
                }
                Log.i("Button","button_point");
                break;
        }
    }
}

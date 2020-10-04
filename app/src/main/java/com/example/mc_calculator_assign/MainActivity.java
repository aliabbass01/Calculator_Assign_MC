package com.example.mc_calculator_assign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    EditText enterValueBox;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button btnClear, btnDiv, btnMul, btnSub, btnAdd, btnDot, btnEqual;
    double value1, value2;
    boolean addition, subtraction, multiplication, division, decimal;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeFields();

        btnClear.setOnLongClickListener(new View.OnLongClickListener()
        {
            @Override
            public boolean onLongClick(View v)
            {
                enterValueBox.setText("");
                return true;
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (enterValueBox.getText().length() != 0)
                {
                    String s = enterValueBox.getText().toString();
                    s = s.substring(0, s.length() - 1);
                    enterValueBox.setText(s);
                }
            }
        });

        btn0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                setValueInEditText(0);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                setValueInEditText(1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                setValueInEditText(2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                setValueInEditText(3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                setValueInEditText(4);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                setValueInEditText(5);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                setValueInEditText(6);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                setValueInEditText(7);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                setValueInEditText(8);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                setValueInEditText(9);
            }
        });


        btnAdd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                performAddition();
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                performSubtraction();
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                performMultiplication();
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                performDivision();
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                getRequiredAnswer();
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                performDot();
            }
        });

    }

    private void initializeFields()
    {
        btn0 = (Button) findViewById(R.id.button_0);
        btn1 = (Button) findViewById(R.id.button_1);
        btn2 = (Button) findViewById(R.id.button_2);
        btn3 = (Button) findViewById(R.id.button_3);
        btn4 = (Button) findViewById(R.id.button_4);
        btn5 = (Button) findViewById(R.id.button_5);
        btn6 = (Button) findViewById(R.id.button_6);
        btn7 = (Button) findViewById(R.id.button_7);
        btn8 = (Button) findViewById(R.id.button_8);
        btn9 = (Button) findViewById(R.id.button_9);
        btnClear = (Button) findViewById(R.id.button_clear);
        btnDiv = (Button) findViewById(R.id.button_div);
        btnMul = (Button) findViewById(R.id.button_mul);
        btnSub = (Button) findViewById(R.id.button_sub);
        btnAdd = (Button) findViewById(R.id.button_add);
        btnDot = (Button) findViewById(R.id.button_dot);
        btnEqual = (Button) findViewById(R.id.button_equal);

        enterValueBox = (EditText) findViewById(R.id.enter_value_box);
    }

    private void setValueInEditText(int i)
    {
        enterValueBox.setText(enterValueBox.getText() + "" + i);
    }

    private void performDot()
    {
        if (decimal)
        {

        }
        else
        {
            enterValueBox.setText(enterValueBox.getText() + ".");
            decimal = true;
        }
    }

    private void performAddition()
    {
        if (enterValueBox.getText().length() != 0)
        {
            value1 = Double.parseDouble(enterValueBox.getText() + "");
            addition = true;
            decimal = false;
            enterValueBox.setText(null);
        }
    }

    private void performSubtraction()
    {
        if (enterValueBox.getText().length() != 0)
        {
            value1 = Double.parseDouble(enterValueBox.getText() + "");
            subtraction = true;
            decimal = false;
            enterValueBox.setText(null);
        }
    }

    private void performMultiplication()
    {
        if (enterValueBox.getText().length() != 0)
        {
            value1 = Double.parseDouble(enterValueBox.getText() + "");
            multiplication = true;
            enterValueBox.setText(null);
        }
    }

    private void performDivision()
    {
        if (enterValueBox.getText().length() != 0)
        {
            value1 = Double.parseDouble(enterValueBox.getText() + "");
            division = true;
            enterValueBox.setText(null);
        }
    }

    private void getRequiredAnswer()
    {
        value2 = Double.parseDouble(enterValueBox.getText() + "");
        if (addition == true)
        {
            double ans = value1 + value2;
            enterValueBox.setText(ans + "");
            addition = false;
        }

        if (subtraction == true)
        {
            double ans = value1 - value2;
            enterValueBox.setText(ans + "");
            subtraction = false;
        }

        if (multiplication == true)
        {
            double ans = value1 * value2;
            enterValueBox.setText(ans + "");
            multiplication = false;
        }

        if (division == true)
        {
            if (value2 != 0)
            {
                double ans = value1 / value2;
                enterValueBox.setText(ans + "");
                division = false;
            }
            else
            {
                enterValueBox.setText("Undefined value");
            }
        }
    }
}
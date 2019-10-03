package akashsarkar188.simplecalculator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    MaterialButton one, two, three, four, five, six, seven, eight, nine, zero, plus, minus, multiply, divide, clear, equal;
    TextView mView;
    boolean numberEntered = false, expressionEntered = false, equalsClicked = false;
    String expression = "";
    long result = 0;
    String[] nums = new String[100];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        clear = findViewById(R.id.clear);
        equal = findViewById(R.id.equal);

        mView = findViewById(R.id.mainTxt);
        mView.setText("");

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mView.setTextColor(getResources().getColor(android.R.color.black));
                mView.setText(String.format("%s0", mView.getText().toString()));
                numberEntered = true;
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mView.setTextColor(getResources().getColor(android.R.color.black));
                mView.setText(String.format("%s1", mView.getText().toString()));
                numberEntered = true;
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mView.setTextColor(getResources().getColor(android.R.color.black));
                mView.setText(String.format("%s2", mView.getText().toString()));
                numberEntered = true;
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mView.setTextColor(getResources().getColor(android.R.color.black));
                mView.setText(String.format("%s3", mView.getText().toString()));
                numberEntered = true;
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mView.setTextColor(getResources().getColor(android.R.color.black));
                mView.setText(String.format("%s4", mView.getText().toString()));
                numberEntered = true;
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mView.setTextColor(getResources().getColor(android.R.color.black));
                mView.setText(String.format("%s5", mView.getText().toString()));
                numberEntered = true;
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mView.setTextColor(getResources().getColor(android.R.color.black));
                mView.setText(String.format("%s6", mView.getText().toString()));
                numberEntered = true;
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mView.setTextColor(getResources().getColor(android.R.color.black));
                mView.setText(String.format("%s7", mView.getText().toString()));
                numberEntered = true;
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mView.setTextColor(getResources().getColor(android.R.color.black));
                mView.setText(String.format("%s8", mView.getText().toString()));
                numberEntered = true;
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mView.setTextColor(getResources().getColor(android.R.color.black));
                mView.setText(String.format("%s9", mView.getText().toString()));
                numberEntered = true;
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mView.setTextColor(getResources().getColor(android.R.color.black));
                mView.setText("");
                numberEntered = false;
                expressionEntered = false;
                equalsClicked = false;
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!numberEntered) {
                    Toast.makeText(MainActivity.this, "Enter A number first", Toast.LENGTH_LONG).show();
                } else {
                    mView.setTextColor(getResources().getColor(android.R.color.black));
                    mView.setText(String.format("%s+", mView.getText().toString()));
                    expressionEntered = true;
                    expression = "plus";
                    result = 0;
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!numberEntered) {
                    Toast.makeText(MainActivity.this, "Enter A number first", Toast.LENGTH_LONG).show();
                } else {
                    mView.setTextColor(getResources().getColor(android.R.color.black));
                    mView.setText(String.format("%s-", mView.getText().toString()));
                    expressionEntered = true;
                    expression = "-";
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!numberEntered) {
                    Toast.makeText(MainActivity.this, "Enter A number first", Toast.LENGTH_LONG).show();
                } else {
                    mView.setTextColor(getResources().getColor(android.R.color.black));
                    mView.setText(String.format("%s/", mView.getText().toString()));
                    expressionEntered = true;
                    expression = "/";
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!numberEntered) {
                    Toast.makeText(MainActivity.this, "Enter A number first", Toast.LENGTH_LONG).show();
                } else {
                    mView.setTextColor(getResources().getColor(android.R.color.black));
                    mView.setText(String.format("%s*", mView.getText().toString()));
                    expressionEntered = true;
                    expression = "mul";
                    result = 1;
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!numberEntered || !expressionEntered) {
                    Toast.makeText(MainActivity.this, "No value to compute", Toast.LENGTH_LONG).show();
                } else if (equalsClicked) {
                    mView.setText("");
                    numberEntered = false;
                    expressionEntered = false;
                    equalsClicked = false;
                } else {
                    equalsClicked = true;
                    Log.e("sss", "onClick: " + expression);
                    try {
                        if (expression.equals("plus")) {
                            nums = mView.getText().toString().split("\\+");
                        } else if (expression.equals("mul")) {
                            nums = mView.getText().toString().split("\\*");
                        } else {
                            nums = mView.getText().toString().split(expression);
                        }
                        long temp = 0;
                        for (int i = 0; i < nums.length; i++) {
                            String num = nums[i];
                            switch (expression) {

                                case "plus":
                                    result = result + Long.parseLong(num);
                                    Log.d("sss", "onClick: " + expression + result + num);
                                    break;
                                case "-":
                                    temp = Long.parseLong(nums[0]);
                                    result = temp - Long.parseLong(num);
                                    Log.d("sss", "onClick: " + expression + result);
                                    break;
                                case "mul":
                                    result = result * Long.parseLong(num);
                                    Log.d("sss", "onClick: " + expression + result);
                                    break;
                                case "/":
                                    temp = Long.parseLong(nums[0]);
                                    result = temp / Long.parseLong(num);
                                    Log.d("sss", "onClick: " + expression + result);
                                    break;
                            }
                        }
                        mView.setText(String.format("%s\n%s", mView.getText().toString(), result));
                    } catch (Exception e) {
                        Log.e("equalsException", "onClick: ", e);
                        mView.setText(String.format("%s\n%s", mView.getText().toString(), e.getLocalizedMessage()));
                        mView.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                    }
                }
            }
        });
    }
}

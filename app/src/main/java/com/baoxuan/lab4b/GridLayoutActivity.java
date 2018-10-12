package com.baoxuan.lab4b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GridLayoutActivity extends AppCompatActivity {

    private String calcDisplayText = "";
    private boolean equalButtonPressed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);
    }

    public void calcButtonOnClicked(View view) {
        TextView calculatorDisplay = findViewById(R.id.calcDisplay);
        Button button = (Button) view;
        String buttonText = button.getText().toString();
        System.out.println(equalButtonPressed);
        if (equalButtonPressed) {
            calcDisplayText = "";
            calculatorDisplay.setText(calcDisplayText);
            equalButtonPressed = false;
        }
        switch (buttonText.toLowerCase()) {
            case "c":
                calcDisplayText = "";
                break;
            case "de":
                if (calcDisplayText != null && calcDisplayText.length() > 0) {
                    calcDisplayText = calcDisplayText.substring(0, calcDisplayText.length()-1);
                }
                break;

            case "=":
                equalButtonPressed = true;
                System.out.println("inside case, equalbuttonpressed = " + equalButtonPressed);
                if (calcDisplayText != null && calcDisplayText.length() > 0) {
                    if (calcDisplayText.contains("+")) {
                        String parts[] = calcDisplayText.split("\\+");
                        int num1 = Integer.parseInt(parts[0]);
                        int num2 = Integer.parseInt(parts[1]);
                        calcDisplayText += "=";
                        calcDisplayText = Integer.toString(num1+num2);
                    }
                    else if (calcDisplayText.contains("-")) {
                        String parts[] = calcDisplayText.split("-");
                        int num1 = Integer.parseInt(parts[0]);
                        int num2 = Integer.parseInt(parts[1]);
                        calcDisplayText = Integer.toString(num1-num2);
                    }
                    else if (calcDisplayText.contains("*")) {
                        String parts[] = calcDisplayText.split("\\*");
                        int num1 = Integer.parseInt(parts[0]);
                        int num2 = Integer.parseInt(parts[1]);
                        calcDisplayText = Integer.toString(num1*num2);
                    }
                    else if (calcDisplayText.contains("/")) {
                        String parts[] = calcDisplayText.split("/");
                        int num1 = Integer.parseInt(parts[0]);
                        int num2 = Integer.parseInt(parts[1]);
                        calcDisplayText = Integer.toString(num1/num2);
                    }
                    else if (calcDisplayText.contains("%")) {
                        String parts[] = calcDisplayText.split("%");
                        int num1 = Integer.parseInt(parts[0]);
                        int num2 = Integer.parseInt(parts[1]);
                        calcDisplayText = Integer.toString(num1%num2);
                    }
                    else if (calcDisplayText.contains("^")) {
                        String parts[] = calcDisplayText.split("\\^");
                        int num1 = Integer.parseInt(parts[0]);
                        int num2 = Integer.parseInt(parts[1]);
                        calcDisplayText = Double.toString(Math.pow(num1, num2));
                    }
                }
                break;

            case "+":
                if (calcDisplayText != null && calcDisplayText.length() > 0 && calcDisplayText.charAt(calcDisplayText.length()-1) == '+')
                    break;
                else
                    calcDisplayText += buttonText;
                break;

            case "-":
                if (calcDisplayText != null && calcDisplayText.length() > 0 && calcDisplayText.charAt(calcDisplayText.length()-1) == '-')
                    break;
                else
                    calcDisplayText += buttonText;
                break;

            case "*":
                if (calcDisplayText != null && calcDisplayText.length() > 0 && calcDisplayText.charAt(calcDisplayText.length()-1) == '*')
                    break;
                else
                    calcDisplayText += buttonText;
                break;

            case "/":
                if (calcDisplayText != null && calcDisplayText.length() > 0 && calcDisplayText.charAt(calcDisplayText.length()-1) == '/')
                    break;
                else
                    calcDisplayText += buttonText;
                break;

            case "%":
                if (calcDisplayText != null && calcDisplayText.length() > 0 && calcDisplayText.charAt(calcDisplayText.length()-1) == '%')
                    break;
                else
                    calcDisplayText += buttonText;
                break;

            case "^":
                if (calcDisplayText != null && calcDisplayText.length() > 0 && calcDisplayText.charAt(calcDisplayText.length()-1) == '^')
                    break;
                else
                    calcDisplayText += buttonText;
                break;

            case "home":
                finish();
                break;
            default:
                calcDisplayText += buttonText;
                break;
        }
        calculatorDisplay.setText(calcDisplayText);
    }
}

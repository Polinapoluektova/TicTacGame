package com.example.tictacgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends  ManuActivity {

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    String zero, cross;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero = "0";
        cross="X";

        button1 =  findViewById(R.id.button1);
        button2 =  findViewById(R.id.button2);
        button3 =  findViewById(R.id.button3);
        button4 =  findViewById(R.id.button4);
        button5 =  findViewById(R.id.button5);
        button6 =  findViewById(R.id.button6);
        button7 =  findViewById(R.id.button7);
        button8 =  findViewById(R.id.button8);
        button9 =  findViewById(R.id.button9);
        textView = findViewById(R.id.textView);

    }

    public void clcBtn1(View view) {
        if (player==1) {
            button1.setText(cross);
            player=2;
        } else {
            button1.setText(zero);
            player=1;
        }
        isPlayerWinner();
    }
   // holder.username.setText(users.getUsername());

    public void clcBtn2(View view) {

        if (player==1) {
            button2.setText(cross);
            player=2;
        } else {
            button2.setText(zero);
            player=1;
        }
        isPlayerWinner();
    }


    public void clcBtn3(View view) {

        if (player==1) {
            button3.setText(cross);
            player=2;
        } else {
            button3.setText(zero);
            player=1;
        }
        isPlayerWinner();
    }
    public void clcBtn4(View view) {

        if (player==1) {
            button4.setText(cross);
            player=2;
        } else {
            button4.setText(zero);
            player=1;
        }
        isPlayerWinner();
    }
    public void clcBtn5(View view) {

        if (player==1) {
            button5.setText(cross);
            player=2;
        } else{
            button5.setText(zero);
            player=1;
        }
        isPlayerWinner();
    }
    public void clcBtn6(View view) {

        if (player==1) {
            button6.setText(cross);
            player=2;
        } else {
            button6.setText(zero);
            player=1;
        }
        isPlayerWinner();
    }
    public void clcBtn7(View view) {

        if (player==1) {
            button7.setText(cross);
            player=2;
        } else {
            button7.setText(zero);
            player=1;
        }
        isPlayerWinner();
    }
    public void clcBtn8(View view) {

        if (player==1) {
            button8.setText(cross);
            player=2;
        }else {
            button8.setText(zero);
            player=1;
        }
        isPlayerWinner();
    }
    public void clcBtn9(View view) {

        if (player==1) {
            button9.setText(cross);
            player=2;
        } else {
            button9.setText(zero);
            player=1;
        }
        isPlayerWinner();
    }

    public void isPlayerWinner () {
        // проверка победы X
        if ((button1.getText()==cross && button2.getText()==cross && button3.getText()==cross) || (button4.getText()==cross && button5.getText()==cross && button6.getText()==cross) || (button7.getText()==cross && button8.getText()==cross && button9.getText()==cross) // строки
                || (button1.getText()==cross && button5.getText()==cross && button9.getText()==cross) || (button3.getText()==cross && button5.getText()==cross && button7.getText()==cross) // диаганали
        || (button1.getText()==cross && button4.getText()==cross && button7.getText()==cross) || (button2.getText()==cross && button5.getText()==cross && button8.getText()==cross) || (button3.getText()==cross && button6.getText()==cross && button9.getText()==cross)){ // столбцы
            textView.setText("Поздравляю с победой!)))");
        }

        // проверка победы 0
        else if ((button1.getText()==zero && button2.getText()==zero && button3.getText()==zero) || (button4.getText()==zero && button5.getText()==zero && button6.getText()==zero) || (button7.getText()==zero && button8.getText()==zero && button9.getText()==zero) // строки
                || (button1.getText()==zero && button5.getText()==zero && button9.getText()==zero) || (button3.getText()==zero && button5.getText()==zero && button7.getText()==zero) // диаганали
                || (button1.getText()==zero && button4.getText()==zero && button7.getText()==zero) || (button2.getText()==zero && button5.getText()==zero && button8.getText()==zero) || (button3.getText()==zero && button6.getText()==zero && button9.getText()==zero)){ // столбцы
            textView.setText("Поздравляю с победой!)))");
        } else if(button1 != null && button2 != null && button3 != null && button4 != null && button5 != null  && button6 != null
                && button8 != null && button9 != null) {
            textView.setText("Ничья!)))");
        }
    }
}
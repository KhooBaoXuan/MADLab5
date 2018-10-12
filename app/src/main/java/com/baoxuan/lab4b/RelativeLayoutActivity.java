package com.baoxuan.lab4b;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RelativeLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
    }

    public void backToHome(View view) {
        EditText editText = findViewById(R.id.editText);
        Intent backHome = new Intent(this, MainActivity.class);
        backHome.putExtra("name",editText.getText().toString());
        setResult(RESULT_OK, backHome);
        finish();
    }
}

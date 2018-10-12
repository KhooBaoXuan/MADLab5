package com.baoxuan.lab4b;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCLickedRelativeLayout (View view) {
        Intent RelativeActivity = new Intent(this, RelativeLayoutActivity.class);
        startActivityForResult(RelativeActivity, 1);
    }

    public void onCLickedConstraintLayout (View view) {
        Intent ConstraintActivity = new Intent(this, ConstraintLayoutActivity.class);
        startActivityForResult(ConstraintActivity, 1);
    }

    public void onCLickedGridLayout (View view) {
        Intent GridActivity = new Intent(this, GridLayoutActivity.class);
        startActivityForResult(GridActivity, 1);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                String strName = data.getStringExtra("name");
                Toast.makeText(this, "Welcome Home! "+strName, Toast.LENGTH_SHORT).show();
            }
        }
    }
}

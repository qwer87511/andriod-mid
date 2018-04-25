package com.example.ntutcsie.app01_105590036;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected EditText mEdtScore;
    protected TextView mTxtGrade;
    protected Button mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdtScore = (EditText) findViewById(R.id.editText);
        mTxtGrade = (TextView) findViewById(R.id.textGrade);
        mBtn = (Button) findViewById(R.id.button);

        mBtn.setOnClickListener(btnOnClick);
    }

    protected View.OnClickListener btnOnClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            String strGrade = getString(R.string.grade);
            int iScore = Integer.parseInt(mEdtScore.getText().toString());
            letterGrade letterGrade0 = new letterGrade();

            String result = letterGrade0.getGrade(iScore);
            if(result.equals("X"))
                mTxtGrade.setText(getString(R.string.inputError));
            else
                mTxtGrade.setText(strGrade + result);
        }
    };
}

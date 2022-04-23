package com.example.devsufy;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cpp,java,python,ruby,matlab;
    Button btn;

    public void clickMe (View view) {
        cpp = (CheckBox) findViewById(R.id.cpp);
        java = (CheckBox)findViewById(R.id.java);
        python = (CheckBox)findViewById(R.id.python);
        ruby = (CheckBox)findViewById(R.id.ruby);
        matlab = (CheckBox)findViewById(R.id.matlab);

        String str = "Selected Languages: \n";

        if(cpp.isChecked())
            str=str+"C++ \n";
        if(java.isChecked())
            str=str+"Java \n";
        if(python.isChecked())
            str=str+"Python \n";
        if(ruby.isChecked())
            str=str+"Ruby \n";
        if(matlab.isChecked())
            str=str+"Matlab \n";

        Toast.makeText(this, str, Toast.LENGTH_LONG).show();

    }

                     @Override
                     protected void onCreate(Bundle savedInstanceState) {
                           super.onCreate(savedInstanceState);
                                setContentView(R.layout.activity_main);



    }

}

package ru.mirea.shunyaev.buttonclicker;

import static android.widget.Toast.LENGTH_SHORT;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textViewSt;
    private Button bntWhoAmI;
    private CheckBox checkBox;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewSt = findViewById(R.id.textViewSt);
        bntWhoAmI = findViewById(R.id.button);
        checkBox = findViewById(R.id.checkBox);


        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkBox.setText("Text was changed");
                textViewSt.setText("My number on the list №12");
            }
        };
        bntWhoAmI.setOnClickListener(oclBtnWhoAmI);
    }

    public void onButClick(View view) {
        Toast.makeText(this, "Это сделал не я!", Toast.LENGTH_SHORT).show();
    }

}
package com.shimmita.simpledialog;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
Button button_dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_dialog=findViewById(R.id.buton_show_dialog);

        button_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                functionCallDialog();
            }
        });
    }

    private void functionCallDialog() {

        CreationDialogSimple creationDialogSimple=new CreationDialogSimple();
        creationDialogSimple.show(getSupportFragmentManager(),"Anything String Can be null too");
    }
}
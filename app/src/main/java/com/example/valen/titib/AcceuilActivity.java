package com.example.valen.titib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class AcceuilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil);
        Button b = (Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               toConnexion();
            }
        });
        Button b2 = (Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                toCreation();
            }
        });
    }

    private void toCreation() {
        //TO DO mettre l'activitee de conenxion
        //Intent intent = new Intent(this, this.class);
        //startActivity(intent);
    }

    private void toConnexion(){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}

package dsa.eetac.upc.edu.minim2dsa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.editText);
    }

    public void nextactivity(View v){  //funció per passar el username a la Activity2
        Intent intent = new Intent (getApplicationContext(),Activity2.class);
        intent.putExtra("username",(Serializable)username);
        startActivityForResult(intent,100);
    }



}







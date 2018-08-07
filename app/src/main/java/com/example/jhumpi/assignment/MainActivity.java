package com.example.jhumpi.assignment;

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
    public void openProject(View view){
        if(view.getId()==R.id.bp1){
            Intent intent = new Intent(this,Project_1.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.bp2){
            Intent intent = new Intent(this,Project_2.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.bp3){
            Toast.makeText(this,"Button_3",Toast.LENGTH_SHORT).show();
        }
        else if(view.getId()==R.id.bp4){
            Toast.makeText(this,"Button_4",Toast.LENGTH_SHORT).show();
        }
    }
}

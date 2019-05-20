package com.example.gwen.apptwittear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.twitter.sdk.android.tweetcomposer.TweetComposer;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    String mensaje="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(EditText)findViewById(R.id.editTextTwit);
        button=(Button)findViewById(R.id.buttonTwit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mensaje=editText.getText().toString();
                TweetComposer.Builder builder = new TweetComposer.Builder(MainActivity.this)
                        .text(mensaje);
                builder.show();
            }
        });



    }




}

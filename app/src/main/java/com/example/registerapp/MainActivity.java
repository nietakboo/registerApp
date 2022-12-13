package com.example.registerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button displayBtn=(Button) findViewById(R.id.displayBtn);
        displayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editEmail = (EditText) findViewById(R.id.editEmail);
                EditText editPassword = (EditText) findViewById(R.id.editPassword);
                EditText repeatPassword = (EditText) findViewById(R.id.repeatPassword);
                TextView display = (TextView) findViewById(R.id.display);
                String email = editEmail.getText().toString();
                int password1 = Integer.parseInt(editPassword.getText().toString());
                int password2 = Integer.parseInt(repeatPassword.getText().toString());

                if (password1 != password2) {
                    display.setText("Hasła się różnią");
                } else if (!email.contains("@")) {
                    display.setText("Nieprawidłowy adres email.");
                } else
                    display.setText("Witaj " + email);


            };
    });
}
}
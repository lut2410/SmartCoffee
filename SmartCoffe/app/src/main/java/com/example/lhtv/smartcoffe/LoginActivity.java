package com.example.lhtv.smartcoffe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lhtv.smartcoffe.home.HomeActivity;

public class LoginActivity extends AppCompatActivity {

    private String emailBoss = "vule@gmail.com";
    private String passBoss = "123";
    private String emailClient = "quyen@gmail.com";
    private String passClient = "123";

    private EditText lbEmail;
    private EditText lbPassWord;
    private Button mBtnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, WelcomeActivity.class));
                finish();
            }
        });
        mBtnLogin = (Button) findViewById(R.id.btn_login_activity);
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitForm();
            }
        });

        lbEmail = (EditText) findViewById(R.id.lb_email);
        lbPassWord = (EditText) findViewById(R.id.lb_password);
    }

    private void submitForm(){
        String email = lbEmail.getText().toString();
        String password = lbPassWord.getText().toString();

        if(email.equals(emailBoss) && password.equals(passBoss)){
            Toast.makeText(this, "Đăng nhập thành công !", Toast.LENGTH_SHORT).show();
            Intent a = new Intent(LoginActivity.this, HomeActivity.class);
//            Bundle b = new Bundle();
//            b.putInt("position",1);
//            a.putExtra("key",b);
            Instance.userType = 1;
            startActivity(a);
        }else {
            if(email.equals(emailClient) && password.equals(passClient)){
                Toast.makeText(this, "Đăng nhập thành công !", Toast.LENGTH_SHORT).show();
                Intent a = new Intent(LoginActivity.this, HomeActivity.class);
//                Bundle b = new Bundle();
//                b.putInt("position",0);
//                a.putExtra("key",b);
                Instance.userType = 0;
                startActivity(a);
            }else {
                Toast.makeText(this, "Email hoặc Password không đúng !", Toast.LENGTH_SHORT).show();
            }
        }
    }
}

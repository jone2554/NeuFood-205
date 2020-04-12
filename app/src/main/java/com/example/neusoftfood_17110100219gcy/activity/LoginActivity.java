package com.example.neusoftfood_17110100219gcy.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
;import com.example.neusoftfood_17110100219gcy.R;
import com.example.neusoftfood_17110100219gcy.beans.UserBean;
import com.example.neusoftfood_17110100219gcy.listener.RetrofitListener;
import com.example.neusoftfood_17110100219gcy.model.UserModel;


public class LoginActivity extends AppCompatActivity implements RetrofitListener {
    private EditText username, userpass;
    private Button btndl,btnd2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initViews();
    }

    private void initViews() {
        username = findViewById(R.id.etuser);
        userpass = findViewById(R.id.etpass);
        btndl = findViewById(R.id.button);
        btnd2 = findViewById(R.id.button2);
        btndl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().trim().equals("")||userpass.getText().toString().trim().equals("")){
                    Toast.makeText(LoginActivity.this, "用户名和密码不能为空", Toast.LENGTH_SHORT).show();
                }
                else{
                    login();
                }
            }
        });
        btnd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });
    }
    void register(){
        Intent intent=new Intent(this,RegActivity.class);
        this.startActivity(intent);
    }
    public void login()
    {
        UserModel userModel = new UserModel();
        userModel.userLogin(username.getText().toString().trim(), userpass.getText().toString().trim(),this);
    }
   /* @Override
    public void onSuccess(UserBean userId, int flag) {

        if (userId.getUser_id()=="0"||userId.getUser_id()==null) {
            Toast.makeText(LoginActivity.this, "用户名或密码错误", Toast.LENGTH_SHORT).show();
        } else {
            //saveUser(userId.getUser_id());
            Toast.makeText(LoginActivity.this, "登录成功id="+userId.getUser_id(), Toast.LENGTH_SHORT).show();
        }
    }*/

    @Override
    public void onSuccess(Object o, int flag) {
        if(((UserBean)o).getUser_id().equals("0"))
            Toast.makeText(LoginActivity.this, "登录失败", Toast.LENGTH_SHORT).show();
        else Toast.makeText(LoginActivity.this, "登录成功,id是"+((UserBean)o).getUser_id(), Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onFail() {
        Toast.makeText(LoginActivity.this, "网络错误", Toast.LENGTH_SHORT).show();
    }
   /* public void saveUser(int user_id) {
        SharedPreferences sharedPreferences = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();//获取编辑器
        editor.putString("username", username.getText().toString());
        int userid = Integer.parseInt(user_id.toString());
        editor.putInt("user_id", userid);
        editor.putString("userpass", userpass.getText().toString());
        editor.commit();//提交修改
    }*/
}

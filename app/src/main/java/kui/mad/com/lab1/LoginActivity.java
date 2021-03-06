package kui.mad.com.lab1;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import static kui.mad.com.lab1.R.id.login;
import static kui.mad.com.lab1.R.id.username;

public class LoginActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);

        Button lgnButton = (Button) findViewById(R.id.login);
        lgnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(LoginActivity.this,HomeActivity.class);
                login.putExtra("username",username.getText().toString());
                startActivity(login);
            }
        });

        Button caButton = (Button) findViewById(R.id.ca);
        caButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent createAccount = new Intent(LoginActivity.this,SignUpActivity.class);
                startActivity(createAccount);
            }
        });
    }

}

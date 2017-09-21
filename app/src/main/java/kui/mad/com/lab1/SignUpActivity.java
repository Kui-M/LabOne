package kui.mad.com.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    EditText fname;
    EditText lname;
    EditText email;
    EditText phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       fname= (EditText) findViewById(R.id.fname);
        lname= (EditText) findViewById(R.id.lname);
        email= (EditText)findViewById(R.id.email);
        phone=(EditText)findViewById(R.id.phone);

        Button signUp = (Button) findViewById(R.id.signup);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signUp = new Intent(SignUpActivity.this,HomeActivity.class);
                signUp.putExtra("fname",fname.getText().toString());
                signUp.putExtra("lname",lname.getText().toString());
                signUp.putExtra("email",email.getText().toString());
                signUp.putExtra("phone",phone.getText().toString());
                startActivity(signUp);
            }
        });

        }
    }



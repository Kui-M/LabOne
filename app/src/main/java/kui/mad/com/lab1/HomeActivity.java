package kui.mad.com.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView usernameTV;
    TextView fnameTV;
    TextView lnameTV;
    TextView emailTV;
    TextView phoneTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        usernameTV=(TextView)findViewById(R.id.username);
        fnameTV= (TextView)findViewById(R.id.fnameH);
        lnameTV= (TextView)findViewById(R.id.lnameH);
        emailTV= (TextView)findViewById(R.id.emailH);
        phoneTV= (TextView)findViewById(R.id.phoneH);
        Intent intent = getIntent();

        String user = intent.getStringExtra("username");
        String fname = intent.getStringExtra("fname");
        String lname = intent.getStringExtra("lname");
        String email = intent.getStringExtra("email");
        String phone = intent.getStringExtra("phone");


       usernameTV.setText(user);
        fnameTV.setText(fname);
        lnameTV.setText(lname);
        emailTV.setText(email);
        phoneTV.setText(phone);

    }

}

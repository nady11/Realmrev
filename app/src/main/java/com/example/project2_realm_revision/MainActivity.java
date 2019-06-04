package com.example.project2_realm_revision;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {

    EditText user_id,username,lastname;
    Button save,view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user_id=(EditText) findViewById(R.id.user_id);
        username=(EditText) findViewById(R.id.username);
        lastname=(EditText) findViewById(R.id.lastname);
        save=(Button) findViewById(R.id.save);
        view=(Button) findViewById(R.id.view);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Realm realm = Realm.getDefaultInstance();

                Integer id= Integer.valueOf(user_id.getText().toString());
                String user=username.getText().toString();
                String last=lastname.getText().toString();


                realm.beginTransaction();

                Student student1=realm.createObject(Student.class);

                student1.setUserid(id);
                student1.setUsername(user);
                student1.setLastname(last);


               realm.commitTransaction();

                Toast.makeText(getApplicationContext(), " Student Saved Successfully.", Toast.LENGTH_SHORT).show();


            }
        });
    }

    public void view(View view) {
        Intent views=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(views);
    }
}

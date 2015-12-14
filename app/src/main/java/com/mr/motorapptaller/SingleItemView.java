package com.mr.motorapptaller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SingleItemView extends AppCompatActivity implements View.OnClickListener {
    TextView txtname;
    String name;
    private Button fin, post;
    private EditText coment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_item_view);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        fab.hide();*/

        // Retrieve data from MainActivity on item click event
        Intent i = getIntent();

        // Get the name
        name = i.getStringExtra("name");

        // Locate the TextView in singleitemview.xml
        txtname = (TextView) findViewById(R.id.name);

        // Load the text into the TextView
        txtname.setText(name);

        fin = (Button) findViewById(R.id.finBtn);
        fin.setOnClickListener(this);
        post = (Button) findViewById(R.id.pospBtn);
        post.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        comentar();
    }

    public void comentar() {
        String comentarioStr;
        coment = (EditText) findViewById(R.id.comentEditText);

        comentarioStr = coment.getText().toString();

        if (comentarioStr.equals("")) {
            Toast.makeText(getApplicationContext(),
                    "No ha introducido ningún comentario",
                    Toast.LENGTH_LONG).show();
        } else {

        }
    }
}

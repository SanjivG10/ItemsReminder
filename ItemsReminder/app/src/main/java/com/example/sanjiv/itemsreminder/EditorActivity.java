package com.example.sanjiv.itemsreminder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class EditorActivity extends AppCompatActivity {
    private EditText item_name;
    private EditText item_description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor);
        item_name = (EditText) findViewById(R.id.item_name);
        item_description = (EditText) findViewById(R.id.item_description);

        String item = item_name.getText().toString();
        String description = item_description.getText().toString();


    }
}

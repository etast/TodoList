package com.codepath.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {
    int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        pos = getIntent().getIntExtra("pos", 0);
        String itemTxt = getIntent().getStringExtra("itemTxt");
        EditText etEditItem = (EditText) findViewById(R.id.etEditItem);
        etEditItem.setText(itemTxt);
    }

    public void onSubmit(View v) {
        EditText etEditItem = (EditText) findViewById(R.id.etEditItem);
        Intent data = new Intent();
        data.putExtra("pos", pos);
        data.putExtra("itemTxt", etEditItem.getText().toString());
        setResult(RESULT_OK, data);
        finish();
    }
}

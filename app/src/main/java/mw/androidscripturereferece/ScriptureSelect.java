package mw.androidscripturereferece;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ScriptureSelect extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.mw.ScriptureSelect.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scripture_select);
    }

    public void share(View view) {
        Intent intent = new Intent(this, Display.class);
        EditText book = (EditText) findViewById(R.id.book);
        EditText chapter = (EditText) findViewById(R.id.chapter);
        EditText verse = (EditText) findViewById(R.id.verse);
        String reference = "Your favorite scripture is: " + book.getText().toString() + " " + chapter.getText().toString() + ":" + verse.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, reference);
        startActivity(intent);
    }
}

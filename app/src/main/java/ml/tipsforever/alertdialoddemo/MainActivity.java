package ml.tipsforever.alertdialoddemo;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    TextView textView;
    Typeface typeface;
    AlertDialog.Builder alert ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textShowId);
        button = findViewById(R.id.showId);
        button.setOnClickListener(this);

        typeface = Typeface.createFromAsset(getAssets(),"atma_regular.ttf");
        textView.setTypeface(typeface);

    }

    @Override
    public void onClick(View view) {
        alert = new AlertDialog.Builder(MainActivity.this);
        alert.setTitle("Warning !!");
        alert.setMessage("Are you sure");
        alert.setCancelable(false);
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
               finish();
            }
        });
        alert.show();
    }
}

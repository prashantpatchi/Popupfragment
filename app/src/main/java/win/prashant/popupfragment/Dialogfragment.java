package win.prashant.popupfragment;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Dialogfragment extends AppCompatActivity {
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogfragment);
        btn = findViewById(R.id.btnDialog);
    }

    public void  ShowDialog(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setCancelable(false);
        builder.setTitle("Quiz");
        builder.setMessage("Who are you  ");

        builder.setPositiveButton("I am Teacher ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Ok go and teach Student ",Toast.LENGTH_LONG).show();


            }
        })

        .setNegativeButton("I am fool  ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Go to jungle  ",Toast.LENGTH_LONG).show();

            }
        })

        .setNeutralButton("I am Student  ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"ok go to school  ",Toast.LENGTH_LONG).show();
                /*TextView toastMessage = findViewById(android.R.id.message);
                toastMessage.setTextSize(25);
                toastMessage.setTextColor(Color.RED);
               // toastMessage.setCompoundDrawablesRelativeWithIntrinsicBounds(R.mipmap.ic_launcher_round,0,0,0);
                toastMessage.setGravity(Gravity.CENTER);
                toastMessage.setCompoundDrawablePadding(16);
                toastMessage.setBackgroundColor(Color.CYAN);*/
            }
        });

        // create alert dialog button and retirn it
        builder.create().show();
    }
   /* LayoutInflater inflater = getLayoutInflater();
    View layout = inflater.inflate(R.layout.custom_toast,(ViewGroup)findViewById(R.id.custom_toast_layout_id);

    TextView text = layout.findViewById(R.id.text);

    Toast toast = new Toast(getApplicationContext());
    toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
    toast.setDuration*/
}

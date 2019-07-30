package omda.com.dialogapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Test a code from stackoverflow
        final AlertDialog.Builder builder;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            builder = new AlertDialog.Builder(this, android.R.style.Theme_Material_Dialog_Alert);
        } else {
            builder = new AlertDialog.Builder(this);
        }
         builder.setTitle("System Update")
                .setMessage("A new version will be installed")
                .setPositiveButton(R.string.Ok_msg_dilaog, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast toast = Toast.makeText(getApplicationContext(),"Upgrading", Toast.LENGTH_LONG);
                        toast.show();
                    }
                })
                .show();
    }

    //Start a service
    public void startService(View view){
        Intent intent1 = new Intent(MainActivity.this, MyService.class);
        startService(intent1);
    }

    //Stop a service
   public void stopService(View view){
        Intent intent2 = new Intent(MainActivity.this, MyService.class );
        stopService(intent2);
   }

}

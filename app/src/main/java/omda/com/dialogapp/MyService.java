package omda.com.dialogapp;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class MyService extends Service {

    @Override
    public void onCreate() {
    for (int i = 0; i < 4; i++) {
        Toast.makeText(MyService.this, "onCreate() " + (i+1) +" %", Toast.LENGTH_LONG).show();
    }
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(MyService.this, "onStartCommand()", Toast.LENGTH_LONG).show();
        return super.onStartCommand(intent, flags, startId);

    }

    public IBinder onBind(Intent intent){
        Toast.makeText(MyService.this, "onBind()", Toast.LENGTH_LONG).show();
        return null;
    }

    public void onDestroy() {
        Toast.makeText(MyService.this, "onDestroy()", Toast.LENGTH_LONG).show();
         super.onDestroy();
    }


}

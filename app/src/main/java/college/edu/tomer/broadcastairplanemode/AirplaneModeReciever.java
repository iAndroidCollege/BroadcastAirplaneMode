package college.edu.tomer.broadcastairplanemode;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import java.util.Set;

public class AirplaneModeReciever extends BroadcastReceiver {
    public AirplaneModeReciever() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        boolean state = intent.getBooleanExtra("state", false);

        if (state)
            System.out.println("Entered Airplane Mode!");
        else
            System.out.println("Exited Airplane Mode.");
    }

    // an Intent broadcast.
    //Read all keys and values from an intent.
    void readBundle(Intent intent){
        Bundle b = intent.getExtras();
        Set<String> keys = b.keySet();

        for (String key : keys) {
            System.out.println("key: "+ key + " : value: " + b.get(key));
        }
    }
}

package college.edu.tomer.broadcastairplanemode;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class DailyServerDownloadReciever extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        //The only code that needs to be in a broadcast reliever is to open the service
        Intent dailyServiceIntent = new Intent(context, DailyUpdateService.class);
        context.startService(dailyServiceIntent);
    }
}

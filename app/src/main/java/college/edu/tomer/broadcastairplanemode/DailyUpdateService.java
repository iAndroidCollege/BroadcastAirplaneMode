package college.edu.tomer.broadcastairplanemode;

import android.app.IntentService;
import android.app.Notification;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

public class DailyUpdateService extends IntentService {
    public DailyUpdateService() {
        super("DailyUpdateService");
    }


    @Override
    protected void onHandleIntent(Intent intent) {
        //download stuff from the web...
        //if needed raise a notification

        raiseNotification();
    }

    private void raiseNotification() {

        NotificationCompat.Builder builder  = new NotificationCompat.Builder(this);
        builder.setContentTitle("Daily Download").
                setContentText("This is your daily update")
                .setSmallIcon(R.mipmap.ic_launcher);

        Notification notification = builder.build();

        NotificationManagerCompat.from(this).notify(0, notification);
        //Do this from a service Instead! don't do it from here.


    }
}

package random.projects.startreksoundboard;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends Activity {

    private static final String TAG = "MyActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button engage = findViewById(R.id.engage);
        final Button borg1 = findViewById(R.id.borg1);
        final MediaPlayer mediaPlayerEngage = MediaPlayer.create(getApplicationContext(), R.raw.engage);
        final MediaPlayer mediaPlayerBorg1 = MediaPlayer.create(getApplicationContext(), R.raw.borg1);
        engage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int audioSessionId = mediaPlayerEngage.getAudioSessionId();


                System.out.println("sessionId" + audioSessionId);
                int duration = mediaPlayerEngage.getDuration();

                if (mediaPlayerEngage.isPlaying()) {
                    System.out.println("media player is playing");
                    return;
                }
                mediaPlayerEngage.start();
                System.out.println("duration track: " + duration);
            }
        });

        borg1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int audioSessionId = mediaPlayerBorg1.getAudioSessionId();


                System.out.println("sessionId" + audioSessionId);
                int duration = mediaPlayerBorg1.getDuration();

                if (mediaPlayerBorg1.isPlaying()) {
                    System.out.println("media player is playing");
                    return;
                }
                mediaPlayerBorg1.start();
                System.out.println("duration track: " + duration);

            }
        });
    }
}

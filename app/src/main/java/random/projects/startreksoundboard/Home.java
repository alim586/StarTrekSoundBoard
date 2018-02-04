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

        engage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                //sound snippet from http://www.trekcore.com/audio/
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.warpcorebreachsoonerthanyouthink_ep);

                int audioSessionId = mediaPlayer.getAudioSessionId();


                System.out.println("sessionId"+audioSessionId);
                int duration = mediaPlayer.getDuration();

                if (mediaPlayer.isPlaying()) {
                    System.out.println("media player is playing");
                    mediaPlayer.reset();
                    return;
                }
                mediaPlayer.start();
                System.out.println("duration track: " + duration);

            }
        });
    }
}

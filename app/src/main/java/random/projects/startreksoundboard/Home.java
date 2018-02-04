package random.projects.startreksoundboard;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class Home extends Activity {

    private static final String TAG = "MyActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button engage = findViewById(R.id.engage);
        final Button borg1 = findViewById(R.id.borg1);
        final Button kill = findViewById(R.id.kill);
        final Button scorpion = findViewById(R.id.scorpion);
        final Button warpcorebreach = findViewById(R.id.warpcorebreach);
        final MediaPlayer mediaPlayerEngage = MediaPlayer.create(getApplicationContext(), R.raw.engage);
        final MediaPlayer mediaPlayerBorg1 = MediaPlayer.create(getApplicationContext(), R.raw.borg1);
        final MediaPlayer mediaPlayerScorpion = MediaPlayer.create(getApplicationContext(), R.raw.scorpionnfox);
        final MediaPlayer mediaPlayerWarpcorebreach = MediaPlayer.create(getApplicationContext(), R.raw.warpcorebreachsoonerthanyouthink_ep);


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

        scorpion.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int audioSessionId = mediaPlayerScorpion.getAudioSessionId();


                System.out.println("sessionId" + audioSessionId);
                int duration = mediaPlayerEngage.getDuration();

                if (mediaPlayerScorpion.isPlaying()) {
                    System.out.println("media player is playing");
                    return;
                }
                mediaPlayerScorpion.start();
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

        warpcorebreach.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int audioSessionId = mediaPlayerWarpcorebreach.getAudioSessionId();


                System.out.println("sessionId" + audioSessionId);
                int duration = mediaPlayerWarpcorebreach.getDuration();

                if (mediaPlayerWarpcorebreach.isPlaying()) {
                    System.out.println("media player is playing");
                    return;
                }
                mediaPlayerWarpcorebreach.start();
                System.out.println("duration track: " + duration);
            }
        });
        kill.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (mediaPlayerEngage.isPlaying()) {
                    mediaPlayerEngage.pause();
                    mediaPlayerEngage.seekTo(0);
                }
                if (mediaPlayerBorg1.isPlaying()) {
                    mediaPlayerBorg1.pause();
                    mediaPlayerBorg1.seekTo(0);
                }
                if (mediaPlayerScorpion.isPlaying()) {
                    mediaPlayerScorpion.pause();
                    mediaPlayerScorpion.seekTo(0);
                }
                if (mediaPlayerWarpcorebreach.isPlaying()) {
                    mediaPlayerWarpcorebreach.pause();
                    mediaPlayerWarpcorebreach.seekTo(0);
                }
            }
        });
    }
}

package id.co.helloapps2;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class sahabat extends AppCompatActivity {
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sahabat);

        videoView = findViewById(R.id.bobview);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.trailer;
        Uri videoUri = Uri.parse(videoPath);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.setVideoURI(videoUri);
        videoView.start();
    }
}
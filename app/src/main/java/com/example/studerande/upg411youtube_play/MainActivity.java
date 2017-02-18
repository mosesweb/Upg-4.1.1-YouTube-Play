package com.example.studerande.upg411youtube_play;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public String[] youtubeurl = new String[]{"https://www.youtube.com/watch?v=FNPR2hzJHxM",
            "https://www.youtube.com/watch?v=dM3IOE2keWI","https://www.youtube.com/watch?v=cU8HrO7XuiE"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button vid_button = (Button) findViewById(R.id.button);

        vid_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(youtubeurl[0])));
                Log.i("Video", "Video Playing....");

            }
        });

        Button vid_button2 = (Button) findViewById(R.id.button2);

        vid_button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(youtubeurl[1])));
                Log.i("Video", "Video Playing....");

            }
        });

        Button vid_button3 = (Button) findViewById(R.id.vid_button3);

        vid_button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(youtubeurl[2])));
                Log.i("Video", "Video Playing....");

            }
        });
    }
}

package org.inc.calc1.myapplication;

import android.app.DownloadManager;
import android.app.VoiceInteractor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class MainActivity extends AppCompatActivity {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                DownloadManager d;  //creating an object
                String url="http://www.tournand.com/guillaume/project_cs_guide/counter-strike_strategy_guide.pdf";
                d= (DownloadManager)getSystemService(DOWNLOAD_SERVICE); //intialization
                DownloadManager.Request r=new DownloadManager.Request(Uri.parse(url))
                        .setTitle("Counter Strike")
                        .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                //declaraing the request object along with varioues customisations

                //you can add various properties in subsequest lines
                d.enqueue(r);

            }
        });
    }
}

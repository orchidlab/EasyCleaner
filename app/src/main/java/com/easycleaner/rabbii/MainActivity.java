package com.easycleaner.rabbii;

import android.content.Context;
import android.os.Handler;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.io.File;

public class MainActivity extends AppCompatActivity
{

    boolean doubleBackToExitPressedOnce = false;

    InterstitialAd mInterstitialAd;
    private static final float ROTATE_FROM = 0.0f;
    private static final float ROTATE_TO = 10.0f * 360.0f;

    private  TextView maintv;
    private Handler handler2 = new Handler();
    private ProgressBar  progressBar2;
    private int ProgressStutus =0;
    public Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-0954165513199363/6815191589");

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed()
            {
                requestNewInterstitial();

            }
        });

        requestNewInterstitial();

        maintv = (TextView) findViewById(R.id.maintv);
        progressBar2=(ProgressBar) findViewById(R.id.myProgressBar2);

        MobileAds.initialize(getApplicationContext(), "ca-app-pub-3940256099942544~3347511713");

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        ImageButton btnimg1 = (ImageButton) findViewById(R.id.btnjunk);
        ImageButton btnimg2 = (ImageButton) findViewById(R.id.btnram);
        ImageButton btnimg3 = (ImageButton) findViewById(R.id.btnboost);
        ImageButton btnimg4 = (ImageButton) findViewById(R.id.btnmemory);




        btnimg1.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                progressing();

                ImageView image = (ImageView) findViewById(R.id.img1);
                ImageView image2 = (ImageView) findViewById(R.id.img2);
                ImageView image3 = (ImageView) findViewById(R.id.img3);


                RotateAnimation r = new RotateAnimation(ROTATE_FROM, ROTATE_TO, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                r.setDuration((long) 2*1500);
                r.setRepeatCount(2);
                r.setFillAfter(true);





                RotateAnimation r2 = new RotateAnimation(ROTATE_FROM, ROTATE_TO, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                r2.setDuration((long) 1*1500);
                r2.setRepeatCount(2);
                r2.setFillAfter(true);

                RotateAnimation r3 = new RotateAnimation(ROTATE_FROM, ROTATE_TO, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                r3.setDuration((long) 2*1500);
                r3.setRepeatCount(1);
                r3.setFillAfter(true);



                image.startAnimation(r);
                image2.startAnimation(r2);
                image3.startAnimation(r3);



            }

        });

        btnimg2.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                progressing();
                ImageView image = (ImageView) findViewById(R.id.img1);
                ImageView image2 = (ImageView) findViewById(R.id.img2);
                ImageView image3 = (ImageView) findViewById(R.id.img3);


                RotateAnimation r = new RotateAnimation(ROTATE_FROM, ROTATE_TO, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                r.setDuration((long) 2*1500);
                r.setRepeatCount(1);
                r.setFillAfter(true);

                RotateAnimation r2 = new RotateAnimation(ROTATE_FROM, ROTATE_TO, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                r2.setDuration((long) 2*1500);
                r2.setRepeatCount(2);
                r2.setFillAfter(true);

                RotateAnimation r3 = new RotateAnimation(ROTATE_FROM, ROTATE_TO, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                r3.setDuration((long) 1*1500);
                r3.setRepeatCount(2);
                r3.setFillAfter(true);

                image.startAnimation(r);
                image2.startAnimation(r2);
                image3.startAnimation(r3);

            }
        });

        btnimg3.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                progressing();
                ImageView image = (ImageView) findViewById(R.id.img1);
                ImageView image2 = (ImageView) findViewById(R.id.img2);
                ImageView image3 = (ImageView) findViewById(R.id.img3);




                RotateAnimation r = new RotateAnimation(ROTATE_FROM, ROTATE_TO, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                r.setDuration((long) 2*1500);
                r.setRepeatCount(2);
                r.setFillAfter(true);

                RotateAnimation r2 = new RotateAnimation(ROTATE_FROM, ROTATE_TO, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                r2.setDuration((long) 1*1500);
                r2.setRepeatCount(2);
                r2.setFillAfter(true);

                RotateAnimation r3 = new RotateAnimation(ROTATE_FROM, ROTATE_TO, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                r3.setDuration((long) 2*1500);
                r3.setRepeatCount(1);
                r3.setFillAfter(true);

                image.startAnimation(r);
                image2.startAnimation(r2);
                image3.startAnimation(r3);


            }
        });


        btnimg4.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                progressing();
                ImageView image = (ImageView) findViewById(R.id.img1);
                ImageView image2 = (ImageView) findViewById(R.id.img2);
                ImageView image3 = (ImageView) findViewById(R.id.img3);



                RotateAnimation r = new RotateAnimation(ROTATE_FROM, ROTATE_TO, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                r.setDuration((long) 2*1500);
                r.setRepeatCount(2);
                r.setFillAfter(true);

                RotateAnimation r2 = new RotateAnimation(ROTATE_FROM, ROTATE_TO, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                r2.setDuration((long) 2*1500);
                r2.setRepeatCount(1);
                r2.setFillAfter(true);

                RotateAnimation r3 = new RotateAnimation(ROTATE_FROM, ROTATE_TO, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                r3.setDuration((long) 1*1500);
                r3.setRepeatCount(2);
                r3.setFillAfter(true);

                image.startAnimation(r);
                image2.startAnimation(r2);
                image3.startAnimation(r3);



            }
        });



    }
    private void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("99B9F6D0B7FAF8583BD7CF437F9CD510")
                .build();

        mInterstitialAd.loadAd(adRequest);
    }

    // Progress Bar Mathod
    public void progressing()
    {
        ProgressStutus = 0;
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                while (ProgressStutus<100)
                {
                    ProgressStutus +=1;
                    handler2.post(new Runnable()
                    {
                        @Override
                        public void run()
                        {
                            progressBar2.setProgress(ProgressStutus);
                            maintv.setText(ProgressStutus + "/" + progressBar2.getMax());

                            if (ProgressStutus==100)
                            {



                                    maintv.setText("Done");
                                    ctoast();
                                vibrating();
                                deleteCache();

                            }
                        }
                    });
                    try
                    {
                        Thread.sleep(100);
                    }catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }

        }).start();
    }

    public void ctoast()
    {

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast_container,
                (ViewGroup) findViewById(R.id.custom_toast_container));

        TextView text = (TextView) layout.findViewById(R.id.text);
        text.setText("100% Completed");

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }

    @Override
    public void onBackPressed()
    {
        if (doubleBackToExitPressedOnce)
        {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        if (mInterstitialAd.isLoaded())
        {
            mInterstitialAd.show();
        }

        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable()
        {

            @Override
            public void run()
            {
                doubleBackToExitPressedOnce=false;
            }
        }, 20000);
    }

    public void vibrating()
    {
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

// Vibrate for 400 milliseconds
        v.vibrate(400);
    }


    public void deleteCache()
    {
        try {
            File dir = context.getCacheDir();
            if (dir != null && dir.isDirectory()) {
                deleteDir(dir);
            }
        } catch (Exception e) {}
    }

    public static boolean deleteDir(File dir)
    {
        if (dir != null && dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }
        return dir.delete();
    }


}

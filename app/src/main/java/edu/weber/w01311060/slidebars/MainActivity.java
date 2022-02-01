package edu.weber.w01311060.slidebars;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements SeekBarFragment.onSeekUpdate
{

    private ResultsFragment resultsFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSeekBarProgress(double progress)
    {
        if(resultsFragment == null)
        {
            FragmentManager fm = getSupportFragmentManager();
            resultsFragment = (ResultsFragment) fm.findFragmentByTag("ResultsFrag");
        }
        resultsFragment.updateResult(progress);
    }
}
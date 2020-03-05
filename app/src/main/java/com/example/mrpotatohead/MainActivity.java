package com.example.mrpotatohead;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    //for check box
    public CheckBox arms;
    public CheckBox shoes;
    public CheckBox ears;
    public CheckBox eyebrows;
    public CheckBox eyes;
    public CheckBox glasses;
    public CheckBox hat;
    public CheckBox mouth;
    public CheckBox mustache;
    public CheckBox nose;
    //for images
    public ImageView im_arms;
    public ImageView im_shoes;
    public ImageView im_ears;
    public ImageView im_eyebrows;
    public ImageView im_eyes;
    public ImageView im_glasses;
    public ImageView im_hat;
    public ImageView im_mouth;
    public ImageView im_mustache;
    public ImageView im_nose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //for image
        im_arms=(ImageView) findViewById(R.id.im_arms);
        im_ears=(ImageView) findViewById(R.id.im_ears);
        im_eyebrows=(ImageView) findViewById(R.id.im_eyebrows);
        im_eyes=(ImageView) findViewById(R.id.im_eyes);
        im_glasses=(ImageView) findViewById(R.id.im_glasses);
        im_hat=(ImageView) findViewById(R.id.im_hat);
        im_mouth=(ImageView) findViewById(R.id.im_mouth);
        im_mustache=(ImageView) findViewById(R.id.im_mustache);
        im_nose=(ImageView) findViewById(R.id.im_nose);
        im_shoes=(ImageView) findViewById(R.id.im_shoes);
        //for box
        arms=(CheckBox)findViewById(R.id.arms);
        ears=(CheckBox)findViewById(R.id.ears);
        eyebrows=(CheckBox)findViewById(R.id.eyebrows);
        eyes=(CheckBox)findViewById(R.id.eyes);
        glasses=(CheckBox)findViewById(R.id.glasses);
        hat=(CheckBox)findViewById(R.id.hat);
        mouth=(CheckBox)findViewById(R.id.mouth);
        mustache=(CheckBox)findViewById(R.id.mustache);
        nose=(CheckBox)findViewById(R.id.nose);
        shoes=(CheckBox)findViewById(R.id.shoes);

        arms.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if(isChecked){
                    im_arms.setVisibility(View.VISIBLE);
                }else{
                    im_arms.setVisibility(View.INVISIBLE);
                }
            }
        });
        ears.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if(isChecked){
                    im_ears.setVisibility(View.VISIBLE);
                }else{
                    im_ears.setVisibility(View.INVISIBLE);
                }
            }
        });
        eyebrows.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if(isChecked){
                    im_eyebrows.setVisibility(View.VISIBLE);
                }else{
                    im_eyebrows.setVisibility(View.INVISIBLE);
                }
            }
        });
        eyes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if(isChecked){
                    im_eyes.setVisibility(View.VISIBLE);
                }else{
                    im_eyes.setVisibility(View.INVISIBLE);
                }
            }
        });
        glasses.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if(isChecked){
                    im_glasses.setVisibility(View.VISIBLE);
                }else{
                    im_glasses.setVisibility(View.INVISIBLE);
                }
            }
        });
        hat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if(isChecked){
                    im_hat.setVisibility(View.VISIBLE);
                }else{
                    im_hat.setVisibility(View.INVISIBLE);
                }
            }
        });
        mouth.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if(isChecked){
                    im_mouth.setVisibility(View.VISIBLE);
                }else{
                    im_mouth.setVisibility(View.INVISIBLE);
                }
            }
        });
        mustache.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if(isChecked){
                    im_mustache.setVisibility(View.VISIBLE);
                }else{
                    im_mustache.setVisibility(View.INVISIBLE);
                }
            }
        });
        nose.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if(isChecked){
                    im_nose.setVisibility(View.VISIBLE);
                }else{
                    im_nose.setVisibility(View.INVISIBLE);
                }
            }
        });
        shoes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if(isChecked){
                    im_shoes.setVisibility(View.VISIBLE);
                }else{
                    im_shoes.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}

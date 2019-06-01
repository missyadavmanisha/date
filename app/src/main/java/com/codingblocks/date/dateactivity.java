package com.codingblocks.date;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Date;


public class FoodFeedbackActivity extends AppCompatActivity {


    RatingBar ratingBar;

    CardView feedback;
    String description="";
    float rating;

    TextView question;
    Button q1,q2,q3,q4,q5;
    boolean p1=false;
    boolean p2=false;
    boolean p3=false;
    boolean p4=false;
    boolean p5=false;
    Button submit;
    SharedPreferences sharedPreferences;
    int pgNumber;


    FirebaseUser firebaseUser;
    DatabaseReference databaseReference;
    FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.foodfeedback);
        sharedPreferences = getSharedPreferences("PG",Context.MODE_PRIVATE);
        pgNumber = sharedPreferences.getInt("PGNumber", 1);


        feedback=findViewById(R.id.feedbackfood);
        ratingBar=findViewById(R.id.ratingBarfood);
        question=findViewById(R.id.fquestion);

        q1=findViewById(R.id.fq1);
        q2=findViewById(R.id.fq2);
        q3=findViewById(R.id.fq3);
        q4=findViewById(R.id.fq4);
        q5=findViewById(R.id.fq5);

        submit=findViewById(R.id.fsubmit);

        feedback.setVisibility(View.GONE);

        databaseReference = firebaseDatabase.getReference("PG/" + FirebaseAuth.getInstance().getCurrentUser().getUid() + "/PG" + pgNumber);


        if(ratingBar.getRating()>=4 && ratingBar.getRating()<5){
            rating=ratingBar.getRating();

            question.setText("Why isn't it awesome ?");
            q1.setText("Unhealthy");
            q2.setText("Unhyginic");
            q3.setText("Cold & Stale");
            q4.setText("Bad srevers");
            q5.setText("Reapeted Menu");


            feedback.setVisibility(View.VISIBLE);
            q1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!p1){
                        q1.setBackgroundColor(getResources().getColor(R.color.pink));
                        p1=true;
                        description+=(q1.getText().toString()+"");
                    }
                    else{
                        q1.setBackgroundColor(getResources().getColor(R.color.lightgray));
                        p1=false;
                    }
                }
            });

            q2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!p2){
                        q2.setBackgroundColor(getResources().getColor(R.color.pink));
                        p2=true;
                        description+=(q2.getText().toString()+"");
                    }
                    else{
                        q2.setBackgroundColor(getResources().getColor(R.color.lightgray));
                        p2=false;
                    }
                }
            });
            q3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!p3){
                        q3.setBackgroundColor(getResources().getColor(R.color.pink));
                        description+=(q3.getText().toString()+"");
                        p3=true;
                    }
                    else{
                        q3.setBackgroundColor(getResources().getColor(R.color.lightgray));
                        p3=false;
                    }
                }
            });

            q4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!p4){
                        q4.setBackgroundColor(getResources().getColor(R.color.pink));
                        description+=(q4.getText().toString()+"");
                        p4=true;
                    }
                    else{
                        q4.setBackgroundColor(getResources().getColor(R.color.lightgray));
                        p4=false;
                    }
                }
            });

            q5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!p5){
                        q5.setBackgroundColor(getResources().getColor(R.color.pink));
                        description+=(q5.getText().toString()+"");
                        p5=true;
                    }
                    else{
                        q5.setBackgroundColor(getResources().getColor(R.color.lightgray));
                        p5=false;
                    }
                }
            });
        }
        if(ratingBar.getRating()>=3 && ratingBar.getRating()<4){
            rating =ratingBar.getRating();

            question.setText("Why isn't it good ?");
            q1.setText("Unhealthy");
            q2.setText("Unhyginic");
            q3.setText("Cold & Stale");
            q4.setText("Bad srevers");
            q5.setText("Reapeted Menu");


            feedback.setVisibility(View.VISIBLE);
            q1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!p1){
                        q1.setBackgroundColor(getResources().getColor(R.color.pink));
                        description+=(q1.getText().toString()+"");
                        p1=true;
                    }
                    else{
                        q1.setBackgroundColor(getResources().getColor(R.color.lightgray));
                        p1=false;
                    }
                }
            });

            q2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!p2){
                        q2.setBackgroundColor(getResources().getColor(R.color.pink));
                        description+=(q2.getText().toString()+"");
                        p2=true;
                    }
                    else{
                        q2.setBackgroundColor(getResources().getColor(R.color.lightgray));
                        p2=false;
                    }
                }
            });
            q3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!p3){
                        q3.setBackgroundColor(getResources().getColor(R.color.pink));
                        description+=(q3.getText().toString()+"");
                        p3=true;
                    }
                    else{
                        q3.setBackgroundColor(getResources().getColor(R.color.lightgray));
                        p3=false;
                    }
                }
            });

            q4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!p4){
                        q4.setBackgroundColor(getResources().getColor(R.color.pink));
                        description+=(q4.getText().toString()+" ");
                        p4=true;
                    }
                    else{
                        q4.setBackgroundColor(getResources().getColor(R.color.lightgray));
                        p4=false;
                    }
                }
            });

            q5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!p5){
                        q5.setBackgroundColor(getResources().getColor(R.color.pink));
                        description+=(q5.getText().toString()+"");
                        p5=true;
                    }
                    else{
                        q5.setBackgroundColor(getResources().getColor(R.color.lightgray));
                        p5=false;
                    }
                }
            });

            feedback.setVisibility(View.VISIBLE);
        }
        if(ratingBar.getRating()>=2 && ratingBar.getRating()<3){
            rating=ratingBar.getRating();

            question.setText("Why it is bad ?");
            q1.setText("Unhealthy");
            q2.setText("Unhyginic");
            q3.setText("Cold & Stale");
            q4.setText("Bad srevers");
            q5.setText("Reapeted Menu");


            feedback.setVisibility(View.VISIBLE);
            q1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!p1){
                        q1.setBackgroundColor(getResources().getColor(R.color.pink));
                        description+=(q1.getText().toString()+"");
                        p1=true;
                    }
                    else{
                        q1.setBackgroundColor(getResources().getColor(R.color.lightgray));
                        p1=false;
                    }
                }
            });

            q2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!p2){
                        q2.setBackgroundColor(getResources().getColor(R.color.pink));
                        description+=(q2.getText().toString()+"");
                        p2=true;
                    }
                    else{
                        q2.setBackgroundColor(getResources().getColor(R.color.lightgray));
                        p2=false;
                    }
                }
            });
            q3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!p3){
                        q3.setBackgroundColor(getResources().getColor(R.color.pink));
                        description+=(q3.getText().toString()+"");
                        p3=true;
                    }
                    else{
                        q3.setBackgroundColor(getResources().getColor(R.color.lightgray));
                        p3=false;
                    }
                }
            });

            q4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!p4){
                        q4.setBackgroundColor(getResources().getColor(R.color.pink));
                        description+=(q4.getText().toString()+"");
                        p4=true;
                    }
                    else{
                        q4.setBackgroundColor(getResources().getColor(R.color.lightgray));
                        p4=false;
                    }
                }
            });

            q5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!p5){
                        q5.setBackgroundColor(getResources().getColor(R.color.pink));
                        description+=(q5.getText().toString()+"");
                        p5=true;
                    }
                    else{
                        q5.setBackgroundColor(getResources().getColor(R.color.lightgray));
                        p5=false;
                    }
                }
            });

            feedback.setVisibility(View.VISIBLE);
        }
        if(ratingBar.getRating()>0 && ratingBar.getRating()<2){
            rating=ratingBar.getRating();

            question.setText("Why it is so bad ?");
            q1.setText("Unhealthy");
            q2.setText("Unhyginic");
            q3.setText("Cold & Stale");
            q4.setText("Bad srevers");
            q5.setText("Reapeted Menu");


            feedback.setVisibility(View.VISIBLE);
            q1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!p1){
                        q1.setBackgroundColor(getResources().getColor(R.color.pink));
                        description+=(q1.getText().toString()+"");
                        p1=true;
                    }
                    else{
                        q1.setBackgroundColor(getResources().getColor(R.color.lightgray));
                        p1=false;
                    }
                }
            });

            q2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!p2){
                        q2.setBackgroundColor(getResources().getColor(R.color.pink));
                        description+=(q2.getText().toString()+"");
                        p2=true;
                    }
                    else{
                        q2.setBackgroundColor(getResources().getColor(R.color.lightgray));
                        p2=false;
                    }
                }
            });
            q3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!p3){
                        q3.setBackgroundColor(getResources().getColor(R.color.pink));
                        description+=(q3.getText().toString()+"");
                        p3=true;
                    }
                    else{
                        q3.setBackgroundColor(getResources().getColor(R.color.lightgray));
                        p3=false;
                    }
                }
            });

            q4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!p4){
                        q4.setBackgroundColor(getResources().getColor(R.color.pink));

                        description+=(q4.getText().toString()+"");
                        p4=true;
                    }
                    else{
                        q4.setBackgroundColor(getResources().getColor(R.color.lightgray));
                        p4=false;
                    }
                }
            });

            q5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!p5){
                        q5.setBackgroundColor(getResources().getColor(R.color.pink));
                        description+=(q5.getText().toString()+"");
                        p5=true;
                    }
                    else{
                        q5.setBackgroundColor(getResources().getColor(R.color.lightgray));
                        p5=false;
                    }
                }
            });
            feedback.setVisibility(View.VISIBLE);
        }
        if(ratingBar.getRating()==0){
            rating=ratingBar.getRating();
            feedback.setVisibility(View.GONE);
        }
        if(ratingBar.getRating()==5){
            rating=ratingBar.getRating();

            question.setText("What did you like ?");
            q1.setText("Nutritious");
            q2.setText("Hygine");
            q3.setText("Fresh & Hot");
            q4.setText("Variety of Menu");
            q5.setText("Unlimited Quantity");


            feedback.setVisibility(View.VISIBLE);

            q1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!p1){
                        q1.setBackgroundColor(getResources().getColor(R.color.pink));
                        description+=(q1.getText().toString()+"");
                        p1=true;
                    }
                    else{
                        q1.setBackgroundColor(getResources().getColor(R.color.lightgray));
                        p1=false;
                    }
                }
            });

            q2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!p2){
                        q2.setBackgroundColor(getResources().getColor(R.color.pink));
                        description+=(q2.getText().toString()+"");
                        p2=true;
                    }
                    else{
                        q2.setBackgroundColor(getResources().getColor(R.color.lightgray));
                        p2=false;
                    }
                }
            });
            q3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!p3){
                        q3.setBackgroundColor(getResources().getColor(R.color.pink));
                        description+=(q3.getText().toString()+"");
                        p3=true;
                    }
                    else{
                        q3.setBackgroundColor(getResources().getColor(R.color.lightgray));
                        p3=false;
                    }
                }
            });

            q4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!p4){
                        q4.setBackgroundColor(getResources().getColor(R.color.pink));
                        description+=(q4.getText().toString()+"");
                        p4=true;
                    }
                    else{
                        q4.setBackgroundColor(getResources().getColor(R.color.lightgray));
                        p4=false;
                    }
                }
            });

            q5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!p5){
                        q5.setBackgroundColor(getResources().getColor(R.color.pink));
                        description+=(q5.getText().toString()+"");
                        p5=true;
                    }
                    else{
                        q5.setBackgroundColor(getResources().getColor(R.color.lightgray));
                        p5=false;
                    }
                }
            });

        }
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Date date = new Date();

                String key = databaseReference.push().getKey();

                FeedbackDetails feedbackDetails = new FeedbackDetails(rating, description, key, date);
                databaseReference.child("Feedback").child("TenantFeedback").child("Food").child(key).setValue(feedbackDetails).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        Toast.makeText(FoodFeedbackActivity.this, "Feedback Sent", Toast.LENGTH_SHORT).show();
                    }
                });


            }
        });
    }

}
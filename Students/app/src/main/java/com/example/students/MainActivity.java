package com.example.students;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        ArrayList<Student> students = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Student s1 = new Student("فتو كعب تندوري", 14 , 12 , R.drawable.image1);
        Student s2 = new Student("تماضر دعوجي", 13 , 10 , R.drawable.image2);
        Student s3 = new Student("زكيه حسنين افندم", 15 , 11 , R.drawable.image3);
        Student s4 = new Student("صفيه سراج زلطه", 14 , 12 , R.drawable.image4);
        Student s5 = new Student("درويشه ابهام", 13 , 10 , R.drawable.image5);
        Student s6 = new Student("نزيريه نشأت كرمله", 15 , 11 , R.drawable.image6);
    }
}
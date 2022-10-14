package com.dummies.bio;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.dummies.bio.databinding.ActivityMainBinding;
import com.dummies.bio.data.Bio;
public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;
    private final Bio bio = new  Bio();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
         activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
         bio.setName("aashish khatiwada");
         activityMainBinding.setBio(bio);
        /*enterHobbeys = (EditText)findViewById(R.id.enter_hobbeys);
        hobbeys =(TextView)findViewById(R.id.hobbeys);
        Button button =  (Button)findViewById(R.id.button_add_hobbeys);
 button.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         hobbeys.setText(enterHobbeys.getText().toString().trim());

     }
 });*/
        activityMainBinding.buttonAddHobbeys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager inputMethodManager = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                inputMethodManager.hideSoftInputFromWindow(v.getWindowToken(), 0);


bio.setHobbeys(activityMainBinding.enterHobbeys.getText().toString().trim());
activityMainBinding.hobbeys.setText(bio.getHobbeys());

                activityMainBinding.hobbeys.setVisibility(View.VISIBLE);
                activityMainBinding.invalidateAll();
        }});
    }
}

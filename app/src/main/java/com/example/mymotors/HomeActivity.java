package com.example.mymotors;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.example.mymotors.ImagePagerAdapter;
import com.example.mymotors.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Находим ViewPager в макете и устанавливаем его адаптер
        ViewPager viewPager = findViewById(R.id.view_pager);
        ImagePagerAdapter adapter = new ImagePagerAdapter(this);
        viewPager.setAdapter(adapter);
    }
}

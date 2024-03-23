package com.example.mymotors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ImagePagerAdapter extends PagerAdapter {

    private Context context;
    private int[] images = {R.drawable.fghjk, R.drawable.fghjk, R.drawable.fghjk};
    private String[] texts = {"Это сотрудничество обещает стать важным моментом в истории обеих сторон, а также способствовать дальнейшему развитию автомобильной индустрии и вниманию к здоровью человека.", "В сфере автомобильных новостей сегодня день важных решений и выгодных возможностей для наших клиентов! Мы с радостью объявляем о запуске уникальной акции от Chery", "Программа предоставляетвыгодные условия при покупке трех популярных моделей автомобилей: Hyundai Santa Fe, Sonata и Tucson."};

    public ImagePagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.text_item, container, false);

        ImageView imageView = view.findViewById(R.id.image_view);
        imageView.setImageResource(images[position]);

        TextView textView = view.findViewById(R.id.text_view);
        textView.setText(texts[position]);

        Button button = view.findViewById(R.id.button);
        // Установка обработчика нажатия на кнопку
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Обработка нажатия на кнопку
            }
        });

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }
}

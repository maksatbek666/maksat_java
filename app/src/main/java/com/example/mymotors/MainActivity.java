package com.example.mymotors;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText phoneEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Находим View элементы по их ID
        phoneEditText = findViewById(R.id.editTextPhone);
        passwordEditText = findViewById(R.id.editTextTextPassword);
        Button loginButton = findViewById(R.id.button);

        // Устанавливаем слушатель для кнопки "Войти"
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login(); // Вызываем метод для обработки попытки входа
            }
        });
    }

    // Метод для обработки попытки входа
    private void login() {
        String phone = phoneEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        // Проверяем, что номер телефона равен "0000" и пароль равен "admin"
        if (phone.equals("0000") && password.equals("admin")) {
            // Если условие выполняется, создаем интент для перехода на HomeActivity
            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(intent);
            // Закрываем текущую активити, чтобы при возвращении нельзя было вернуться на экран входа
            finish();
        } else {
            // Если введенные данные не совпадают с заданными значениями, выводим сообщение об ошибке
            Toast.makeText(this, "Неверный номер телефона или пароль", Toast.LENGTH_SHORT).show();
        }
    }

}

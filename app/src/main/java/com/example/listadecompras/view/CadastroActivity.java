package com.example.listadecompras.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.listadecompras.R;
import com.example.listadecompras.repository.UserRepository;
import com.example.listadecompras.repository.UserRepositoryInterface;

public class CadastroActivity extends AppCompatActivity {

    private final String TAG = "LogingActivity";

    private UserRepositoryInterface UserRepositoryInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);



        //captura o botao LAbutton1
        findViewById(R.id.buttonCAcadastrar).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                UserRepositoryInterface.addUser(
                        ((TextView) findViewById(R.id.editTextTextPersonNameCAlogin)).getText().toString(),
                        ((TextView) findViewById(R.id.editTextTextPasswordCAsenha)).getText().toString()


                );
                Log.d(TAG, "adicionado usuário" + UserRepositoryInterface.getUsers());
            }

        });




    }
}
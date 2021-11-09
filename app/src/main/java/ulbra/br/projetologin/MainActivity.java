package ulbra.br.projetologin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtNome, edtSenha;
    Button btnLogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = (EditText) findViewById(R.id.edtNome);
        edtSenha = (EditText) findViewById(R.id.edtSenha);
        btnLogar = (Button) findViewById(R.id.btnLogar);
    }

    public void clicaBotao(View View){
        if (edtNome.getText().toString().equals("Admin") && edtSenha.getText().toString().equals("123"))
            startActivity(new Intent(MainActivity.this, projetoLogin2tela.class));
        else
            Toast.makeText(this, "Usuário ou senha inválida", Toast.LENGTH_SHORT).show();
    }
}
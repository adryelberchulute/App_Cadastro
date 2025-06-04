package com.example.applistacurso;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.example.applistacurso.Controller.CursoController;
import com.example.applistacurso.Controller.PessoaController;
import com.example.applistacurso.Model.Curso;
import com.example.applistacurso.Model.Pessoa;
import com.example.applistacurso.R;

public class MainActivity extends AppCompatActivity {

    private PessoaController pessoaController;
    private CursoController cursoController;
    private EditText editNome, editSobrenome, editTelefone, editCurso;
    private Button btnSalvar, btnFinalizar, btnLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        pessoaController = new PessoaController(this);
        cursoController = new CursoController(this);

        btnSalvar = findViewById(R.id.salvar);
        btnFinalizar = findViewById(R.id.finalizar);
        btnLimpar = findViewById(R.id.limpar);

        editNome = findViewById(R.id.primeiroNome);
        editSobrenome = findViewById(R.id.sobrenome);
        editCurso = findViewById(R.id.curso);
        editTelefone = findViewById(R.id.telefone);

        btnLimpar.setOnClickListener(view -> {
            editNome.setText(" ");
            editSobrenome.setText(" ");
            editCurso.setText(" ");
            editTelefone.setText(" ");

        });

        btnSalvar.setOnClickListener(view -> {
            Pessoa pessoa = new Pessoa (
                    editNome.getText().toString(),
                    editSobrenome.getText().toString(),
                    editTelefone.getText().toString()
            );
            Curso curso = new Curso(editCurso.getText().toString());

            pessoaController.salvarPessoa(pessoa);
            pessoaController.salvar(pessoa);
            pessoaController.toString();
            cursoController.salvarCurso(curso);
        });

        btnFinalizar.setOnClickListener(view -> finish());
    }
}

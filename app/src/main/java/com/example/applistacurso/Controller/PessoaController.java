package com.example.applistacurso.Controller;

import android.content.Context;
import android.widget.Toast;

import com.example.applistacurso.Model.Pessoa;

public class PessoaController {

    private final Context context;

    public  PessoaController(Context context){
        this.context = context;
    }
    public void salvarPessoa(Pessoa pessoa) {
        Toast.makeText(context, pessoa.toString(), Toast.LENGTH_SHORT).show();
    }
}
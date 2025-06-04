package com.example.applistacurso.Controller;

import android.content.Context;
import android.widget.Toast;

import com.example.applistacurso.Model.Curso;

public class CursoController {

    private final Context context;

    public CursoController(Context context){
        this.context = context;
    }
    public void salvarCurso(Curso curso){
        String mensagem = " Curso salvo" + curso.getNome() + " ";
        Toast.makeText(context, mensagem, Toast.LENGTH_SHORT).show();
    }

}

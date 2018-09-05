package com.diogo.appnotesz.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by android on 28/08/2018.
 */

public class AnotacoesDao {
    public static void inserir(Context contexto, Anotacoes anotacoes) {
        Conexao conn = new Conexao(contexto);
        SQLiteDatabase banco = conn.getWritableDatabase();
        ContentValues valores = new ContentValues();
        valores.put("Titulo", anotacoes.getTitulo());


        banco.insert("anotacoes", null, valores);


    }

}

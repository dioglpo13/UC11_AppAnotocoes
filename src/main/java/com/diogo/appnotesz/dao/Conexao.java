package com.diogo.appnotesz.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by android on 28/08/2018.
 */

public class Conexao extends SQLiteOpenHelper {

    private static final String NOME_BANCO = "AppNotesz";
    private static final int VERSAO_BANCO = 1;

    public Conexao(Context contexto) {
        super(contexto, NOME_BANCO, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS anotacoes (id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, titulo TEXT NOT NULL )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int antiga, int nova) {
        if (antiga == 1 && nova == 2) {
            sqLiteDatabase.execSQL("DROP TABLE produtos");
            onCreate(sqLiteDatabase);


        }
    }

}

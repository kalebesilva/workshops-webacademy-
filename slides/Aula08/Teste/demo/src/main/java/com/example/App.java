package com.example;

import com.example.dao.ConexaoDb;
import com.example.model.Disciplina;
import com.example.operacoes.DisciplinaCRUD;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Disciplina historia = new Disciplina("teste2", "300 horas");

        ConexaoDb conexao = new ConexaoDb();

        DisciplinaCRUD operacoesDeHistoria = new DisciplinaCRUD(conexao.getConnection());
        
        operacoesDeHistoria.create(historia);
    


    }
}

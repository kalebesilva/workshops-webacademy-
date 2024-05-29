package com.example.operacoes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.ioperacoes.Ioperacoes;
import com.example.model.Disciplina;


public class DisciplinaCRUD implements Ioperacoes<Disciplina> {

    private Connection connection;

    

    public DisciplinaCRUD(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Disciplina disciplina) {
        try {
            String sql = "INSERT INTO disciplina (nomeDisciplina, cargaHoraria) VALUES (?, ?)";

            PreparedStatement statement = this.connection.prepareStatement(sql);

            statement.setString(1, disciplina.getNomeDisciplina() );
            statement.setString(2, disciplina.getCargaHoraria());

            statement.executeUpdate();

            System.out.println("Record created.");
            } catch (SQLException e) {
            e.printStackTrace();
            }
    }

}
